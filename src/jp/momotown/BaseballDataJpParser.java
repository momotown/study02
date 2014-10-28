package jp.momotown;

import java.util.ArrayList;
import java.util.List;

import jp.momotown.datasource.PlayerBattingData;
import jp.momotown.datasource.PlayerPitchingData;
import jp.momotown.datasource.TeamBattingData;
import jp.momotown.datasource.TeamPitchingData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.visualization.datasource.datatable.TableCell;
import com.google.visualization.datasource.datatable.TableRow;

public class BaseballDataJpParser {

	private WebDriver webDriver;
	private String baseUrl;

	public BaseballDataJpParser() {

		
	}

	private void setUp() {
		
		webDriver = new FirefoxDriver();
		baseUrl = "http://baseballdata.jp/index.html";
		
	}

	public void parse(String teamName) {
		
		setUp();
		
		webDriver.get(baseUrl);
		
		// �`�[���Ō����т���͂���
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("�`�[���Ō�����")).click();
		List<PlayerBattingData> playerBattingDataList = parseBatting(teamName);
		
		// �`�[�����萬�т���͂���
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("�`�[�����萬��")).click();
		List<PlayerPitchingData> playerPitchingDataList = parsePitching(teamName);
		
		tearDown();
		
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}
	
	public List<PlayerBattingData> parseBatting(String teamName) {
		
		List<PlayerBattingData> playerBattingDataList = new ArrayList<PlayerBattingData>();
		
		// �`�[���Ō����т���͂���
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamBattingParser teamBattingParser = new TeamBattingParser();
		TeamBattingData teamBattingData = teamBattingParser.parse(tableElement);
		
		// �l���т���͂���
		List<TableRow> rows = teamBattingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}

			System.out.println(String.format("%s��<< %s >>���ۗ��ɂ��邼", teamName, name));

			PlayerBattingParser playerBattingParser = new PlayerBattingParser();
			PlayerBattingData playerBattingData = playerBattingParser.parse(link);
			if(null != playerBattingData) {
				playerBattingData.team = teamName;
				playerBattingData.name = name;
				playerBattingDataList.add(playerBattingData);
			}
			
			break; // �Ƃ肠������l����
		}
		
		return playerBattingDataList;
		
	}
	
	public List<PlayerPitchingData> parsePitching(String teamName) {
		
		List<PlayerPitchingData> playerPitchingDataList = new ArrayList<PlayerPitchingData>();
		
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamPitchingParser teamPitchingParser = new TeamPitchingParser();
		TeamPitchingData teamPitchingData = teamPitchingParser.parse(tableElement);
		
		// �l���т���͂���
		List<TableRow> rows = teamPitchingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}
			
			System.out.println(String.format("%s��<< %s >>���ۗ��ɂ��邼", teamName, name));
			
			PlayerPitchingParser playerPitchingParser = new PlayerPitchingParser();
			PlayerPitchingData playerPitchingData = playerPitchingParser.parse(link);
			if(null != playerPitchingData) {
				playerPitchingData.team = teamName;
				playerPitchingData.name = name;
				playerPitchingDataList.add(playerPitchingData);
			}
			
			break; // �Ƃ肠������l����
		}
		
		return playerPitchingDataList;
		
	}

}

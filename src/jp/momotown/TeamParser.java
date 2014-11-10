package jp.momotown;

import java.util.ArrayList;
import java.util.List;

import jp.momotown.datasource.PlayerBattingData;
import jp.momotown.datasource.PlayerPitchingData;
import jp.momotown.datasource.TeamBattingData;
import jp.momotown.datasource.TeamData;
import jp.momotown.datasource.TeamPitchingData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.visualization.datasource.datatable.TableRow;

public class TeamParser {

	private WebDriver webDriver;
	private String baseUrl;

	public TeamParser() {

		
	}

	private void setUp() {
		
		webDriver = new FirefoxDriver();
		baseUrl = "http://baseballdata.jp/index.html";
		
	}

	public TeamData parse(String teamName) {
		
		setUp();
		
		webDriver.get(baseUrl);
		
		TeamData teamData = new TeamData(teamName);
		
		// チーム打撃成績を解析する
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("チーム打撃成績")).click();
		teamData.playerBattingDataList = parsePlayerBatting(teamName);
		
		// チーム投手成績を解析する
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("チーム投手成績")).click();
		teamData.playerPitchingDataList = parsePlayerPitching(teamName);
		
		tearDown();
		
		return teamData;
		
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}
	
	public List<PlayerBattingData> parsePlayerBatting(String teamName) {
		
		List<PlayerBattingData> playerBattingDataList = new ArrayList<PlayerBattingData>();
		
		// チーム打撃成績を解析する
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamBattingParser teamBattingParser = new TeamBattingParser();
		TeamBattingData teamBattingData = teamBattingParser.parse(tableElement);
		
		// 個人打撃成績を解析する
		List<TableRow> rows = teamBattingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}

			System.out.println(String.format("%sの<< %s >>を丸裸にするぞ", teamName, name));

			PlayerBattingParser playerBattingParser = new PlayerBattingParser();
			PlayerBattingData playerBattingData = playerBattingParser.parse(link);
			if(null != playerBattingData) {
				playerBattingData.team = teamName;
				playerBattingData.name = name;
				playerBattingDataList.add(playerBattingData);
			}
			
			break; // とりあえず一人だけ
		}
		
		return playerBattingDataList;
		
	}
	
	public List<PlayerPitchingData> parsePlayerPitching(String teamName) {
		
		List<PlayerPitchingData> playerPitchingDataList = new ArrayList<PlayerPitchingData>();
		
		// チーム投手成績を解析する
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamPitchingParser teamPitchingParser = new TeamPitchingParser();
		TeamPitchingData teamPitchingData = teamPitchingParser.parse(tableElement);
		
		// 個人投手成績を解析する
		List<TableRow> rows = teamPitchingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}
			
			System.out.println(String.format("%sの<< %s >>を丸裸にするぞ", teamName, name));
			
			PlayerPitchingParser playerPitchingParser = new PlayerPitchingParser();
			PlayerPitchingData playerPitchingData = playerPitchingParser.parse(link);
			if(null != playerPitchingData) {
				playerPitchingData.team = teamName;
				playerPitchingData.name = name;
				playerPitchingDataList.add(playerPitchingData);
			}
			
			break; // とりあえず一人だけ
		}
		
		return playerPitchingDataList;
		
	}

}

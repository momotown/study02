package jp.momotown;

import java.util.ArrayList;
import java.util.List;

import jp.momotown.datasource.PlayerBattingData;
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
		
		// チーム打撃成績を解析する
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("チーム打撃成績")).click();
		List<PlayerBattingData> playerBattingDataList = parseBatting(teamName);
		
		// チーム投手成績を解析する
		webDriver.findElement(By.linkText(teamName)).click();
		webDriver.findElement(By.linkText("チーム投手成績")).click();
		parsePitching(teamName);
		
		tearDown();
		
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}
	
	public List<PlayerBattingData> parseBatting(String team) {
		
		List<PlayerBattingData> playerBattingDataList = new ArrayList<PlayerBattingData>();
		
		// チーム打撃成績を解析する
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamBattingParser teamBattingParser = new TeamBattingParser();
		TeamBattingData teamBattingData = teamBattingParser.parse(tableElement);
		
		// 個人成績を解析する
		List<TableRow> rows = teamBattingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamBattingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}
			
			PlayerBattingParser playerBattingParser = new PlayerBattingParser();
			PlayerBattingData playerBattingData = playerBattingParser.parse(link);
			if(null != playerBattingData) {
				playerBattingData.team = team;
				playerBattingData.name = name;
				playerBattingDataList.add(playerBattingData);
			}
			
			break; // とりあえず一人だけ
		}
//		List<TableCell> tableCells = teamBattingData.playerStatsLinkDataTable.getColumnCells("link");
//		for(TableCell tableCell : tableCells) {
//			String link = tableCell.toString();
//			if(link.isEmpty()) {
//				continue;
//			}
//			
//			PlayerBattingParser playerBattingParser = new PlayerBattingParser();
//			PlayerBattingData playerBattingData = playerBattingParser.parse(link);
//			if(null != playerBattingData) {
//				playerBattingData.team
//				playerBattingDataList.add(playerBattingData);
//			}
//			
//			break; // とりあえず一人だけ
//		}
		
		return playerBattingDataList;
		
	}
	
	public void parsePitching(String teamName) {
		
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		TeamPitchingParser teamPitchingParser = new TeamPitchingParser(webDriver);
		TeamPitchingData teamPitchingData = teamPitchingParser.parse(tableElement);
		
		// 個人成績を解析する
		List<TableRow> rows = teamPitchingData.playerStatsLinkDataTable.getRows();
		for(TableRow row : rows) {
			String name = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("name")).toString();
			String link = row.getCell(teamPitchingData.playerStatsLinkDataTable.getColumnIndex("link")).toString();
			if(link.isEmpty()) {
				continue;
			}
			
			PlayerBattingParser playerBattingParser = new PlayerBattingParser();
			PlayerBattingData playerBattingData = playerBattingParser.parse(link);
			if(null != playerBattingData) {
				playerBattingData.team = team;
				playerBattingData.name = name;
				playerBattingDataList.add(playerBattingData);
			}
			
			break; // とりあえず一人だけ
		}
		
	}

}

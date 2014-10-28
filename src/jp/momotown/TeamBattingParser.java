package jp.momotown;

import jp.momotown.batting.TeamStatsParser;
import jp.momotown.datasource.TeamBattingData;

import org.openqa.selenium.WebElement;

public class TeamBattingParser {


	public TeamBattingParser() {

	}
	
	private void setUp() {
		
	}

	private void tearDown() {
		
	}
	
	public TeamBattingData parse(WebElement element) {
		
		setUp();
		
		TeamBattingData teamBattingData = new TeamBattingData();
		
		// チーム打撃成績を解析する
		TeamStatsParser teamStatsParser = new TeamStatsParser();
		teamBattingData.teamStatsDataTable = teamStatsParser.parse(element);
		if(null == teamBattingData.teamStatsDataTable) {
			return teamBattingData;
		}
		
		// 個人成績へのリンクを解析する
		PlayerStatsLinkParser playerStatsLinkParser = new PlayerStatsLinkParser();
		teamBattingData.playerStatsLinkDataTable = playerStatsLinkParser.parse(element, teamBattingData.teamStatsDataTable);
		
		tearDown();
		
		return teamBattingData;
		
	}


}

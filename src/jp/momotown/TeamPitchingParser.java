package jp.momotown;

import jp.momotown.datasource.TeamPitchingData;
import jp.momotown.pitching.TeamStatsParser;

import org.openqa.selenium.WebElement;

public class TeamPitchingParser {

	public TeamPitchingParser() {

	}
	
	private void setUp() {
		
	}

	private void tearDown() {
		
	}
	
	public TeamPitchingData parse(WebElement element) {
		
		setUp();
		
		TeamPitchingData teamPitchingData = new TeamPitchingData();
		
		// チーム投手成績を解析する
		TeamStatsParser teamStatsParser = new TeamStatsParser();
		teamPitchingData.teamStatsDataTable = teamStatsParser.parse(element);
		if(null == teamPitchingData.teamStatsDataTable) {
			return teamPitchingData;
		}
		
		// 個人成績へのリンクを解析する
		PlayerStatsLinkParser playerStatsLinkParser = new PlayerStatsLinkParser();
		teamPitchingData.playerStatsLinkDataTable = playerStatsLinkParser.parse(element, teamPitchingData.teamStatsDataTable);
		
		tearDown();
		
		return teamPitchingData;
		
	}

}

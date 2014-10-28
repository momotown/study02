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
		
		// �`�[�����萬�т���͂���
		TeamStatsParser teamStatsParser = new TeamStatsParser();
		teamPitchingData.teamStatsDataTable = teamStatsParser.parse(element);
		if(null == teamPitchingData.teamStatsDataTable) {
			return teamPitchingData;
		}
		
		// �l���тւ̃����N����͂���
		PlayerStatsLinkParser playerStatsLinkParser = new PlayerStatsLinkParser();
		teamPitchingData.playerStatsLinkDataTable = playerStatsLinkParser.parse(element, teamPitchingData.teamStatsDataTable);
		
		tearDown();
		
		return teamPitchingData;
		
	}

}

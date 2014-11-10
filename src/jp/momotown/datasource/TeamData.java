package jp.momotown.datasource;

import java.util.List;

public class TeamData {
	
	public String nameOfTeam;
	public List<PlayerBattingData> playerBattingDataList;
	public List<PlayerPitchingData> playerPitchingDataList;
	
	public TeamData(String nameOfTeam) {

		this.nameOfTeam = nameOfTeam;
		
	}

}

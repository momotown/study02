package jp.momotown;

import jp.momotown.datasource.TeamData;

public class BaseballDataJpScraping {

	public static void main(String[] args) {

		TeamParser teamParser = new TeamParser();
		TeamData teamData = teamParser.parse("êºïê");
	}

}

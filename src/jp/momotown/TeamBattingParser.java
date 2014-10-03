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
		
	
//		if(null == teamBattingData.playerStatsLinkDataTable) {
//			return;
//		}
//		
//		// 各選手
//		List<TableCell> tableCells = playerStatsLinkDataTable.getColumnCells("link");
//		for(TableCell tableCell : tableCells) {
//			String link = tableCell.toString();
//			if(link.isEmpty()) {
//				continue;
//			}
//			
//			webDriver.get(link);
//			
//			PlayerBattingParser playerParser = new PlayerBattingParser(link);
//			PlayerBattingData PlayerBattingData = playerParser.parse(element)
//			
//			SplitStatsDataTable splitStatsDataTable = null;
//			SabermetricsDataTable sabermetricsDataTable = null;
//			EyeDataTable eyeDataTable = null;
//			SplitStatsRISPDataTable rispDataTable = null;
//			SplitStatsRunnerDataTable runnerDataTable = null;
//			SplitStatsScoreDataTable scoreDataTable = null;
//			SplitStatsVsDataTable splitStatsVsDataTable = null;
//			SplitStatsPitchTypeDataTable splitStatsPitchTypeDataTable = null;
//			SplitStatsInningDataTable splitStatsInningDataTable = null;
//			SplitStatsCountDataTable splitStatsCountDataTable = null;
//			SplitStatsAngleDataTable splitStatsAngleDataTable = null;
//
//			WebElement  mainElement = webDriver.findElement(By.cssSelector("div#main"));
//			List<WebElement> tables = mainElement.findElements(By.cssSelector("table.table-02"));
//			for(WebElement table : tables) {
//				// Splits
//				if(null == splitStatsDataTable) {
//					SplitStatsParser splitStatsParser = new SplitStatsParser();
//					splitStatsDataTable = splitStatsParser.parse(table);
//					if(null != splitStatsDataTable) {
//						System.out.println("Splitsを取得しました.");
//						continue;
//					}
//				}
//				
//				// セイバーメトリクス成績
//				if(null == sabermetricsDataTable) {
//					SabermetricsParser sabermetricsParser = new SabermetricsParser();
//					sabermetricsDataTable = sabermetricsParser.parse(table);
//					if(null != sabermetricsDataTable) {
//						System.out.println("セイバーメトリクス成績を取得しました.");
//						continue;
//					}
//				}
//				
//				// 選球眼関連
//				if(null == eyeDataTable) {
//					EyeParser eyeParser = new EyeParser();
//					eyeDataTable = eyeParser.parse(table);
//					if(null != eyeDataTable) {
//						System.out.println("選球眼関連を取得しました.");
//						continue;
//					}
//				}
//				
//				// 得点圏成績
//				if(null == rispDataTable) {
//					RISPParser rispParser = new RISPParser();
//					rispDataTable = rispParser.parse(table);
//					if(null != rispDataTable) {
//						System.out.println("得点圏成績を取得しました.");
//						continue;
//					}
//				}
//
//				// ランナー状況別成績
//				if(null == runnerDataTable) {
//					SplitStatsRunnerParser runnerParser = new SplitStatsRunnerParser();
//					runnerDataTable = runnerParser.parse(table);
//					if(null != runnerDataTable) {
//						System.out.println("ランナー状況別成績を取得しました.");
//						continue;
//					}
//				}
//
//				// 得点差状況別成績
//				if(null == scoreDataTable) {
//					SplitStatsScoreParser scoreParser = new SplitStatsScoreParser();
//					scoreDataTable = scoreParser.parse(table);
//					if(null != scoreDataTable) {
//						System.out.println("得点差状況別成績を取得しました.");
//						continue;
//					}
//				}
//
//				// 左右投手成績
//				if(null == splitStatsVsDataTable) {
//					SplitStatsVsParser vsParser = new SplitStatsVsParser();
//					splitStatsVsDataTable = vsParser.parse(table);
//					if(null != splitStatsVsDataTable) {
//						System.out.println("左右投手成績を取得しました.");
//						continue;
//					}
//				}
//				
//				// 球種別成績
//				if(null == splitStatsPitchTypeDataTable) {
//					SplitStatsPitchTypeParser pitchTypeParser = new SplitStatsPitchTypeParser();
//					splitStatsPitchTypeDataTable = pitchTypeParser.parse(table);
//					if(null != splitStatsPitchTypeDataTable) {
//						System.out.println("球種別成績を取得しました.");
//						continue;
//					}
//				}
//				
//				// カウント別成績
//				if(null == splitStatsCountDataTable) {
//					SplitStatsCountParser countParser = new SplitStatsCountParser();
//					splitStatsCountDataTable = countParser.parse(table);
//					if(null != splitStatsCountDataTable) {
//						System.out.println("カウント別成績を取得しました.");
//						continue;
//					}
//				}
//				
//				// イニング別成績
//				if(null == splitStatsInningDataTable) {
//					SplitStatsInningParser inningParser = new SplitStatsInningParser();
//					splitStatsInningDataTable = inningParser.parse(table);
//					if(null != splitStatsInningDataTable) {
//						System.out.println("イニング別成績を取得しました.");
//						continue;
//					}
//				}
//				
//				// 対戦成績
//			}
//			
//			// 打球方向別成績
//			WebElement diamond = mainElement.findElement(By.cssSelector("div#counthoko div#diamond"));
//			if(null == splitStatsAngleDataTable) {
//				SplitStatsAngleParser angleParser = new SplitStatsAngleParser();
//				splitStatsAngleDataTable = angleParser.parse(diamond);
//				if(null != splitStatsAngleDataTable) {
//					System.out.println("打球方向別成績を取得しました.");
//				}
//			}
//			
//			break; // とりあえず一人だけ
//		}
		
		tearDown();
		
		return teamBattingData;
		
	}


}

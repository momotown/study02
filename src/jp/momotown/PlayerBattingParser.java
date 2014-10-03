package jp.momotown;

import java.util.List;

import jp.momotown.batting.EyeParser;
import jp.momotown.batting.RISPParser;
import jp.momotown.batting.SabermetricsParser;
import jp.momotown.batting.SplitStatsAngleParser;
import jp.momotown.batting.SplitStatsCountParser;
import jp.momotown.batting.SplitStatsInningParser;
import jp.momotown.batting.SplitStatsParser;
import jp.momotown.batting.SplitStatsPitchTypeParser;
import jp.momotown.batting.SplitStatsRunnerParser;
import jp.momotown.batting.SplitStatsScoreParser;
import jp.momotown.batting.SplitStatsVsParser;
import jp.momotown.datasource.PlayerBattingData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayerBattingParser {

	private WebDriver webDriver;

	public PlayerBattingParser() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	private void setUp() {
		
		webDriver = new FirefoxDriver();
	
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}
	
	public PlayerBattingData parse(String url) {
		
		setUp();
		
		webDriver.get(url);
		
		PlayerBattingData data = new PlayerBattingData();
		
		SplitStatsParser splitStatsParser = new SplitStatsParser();
		SabermetricsParser sabermetricsParser = new SabermetricsParser();
		EyeParser eyeParser = new EyeParser();
		RISPParser rispParser = new RISPParser();
		SplitStatsRunnerParser runnerParser = new SplitStatsRunnerParser();
		SplitStatsScoreParser scoreParser = new SplitStatsScoreParser();
		SplitStatsVsParser vsParser = new SplitStatsVsParser();
		SplitStatsPitchTypeParser pitchTypeParser = new SplitStatsPitchTypeParser();
		SplitStatsCountParser countParser = new SplitStatsCountParser();
		SplitStatsInningParser inningParser = new SplitStatsInningParser();
		SplitStatsAngleParser angleParser = new SplitStatsAngleParser();
		
		WebElement  mainElement = webDriver.findElement(By.cssSelector("div#main"));
		List<WebElement> tables = mainElement.findElements(By.cssSelector("table.table-02"));
		for(WebElement table : tables) {
		
			// Splits
			if(null == data.splitStatsDataTable) {
				data.splitStatsDataTable = splitStatsParser.parse(table);
				if(null != data.splitStatsDataTable) {
					System.out.println("Splitsを取得しました.");
					continue;
				}
			}
			
			// セイバーメトリクス成績
			if(null == data.sabermetricsDataTable) {
				data.sabermetricsDataTable = sabermetricsParser.parse(table);
				if(null != data.sabermetricsDataTable) {
					System.out.println("セイバーメトリクス成績を取得しました.");
					continue;
				}
			}
			
			// 選球眼関連
			if(null == data.eyeDataTable) {
				data.eyeDataTable = eyeParser.parse(table);
				if(null != data.eyeDataTable) {
					System.out.println("選球眼関連を取得しました.");
					continue;
				}
			}
			
			// 得点圏成績
			if(null == data.splitStatsRISPDataTable) {
				data.splitStatsRISPDataTable = rispParser.parse(table);
				if(null != data.splitStatsRISPDataTable) {
					System.out.println("得点圏成績を取得しました.");
					continue;
				}
			}

			// ランナー状況別成績
			if(null == data.splitStatsRunnerDataTable) {
				data.splitStatsRunnerDataTable = runnerParser.parse(table);
				if(null != data.splitStatsRunnerDataTable) {
					System.out.println("ランナー状況別成績を取得しました.");
					continue;
				}
			}

			// 得点差状況別成績
			if(null == data.splitStatsScoreDataTable) {
				data.splitStatsScoreDataTable = scoreParser.parse(table);
				if(null != data.splitStatsScoreDataTable) {
					System.out.println("得点差状況別成績を取得しました.");
					continue;
				}
			}

			// 左右投手成績
			if(null == data.splitStatsVsDataTable) {
				data.splitStatsVsDataTable = vsParser.parse(table);
				if(null != data.splitStatsVsDataTable) {
					System.out.println("左右投手成績を取得しました.");
					continue;
				}
			}
			
			// 球種別成績
			if(null == data.splitStatsPitchTypeDataTable) {
				data.splitStatsPitchTypeDataTable = pitchTypeParser.parse(table);
				if(null != data.splitStatsPitchTypeDataTable) {
					System.out.println("球種別成績を取得しました.");
					continue;
				}
			}
			
			// カウント別成績
			if(null == data.splitStatsCountDataTable) {
				data.splitStatsCountDataTable = countParser.parse(table);
				if(null != data.splitStatsCountDataTable) {
					System.out.println("カウント別成績を取得しました.");
					continue;
				}
			}
			
			// イニング別成績
			if(null == data.splitStatsInningDataTable) {
				data.splitStatsInningDataTable = inningParser.parse(table);
				if(null != data.splitStatsInningDataTable) {
					System.out.println("イニング別成績を取得しました.");
					continue;
				}
			}
			
			// 対戦成績

			System.out.println("解析できませんでした.");
		}

		// 打球方向別成績
		WebElement diamond = mainElement.findElement(By.cssSelector("div#counthoko div#diamond"));
		if(null == data.splitStatsAngleDataTable) {
			data.splitStatsAngleDataTable = angleParser.parse(diamond);
			if(null != data.splitStatsAngleDataTable) {
				System.out.println("打球方向別成績を取得しました.");
			}
		}
		
		tearDown();
		
		return data;
	
	}

}

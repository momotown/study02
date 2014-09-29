package jp.momotown;

import java.util.List;

import jp.momotown.batting.EyeParser;
import jp.momotown.batting.RISPParser;
import jp.momotown.batting.SabermetricsParser;
import jp.momotown.batting.SplitStatsParser;
import jp.momotown.datasource.batting.EyeDataTable;
import jp.momotown.datasource.batting.RISPDataTable;
import jp.momotown.datasource.batting.SabermetricsDataTable;
import jp.momotown.datasource.batting.SplitStatsDataTable;
import jp.momotown.datasource.batting.TeamBattingStatsDataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.visualization.datasource.datatable.TableCell;

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
		
		webDriver.findElement(By.linkText(teamName)).click();
		
		webDriver.findElement(By.linkText("チーム打撃成績")).click();
		
		WebElement tableElement = webDriver.findElement(By.cssSelector("table.table-02"));
		
		TeamBattingStatsParser teamBattingStatsParser = new TeamBattingStatsParser();
		TeamBattingStatsDataTable dataTable = teamBattingStatsParser.parse(tableElement);
		List<TableCell> tableCells = dataTable.getColumnCells("link");
		for(TableCell tableCell : tableCells) {
			String link = tableCell.toString();
			if(link.isEmpty()) {
				continue;
			}

			webDriver.get(link);
			
			SplitStatsDataTable splitStatsDataTable = null;
			SabermetricsDataTable sabermetricsDataTable = null;
			EyeDataTable eyeDataTable = null;
			RISPDataTable rispDataTable = null;
			
			WebElement  mainElement = webDriver.findElement(By.cssSelector("div#main"));
			List<WebElement> tables = mainElement.findElements(By.cssSelector("table.table-02"));
			for(WebElement table : tables) {
				// Splits
				if(null == splitStatsDataTable) {
					SplitStatsParser splitStatsParser = new SplitStatsParser();
					splitStatsDataTable = splitStatsParser.parse(table);
					if(null != splitStatsDataTable) {
						System.out.println("Splitsを取得しました.");
						continue;
					}
				}
				
				// セイバーメトリクス成績
				if(null == sabermetricsDataTable) {
					SabermetricsParser sabermetricsParser = new SabermetricsParser();
					sabermetricsDataTable = sabermetricsParser.parse(table);
					if(null != sabermetricsDataTable) {
						System.out.println("セイバーメトリクス成績を取得しました.");
						continue;
					}
				}
				
				// 選球眼関連
				if(null == eyeDataTable) {
					EyeParser eyeParser = new EyeParser();
					eyeDataTable = eyeParser.parse(table);
					if(null != eyeDataTable) {
						System.out.println("選球眼関連を取得しました.");
						continue;
					}
				}
				
				// 得点圏成績
				if(null == rispDataTable) {
					RISPParser rispParser = new RISPParser();
					rispDataTable = rispParser.parse(table);
					if(null != rispDataTable) {
						System.out.println("得点圏成績を取得しました.");
						continue;
					}
				}

				// 状況別成績マトリクス表
				// 得点差状況別成績
				// 左右投手成績
				// イニング別成績
				// 対戦成績
			}
			
			break; // とりあえず一人だけ
		}
		
		//webDriver.findElement(By.linkText("チーム投手成績")).click();
		
		tearDown();
		
	}

	private void tearDown() {
		
		this.webDriver.quit();
		
	}

}

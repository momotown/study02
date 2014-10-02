package jp.momotown;

import java.util.List;

import jp.momotown.pitching.SplitStatsParser;
import jp.momotown.datasource.PlayerStatsLinkDataTable;
import jp.momotown.datasource.pitching.SplitStatsDataTable;
import jp.momotown.datasource.pitching.TeamStatsDataTable;
import jp.momotown.pitching.TeamStatsParser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.datatable.TableCell;

public class TeamPitchingParser {

	private WebDriver webDriver;
	
	public TeamPitchingParser(WebDriver webDriver) {

		this.webDriver = webDriver;
	}
	
	private void setUp() {
		
	}

	private void tearDown() {
		
	}
	
	public void parse(WebElement element) {
		
		setUp();
		
		TeamStatsParser teamStatsParser = new TeamStatsParser();
		TeamStatsDataTable teamStatsDataTable = teamStatsParser.parse(element);
		if(null == teamStatsDataTable) {
			return;
		}
		
		PlayerStatsLinkParser playerStatsLinkParser = new PlayerStatsLinkParser();
		PlayerStatsLinkDataTable playerStatsLinkDataTable = playerStatsLinkParser.parse(element, teamStatsDataTable);
		if(null == playerStatsLinkDataTable) {
			return;
		}
		
		// äeëIéË
		List<TableCell> tableCells = playerStatsLinkDataTable.getColumnCells("link");
		for(TableCell tableCell : tableCells) {
			String link = tableCell.toString();
			if(link.isEmpty()) {
				continue;
			}
			
			webDriver.get(link);
			
			SplitStatsDataTable splitStatsDataTable = null;

			WebElement  mainElement = webDriver.findElement(By.cssSelector("div#main"));
			List<WebElement> tables = mainElement.findElements(By.cssSelector("table.table-02"));
			for(WebElement table : tables) {
				// Splits
				if(null == splitStatsDataTable) {
					SplitStatsParser splitStatsParser = new SplitStatsParser();
					splitStatsDataTable = splitStatsParser.parse(table);
					if(null != splitStatsDataTable) {
						System.out.println("SplitsÇéÊìæÇµÇ‹ÇµÇΩ.");
						continue;
					}
				}
			}
			
			break; // Ç∆ÇËÇ†Ç¶Ç∏àÍêlÇæÇØ
		}
		
		tearDown();
		
	}

}

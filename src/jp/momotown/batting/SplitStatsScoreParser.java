package jp.momotown.batting;

import java.util.List;
import java.util.regex.Pattern;

import jp.momotown.datasource.batting.SplitStatsScoreChildDataTable;
import jp.momotown.datasource.batting.SplitStatsScoreDataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.TableRow;

public class SplitStatsScoreParser {

	public SplitStatsScoreParser() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public SplitStatsScoreDataTable parse(WebElement element) {
		
		SplitStatsScoreDataTable dataTable = new SplitStatsScoreDataTable();
		
		if(!IsValid(element)) {
			return null;
		}
		
		int numOfTd = 1;
		for(SplitStatsScoreChildDataTable childDataTable : dataTable.childDataTables) {
			int td = childDataTable.getNumberOfColumns() - 1;
			numOfTd += td;
		}

		List<WebElement> trs = element.findElements(By.cssSelector("tr"));
		for(WebElement tr : trs) {
			List<WebElement> tds = tr.findElements(By.cssSelector("td"));
			if(tds.size() != numOfTd) {
				continue;
			}
			
			String score = tds.remove(0).getText();
			for(SplitStatsScoreChildDataTable childDataTable : dataTable.childDataTables) {
				TableRow row = new TableRow();
				int col = childDataTable.getNumberOfColumns();
				row.addCell(score);
				--col;
				for(int j = 0; j < col; ++j) {
					row.addCell(tds.remove(0).getText());
				}
				
				try {
					childDataTable.addRow(row);
				} catch (TypeMismatchException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
		
		return dataTable;
		
	}

	public boolean IsValid(WebElement element) {
		
		if(0 != element.getTagName().compareTo("table")) {
			return false;
		}
		
		List<WebElement> trs = element.findElements(By.cssSelector("tr"));
		List<WebElement> ths = trs.get(0).findElements(By.cssSelector("th"));
		
		SplitStatsScoreDataTable dataTable = new SplitStatsScoreDataTable();
		
		List<ColumnDescription> columnDescriptions= dataTable.getColumnDescriptions();
		if(ths.size() != columnDescriptions.size()) {
			return false;
		}
		
		for(int i = 0; i < ths.size(); ++i) {
			String text =Pattern.compile("\n").matcher(ths.get(i).getText()).replaceAll("");
			if(0 != text.compareTo(columnDescriptions.get(i).getLabel())) {
				return false;
			}
		}
	
		return true;
		
	}

}

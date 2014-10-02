package jp.momotown.pitching;

import java.util.List;
import java.util.regex.Pattern;

import jp.momotown.datasource.pitching.SplitStatsDataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.TableRow;

public class SplitStatsParser {

	public SplitStatsParser() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	public SplitStatsDataTable parse(WebElement element) {
		
		SplitStatsDataTable dataTable = new SplitStatsDataTable();
		
		if(!IsValid(element)) {
			return null;
		}
		
		List<WebElement> trs = element.findElements(By.cssSelector("tr"));
		for(WebElement tr : trs) {
			List<WebElement> tds = tr.findElements(By.cssSelector("td"));
			if(tds.size() != dataTable.getColumnDescriptions().size()) {
				continue;
			}
			
			TableRow row = new TableRow();
					
			for(WebElement td : tds) {
				row.addCell(td.getText());
			}
			
			try {
				dataTable.addRow(row);
			} catch (TypeMismatchException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
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
		
		SplitStatsDataTable dataTable = new SplitStatsDataTable();
		
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

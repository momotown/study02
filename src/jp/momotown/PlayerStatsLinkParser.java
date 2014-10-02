package jp.momotown;

import java.util.List;

import jp.momotown.datasource.PlayerStatsLinkDataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.TableRow;

public class PlayerStatsLinkParser {

	public PlayerStatsLinkParser() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	public PlayerStatsLinkDataTable parse(WebElement element, DataTable srcTable) {
		
		PlayerStatsLinkDataTable dataTable = new  PlayerStatsLinkDataTable();

		int nameIndex = srcTable.getColumnIndex("name");
		
		List<WebElement> trs = element.findElements(By.cssSelector("tr"));
		for(WebElement tr : trs) {
			List<WebElement> tds = tr.findElements(By.cssSelector("td"));
			if(tds.size() != srcTable.getColumnDescriptions().size()) {
				continue;
			}
			
			TableRow row = new TableRow();
			
			WebElement td = tds.get(nameIndex);
					
			row.addCell(td.getText());
			String link = "";
			try {
				WebElement anchor = td.findElement(By.tagName("a"));
				link = anchor.getAttribute("href");
			} catch (NoSuchElementException e) {
				link = "";
			}
			row.addCell(link);
			
			try {
				dataTable.addRow(row);
			} catch (TypeMismatchException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}
		
		return dataTable;
		
	}

}

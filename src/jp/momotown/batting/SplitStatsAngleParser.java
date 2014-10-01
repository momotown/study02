package jp.momotown.batting;

import java.util.List;
import java.util.regex.Pattern;

import jp.momotown.datasource.batting.SplitStatsAngleDataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.TableRow;

public class SplitStatsAngleParser {

	public SplitStatsAngleParser() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
	public SplitStatsAngleDataTable parse(WebElement element) {
		
		SplitStatsAngleDataTable dataTable = new SplitStatsAngleDataTable();
		
		List<WebElement> spans = element.findElements(By.cssSelector("span"));
		spans.remove(0); // �ŋ������ʑŗ�
		for(WebElement span : spans) {
			
			String text = Pattern.compile("[�{|(|)]").matcher(span.getText()).replaceAll("");
			String[] cells = text.split("[\\s|-]");
			
			TableRow row = new TableRow();
			for(String cell : cells) {
				row.addCell(cell);
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

}

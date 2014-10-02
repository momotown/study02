package jp.momotown;

import java.util.List;

import jp.momotown.datasource.batting.TeamBattingStatsDataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.TableRow;

public class TeamBattingStatsParser {

	public TeamBattingStatsParser() {
		// TODO ©®¶¬³ê½RXgN^[EX^u
	}
	
	private void setUp() {
		
	}
	public TeamBattingStatsDataTable parse(WebElement element) {
		
		setUp();
		
		TeamBattingStatsDataTable dataTable = new TeamBattingStatsDataTable();

		List<WebElement> trElements = element.findElements(By.cssSelector("tr"));
		for(WebElement trElement : trElements) {
			
			List<WebElement> tdElements = trElement.findElements(By.cssSelector("td"));
			if(tdElements.isEmpty()) {
				continue;
			}
			
			TableRow row = new TableRow();
			
			// Ê
			tdElements.remove(0);
			
			// c
			String team = tdElements.remove(0).getText();
			row.addCell(team);

			// Iè¼
			WebElement tdElement = tdElements.remove(0);
			String name = tdElement.getText();
			row.addCell(name);
			String link = "";
			try {
				WebElement anchor = tdElement.findElement(By.tagName("a"));
				link = anchor.getAttribute("href");
			} catch (NoSuchElementException e) {
				link = "";
			}
			row.addCell(link);
			
			// êR
			tdElements.remove(0);
			row.addCell(true);
			
			// ²q
			tdElements.remove(0);
			row.addCell(0);

			try {
				// Å¦
				String text = tdElements.remove(0).getText();
				float ba = Float.parseFloat(text);
				row.addCell(ba);
				
				// Å_
				text = tdElements.remove(0).getText();
				int rbi = Integer.parseInt(text);
				row.addCell(rbi);
				
				// {ÛÅ
				text = tdElements.remove(0).getText();
				int hr = Integer.parseInt(text);
				
				// ÀÅ
				text = tdElements.remove(0).getText();
				int h = Integer.parseInt(text);
				row.addCell(h);
				
				// PÅ
				text = tdElements.remove(0).getText();
				int singles = Integer.parseInt(text);
				row.addCell(singles);
				
				// 2ÛÅ
				text = tdElements.remove(0).getText();
				int doubles = Integer.parseInt(text);
				row.addCell(doubles);
				
				// 3ÛÅ
				text = tdElements.remove(0).getText();
				int triples = Integer.parseInt(text);
				row.addCell(triples);
				
				// Åß5
				text = tdElements.remove(0).getText();
				float lastFiveDays = Float.parseFloat(text);
				row.addCell(lastFiveDays);

				// oÛ¦
				text = tdElements.remove(0).getText();
				float obp = Float.parseFloat(text);
				row.addCell(obp);
				
				// ·Å¦
				text = tdElements.remove(0).getText();
				float slg = Float.parseFloat(text);
				row.addCell(slg);
				
				// OPS
				text = tdElements.remove(0).getText();
				float ops = Float.parseFloat(text);
				row.addCell(ops);
				
				// ¾_Å
				text = tdElements.remove(0).getText();
				int risp_ab = Integer.parseInt(text);
				row.addCell(risp_ab);
				
				// ¾_ÀÅ
				text = tdElements.remove(0).getText();
				int risp_h = Integer.parseInt(text);
				row.addCell(risp_h);
				
				// ¾_Å¦
				text = tdElements.remove(0).getText();
				float risp_ba = Float.parseFloat(text);
				row.addCell(risp_ba);
				
				// UC¦
				text = tdElements.remove(0).getText();
				float uc_ba = Float.parseFloat(text);
				row.addCell(uc_ba);
				
				// UC{ÛÅ
				text = tdElements.remove(0).getText();
				int uc_hr = Integer.parseInt(text);
				row.addCell(uc_hr);
				
				// 
				text = tdElements.remove(0).getText();
				int g = Integer.parseInt(text);
				row.addCell(g);
				
				// ÅÈ
				text = tdElements.remove(0).getText();
				int pa = Integer.parseInt(text);
				row.addCell(pa);
				
				// Å
				text = tdElements.remove(0).getText();
				int ab = Integer.parseInt(text);
				row.addCell(ab);
				
				// ¾_
				text = tdElements.remove(0).getText();
				int r = Integer.parseInt(text);
				row.addCell(r);
				
				// l
				text = tdElements.remove(0).getText();
				int bb = Integer.parseInt(text);
				row.addCell(bb);
				
				// 
				text = tdElements.remove(0).getText();
				int hbp = Integer.parseInt(text);
				row.addCell(hbp);
				
				// éÛ
				text = tdElements.remove(0).getText();
				int try_sb = Integer.parseInt(text);
				row.addCell(try_sb);
				
				// Û
				text = tdElements.remove(0).getText();
				int sb = Integer.parseInt(text);
				row.addCell(sb);
				
				// Û¬÷¦
				text = tdElements.remove(0).getText();
				float sba = Float.parseFloat(text);
				row.addCell(sba);
				
				// é]Å
				text = tdElements.remove(0).getText();
				int try_sh = Integer.parseInt(text);
				row.addCell(try_sh);
				
				// ]Å
				text = tdElements.remove(0).getText();
				int sh = Integer.parseInt(text);
				row.addCell(sh);
				
				// ]Å¬÷¦
				text = tdElements.remove(0).getText();
				float sha = Float.parseFloat(text);
				row.addCell(sha);
				
				// ]ò
				text = tdElements.remove(0).getText();
				int sf = Integer.parseInt(text);
				row.addCell(sf);
				
				// ãÅ
				text = tdElements.remove(0).getText();
				int ph_ab = Integer.parseInt(text);
				row.addCell(ph_ab);
				
				// ãÅÀÅ
				text = tdElements.remove(0).getText();
				int ph_h = Integer.parseInt(text);
				row.addCell(ph_h);
				
				// ãÅ¦
				text = tdElements.remove(0).getText();
				float ph_ba = Float.parseFloat(text);
				row.addCell(ph_ba);
				
				// ¹E
				text = tdElements.remove(0).getText();
				int dp = Integer.parseInt(text);
				row.addCell(dp);
				
				// ¸ô
				text = tdElements.remove(0).getText();
				int e = Integer.parseInt(text);
				row.addCell(e);
				
				// OU
				text = tdElements.remove(0).getText();
				int so = Integer.parseInt(text);
				row.addCell(so);
			} catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				dataTable.addRow(row);
			} catch (TypeMismatchException e) {
				// TODO ©®¶¬³ê½ catch ubN
				e.printStackTrace();
			}
		}
		
		tearDown();
		
		return dataTable;
		
	}

	private void tearDown() {
		
	}

}

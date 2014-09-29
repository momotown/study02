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
		// TODO 自動生成されたコンストラクター・スタブ
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
			
			// 順位
			tdElements.remove(0);
			
			// 球団
			String team = tdElements.remove(0).getText();
			row.addCell(team);

			// 選手名
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
			
			// 一軍
			tdElements.remove(0);
			row.addCell(true);
			
			// 調子
			tdElements.remove(0);
			row.addCell(0);

			try {
				// 打率
				String text = tdElements.remove(0).getText();
				float ba = Float.parseFloat(text);
				row.addCell(ba);
				
				// 打点
				text = tdElements.remove(0).getText();
				int rbi = Integer.parseInt(text);
				row.addCell(rbi);
				
				// 本塁打
				text = tdElements.remove(0).getText();
				int hr = Integer.parseInt(text);
				
				// 安打数
				text = tdElements.remove(0).getText();
				int h = Integer.parseInt(text);
				row.addCell(h);
				
				// 単打
				text = tdElements.remove(0).getText();
				int singles = Integer.parseInt(text);
				row.addCell(singles);
				
				// 2塁打
				text = tdElements.remove(0).getText();
				int doubles = Integer.parseInt(text);
				row.addCell(doubles);
				
				// 3塁打
				text = tdElements.remove(0).getText();
				int triples = Integer.parseInt(text);
				row.addCell(triples);
				
				// 最近5試合
				text = tdElements.remove(0).getText();
				float lastFiveDays = Float.parseFloat(text);
				row.addCell(lastFiveDays);

				// 出塁率
				text = tdElements.remove(0).getText();
				float obp = Float.parseFloat(text);
				row.addCell(obp);
				
				// 長打率
				text = tdElements.remove(0).getText();
				float slg = Float.parseFloat(text);
				row.addCell(slg);
				
				// OPS
				text = tdElements.remove(0).getText();
				float ops = Float.parseFloat(text);
				row.addCell(ops);
				
				// 得点圏打数
				text = tdElements.remove(0).getText();
				int risp_ab = Integer.parseInt(text);
				row.addCell(risp_ab);
				
				// 得点圏安打
				text = tdElements.remove(0).getText();
				int risp_h = Integer.parseInt(text);
				row.addCell(risp_h);
				
				// 得点圏打率
				text = tdElements.remove(0).getText();
				float risp_ba = Float.parseFloat(text);
				row.addCell(risp_ba);
				
				// UC率
				text = tdElements.remove(0).getText();
				float uc_ba = Float.parseFloat(text);
				row.addCell(uc_ba);
				
				// UC本塁打
				text = tdElements.remove(0).getText();
				int uc_hr = Integer.parseInt(text);
				row.addCell(uc_hr);
				
				// 試合数
				text = tdElements.remove(0).getText();
				int g = Integer.parseInt(text);
				row.addCell(g);
				
				// 打席数
				text = tdElements.remove(0).getText();
				int pa = Integer.parseInt(text);
				row.addCell(pa);
				
				// 打数
				text = tdElements.remove(0).getText();
				int ab = Integer.parseInt(text);
				row.addCell(ab);
				
				// 得点
				text = tdElements.remove(0).getText();
				int r = Integer.parseInt(text);
				row.addCell(r);
				
				// 四球
				text = tdElements.remove(0).getText();
				int bb = Integer.parseInt(text);
				row.addCell(bb);
				
				// 死球
				text = tdElements.remove(0).getText();
				int hbp = Integer.parseInt(text);
				row.addCell(hbp);
				
				// 企盗塁
				text = tdElements.remove(0).getText();
				int try_sb = Integer.parseInt(text);
				row.addCell(try_sb);
				
				// 盗塁
				text = tdElements.remove(0).getText();
				int sb = Integer.parseInt(text);
				row.addCell(sb);
				
				// 盗塁成功率
				text = tdElements.remove(0).getText();
				float sba = Float.parseFloat(text);
				row.addCell(sba);
				
				// 企犠打
				text = tdElements.remove(0).getText();
				int try_sh = Integer.parseInt(text);
				row.addCell(try_sh);
				
				// 犠打
				text = tdElements.remove(0).getText();
				int sh = Integer.parseInt(text);
				row.addCell(sh);
				
				// 犠打成功率
				text = tdElements.remove(0).getText();
				float sha = Float.parseFloat(text);
				row.addCell(sha);
				
				// 犠飛
				text = tdElements.remove(0).getText();
				int sf = Integer.parseInt(text);
				row.addCell(sf);
				
				// 代打数
				text = tdElements.remove(0).getText();
				int ph_ab = Integer.parseInt(text);
				row.addCell(ph_ab);
				
				// 代打安打
				text = tdElements.remove(0).getText();
				int ph_h = Integer.parseInt(text);
				row.addCell(ph_h);
				
				// 代打率
				text = tdElements.remove(0).getText();
				float ph_ba = Float.parseFloat(text);
				row.addCell(ph_ba);
				
				// 併殺
				text = tdElements.remove(0).getText();
				int dp = Integer.parseInt(text);
				row.addCell(dp);
				
				// 失策
				text = tdElements.remove(0).getText();
				int e = Integer.parseInt(text);
				row.addCell(e);
				
				// 三振
				text = tdElements.remove(0).getText();
				int so = Integer.parseInt(text);
				row.addCell(so);
			} catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				dataTable.addRow(row);
			} catch (TypeMismatchException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
		tearDown();
		
		return dataTable;
		
	}

	private void tearDown() {
		
	}


}

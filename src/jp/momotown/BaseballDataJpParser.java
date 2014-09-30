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
		
		webDriver.findElement(By.linkText("�`�[���Ō�����")).click();
		
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
						System.out.println("Splits���擾���܂���.");
						continue;
					}
				}
				
				// �Z�C�o�[���g���N�X����
				if(null == sabermetricsDataTable) {
					SabermetricsParser sabermetricsParser = new SabermetricsParser();
					sabermetricsDataTable = sabermetricsParser.parse(table);
					if(null != sabermetricsDataTable) {
						System.out.println("�Z�C�o�[���g���N�X���т��擾���܂���.");
						continue;
					}
				}
				
				// �I����֘A
				if(null == eyeDataTable) {
					EyeParser eyeParser = new EyeParser();
					eyeDataTable = eyeParser.parse(table);
					if(null != eyeDataTable) {
						System.out.println("�I����֘A���擾���܂���.");
						continue;
					}
				}
				
				// ���_������
				if(null == rispDataTable) {
					RISPParser rispParser = new RISPParser();
					rispDataTable = rispParser.parse(table);
					if(null != rispDataTable) {
						System.out.println("���_�����т��擾���܂���.");
						continue;
					}
				}

				// �󋵕ʐ��у}�g���N�X�\
				// ���_���󋵕ʐ���
				// ���E���萬��
				// �C�j���O�ʐ���
				// �ΐ퐬��
			}
			
			break; // �Ƃ肠������l����
		}
		
		//webDriver.findElement(By.linkText("�`�[�����萬��")).click();
		
		tearDown();
		
	}

	private void tearDown() {
		
		this.webDriver.quit();
		
	}

}

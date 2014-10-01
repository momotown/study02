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
import jp.momotown.datasource.batting.EyeDataTable;
import jp.momotown.datasource.batting.SabermetricsDataTable;
import jp.momotown.datasource.batting.SplitStatsAngleDataTable;
import jp.momotown.datasource.batting.SplitStatsCountDataTable;
import jp.momotown.datasource.batting.SplitStatsDataTable;
import jp.momotown.datasource.batting.SplitStatsInningDataTable;
import jp.momotown.datasource.batting.SplitStatsPitchTypeDataTable;
import jp.momotown.datasource.batting.SplitStatsRISPDataTable;
import jp.momotown.datasource.batting.SplitStatsRunnerDataTable;
import jp.momotown.datasource.batting.SplitStatsScoreDataTable;
import jp.momotown.datasource.batting.SplitStatsVsDataTable;
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
			SplitStatsRISPDataTable rispDataTable = null;
			SplitStatsRunnerDataTable runnerDataTable = null;
			SplitStatsScoreDataTable scoreDataTable = null;
			SplitStatsVsDataTable splitStatsVsDataTable = null;
			SplitStatsPitchTypeDataTable splitStatsPitchTypeDataTable = null;
			SplitStatsInningDataTable splitStatsInningDataTable = null;
			SplitStatsCountDataTable splitStatsCountDataTable = null;
			SplitStatsAngleDataTable splitStatsAngleDataTable = null;
			
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

				// �����i�[�󋵕ʐ���
				if(null == runnerDataTable) {
					SplitStatsRunnerParser runnerParser = new SplitStatsRunnerParser();
					runnerDataTable = runnerParser.parse(table);
					if(null != runnerDataTable) {
						System.out.println("�����i�[�󋵕ʐ��т��擾���܂���.");
						continue;
					}
				}

				// ���_���󋵕ʐ���
				if(null == scoreDataTable) {
					SplitStatsScoreParser scoreParser = new SplitStatsScoreParser();
					scoreDataTable = scoreParser.parse(table);
					if(null != scoreDataTable) {
						System.out.println("���_���󋵕ʐ��т��擾���܂���.");
						continue;
					}
				}

				// ���E���萬��
				if(null == splitStatsVsDataTable) {
					SplitStatsVsParser vsParser = new SplitStatsVsParser();
					splitStatsVsDataTable = vsParser.parse(table);
					if(null != splitStatsVsDataTable) {
						System.out.println("���E���萬�т��擾���܂���.");
						continue;
					}
				}
				
				// ����ʐ���
				if(null == splitStatsPitchTypeDataTable) {
					SplitStatsPitchTypeParser pitchTypeParser = new SplitStatsPitchTypeParser();
					splitStatsPitchTypeDataTable = pitchTypeParser.parse(table);
					if(null != splitStatsPitchTypeDataTable) {
						System.out.println("����ʐ��т��擾���܂���.");
						continue;
					}
				}
				
				// �J�E���g�ʐ���
				if(null == splitStatsCountDataTable) {
					SplitStatsCountParser countParser = new SplitStatsCountParser();
					splitStatsCountDataTable = countParser.parse(table);
					if(null != splitStatsCountDataTable) {
						System.out.println("�J�E���g�ʐ��т��擾���܂���.");
						continue;
					}
				}
				
				// �C�j���O�ʐ���
				if(null == splitStatsInningDataTable) {
					SplitStatsInningParser inningParser = new SplitStatsInningParser();
					splitStatsInningDataTable = inningParser.parse(table);
					if(null != splitStatsInningDataTable) {
						System.out.println("�C�j���O�ʐ��т��擾���܂���.");
						continue;
					}
				}
				
				// �ΐ퐬��
			}
			
			// �ŋ������ʐ���
			WebElement diamond = mainElement.findElement(By.cssSelector("div#counthoko div#diamond"));
			if(null == splitStatsAngleDataTable) {
				SplitStatsAngleParser angleParser = new SplitStatsAngleParser();
				splitStatsAngleDataTable = angleParser.parse(diamond);
				if(null != splitStatsAngleDataTable) {
					System.out.println("�ŋ������ʐ��т��擾���܂���.");
				}
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

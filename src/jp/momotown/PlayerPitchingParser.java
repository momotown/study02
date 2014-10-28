package jp.momotown;

import java.util.List;

import jp.momotown.datasource.PlayerPitchingData;
import jp.momotown.pitching.RISPParser;
import jp.momotown.pitching.SabermetricsParser;
import jp.momotown.pitching.SplitStatsCountParser;
import jp.momotown.pitching.SplitStatsParser;
import jp.momotown.pitching.SplitStatsPitchTypeParser;
import jp.momotown.pitching.SplitStatsRunnerParser;
import jp.momotown.pitching.SplitStatsVsParser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayerPitchingParser {

	private WebDriver webDriver;

	public PlayerPitchingParser() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
	private void setUp() {
		
		webDriver = new FirefoxDriver();
	
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}

	public PlayerPitchingData parse(String url) {
		
		setUp();
		
		webDriver.get(url);
		
		PlayerPitchingData data = new PlayerPitchingData();

		SplitStatsParser splitStatsParser = new SplitStatsParser();
		SabermetricsParser sabermetricsParser = new SabermetricsParser();
//		EyeParser eyeParser = new EyeParser();
		RISPParser rispParser = new RISPParser();
		SplitStatsRunnerParser runnerParser = new SplitStatsRunnerParser();
//		SplitStatsScoreParser scoreParser = new SplitStatsScoreParser();
		SplitStatsVsParser vsParser = new SplitStatsVsParser();
		SplitStatsPitchTypeParser pitchTypeParser = new SplitStatsPitchTypeParser();
		SplitStatsCountParser countParser = new SplitStatsCountParser();
//		SplitStatsInningParser inningParser = new SplitStatsInningParser();
//		SplitStatsAngleParser angleParser = new SplitStatsAngleParser();

		WebElement  mainElement = webDriver.findElement(By.cssSelector("div#main"));
		List<WebElement> tables = mainElement.findElements(By.cssSelector("table.table-02"));
		for(WebElement table : tables) {

			// Splits
			if(null == data.splitStatsDataTable) {
				data.splitStatsDataTable = splitStatsParser.parse(table);
				if(null != data.splitStatsDataTable) {
					System.out.println("Splits���擾���܂���.");
					continue;
				}
			}

			// �Z�C�o�[���g���N�X����
			if(null == data.sabermetricsDataTable) {
				data.sabermetricsDataTable = sabermetricsParser.parse(table);
				if(null != data.sabermetricsDataTable) {
					System.out.println("�Z�C�o�[���g���N�X���т��擾���܂���.");
					continue;
				}
			}

			// ���_����ŗ�����
			if(null == data.splitStatsRISPDataTable) {
				data.splitStatsRISPDataTable = rispParser.parse(table);
				if(null != data.splitStatsRISPDataTable) {
					System.out.println("���_����ŗ����т��擾���܂���.");
					continue;
				}
			}

			// �����i�[�󋵕ʐ���
			if(null == data.splitStatsRunnerDataTable) {
				data.splitStatsRunnerDataTable = runnerParser.parse(table);
				if(null != data.splitStatsRunnerDataTable) {
					System.out.println("�����i�[�󋵕ʐ��т��擾���܂���.");
					continue;
				}
			}

			// ���E�Ŏҕʐ���
			if(null == data.splitStatsVsDataTable) {
				data.splitStatsVsDataTable = vsParser.parse(table);
				if(null != data.splitStatsVsDataTable) {
					System.out.println("���E�Ŏҕʐ��т��擾���܂���.");
					continue;
				}
			}

			// ����ʐ���
			if(null == data.splitStatsPitchTypeDataTable) {
				data.splitStatsPitchTypeDataTable = pitchTypeParser.parse(table);
				if(null != data.splitStatsPitchTypeDataTable) {
					System.out.println("����ʐ��т��擾���܂���.");
					continue;
				}
			}

			// �J�E���g�ʐ���
			if(null == data.splitStatsCountDataTable) {
				data.splitStatsCountDataTable = countParser.parse(table);
				if(null != data.splitStatsCountDataTable) {
					System.out.println("�J�E���g�ʐ��т��擾���܂���.");
					continue;
				}
			}
		}
		
		tearDown();
		
		return data;
	
	}

}

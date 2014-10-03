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
import jp.momotown.datasource.PlayerBattingData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayerBattingParser {

	private WebDriver webDriver;

	public PlayerBattingParser() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
	private void setUp() {
		
		webDriver = new FirefoxDriver();
	
	}

	private void tearDown() {
		
		webDriver.quit();
		
	}
	
	public PlayerBattingData parse(String url) {
		
		setUp();
		
		webDriver.get(url);
		
		PlayerBattingData data = new PlayerBattingData();
		
		SplitStatsParser splitStatsParser = new SplitStatsParser();
		SabermetricsParser sabermetricsParser = new SabermetricsParser();
		EyeParser eyeParser = new EyeParser();
		RISPParser rispParser = new RISPParser();
		SplitStatsRunnerParser runnerParser = new SplitStatsRunnerParser();
		SplitStatsScoreParser scoreParser = new SplitStatsScoreParser();
		SplitStatsVsParser vsParser = new SplitStatsVsParser();
		SplitStatsPitchTypeParser pitchTypeParser = new SplitStatsPitchTypeParser();
		SplitStatsCountParser countParser = new SplitStatsCountParser();
		SplitStatsInningParser inningParser = new SplitStatsInningParser();
		SplitStatsAngleParser angleParser = new SplitStatsAngleParser();
		
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
			
			// �I����֘A
			if(null == data.eyeDataTable) {
				data.eyeDataTable = eyeParser.parse(table);
				if(null != data.eyeDataTable) {
					System.out.println("�I����֘A���擾���܂���.");
					continue;
				}
			}
			
			// ���_������
			if(null == data.splitStatsRISPDataTable) {
				data.splitStatsRISPDataTable = rispParser.parse(table);
				if(null != data.splitStatsRISPDataTable) {
					System.out.println("���_�����т��擾���܂���.");
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

			// ���_���󋵕ʐ���
			if(null == data.splitStatsScoreDataTable) {
				data.splitStatsScoreDataTable = scoreParser.parse(table);
				if(null != data.splitStatsScoreDataTable) {
					System.out.println("���_���󋵕ʐ��т��擾���܂���.");
					continue;
				}
			}

			// ���E���萬��
			if(null == data.splitStatsVsDataTable) {
				data.splitStatsVsDataTable = vsParser.parse(table);
				if(null != data.splitStatsVsDataTable) {
					System.out.println("���E���萬�т��擾���܂���.");
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
			
			// �C�j���O�ʐ���
			if(null == data.splitStatsInningDataTable) {
				data.splitStatsInningDataTable = inningParser.parse(table);
				if(null != data.splitStatsInningDataTable) {
					System.out.println("�C�j���O�ʐ��т��擾���܂���.");
					continue;
				}
			}
			
			// �ΐ퐬��

			System.out.println("��͂ł��܂���ł���.");
		}

		// �ŋ������ʐ���
		WebElement diamond = mainElement.findElement(By.cssSelector("div#counthoko div#diamond"));
		if(null == data.splitStatsAngleDataTable) {
			data.splitStatsAngleDataTable = angleParser.parse(diamond);
			if(null != data.splitStatsAngleDataTable) {
				System.out.println("�ŋ������ʐ��т��擾���܂���.");
			}
		}
		
		tearDown();
		
		return data;
	
	}

}

package jp.momotown;

import jp.momotown.datasource.PlayerPitchingData;

import org.openqa.selenium.WebDriver;
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

		tearDown();
		
		return data;
	
	}

}

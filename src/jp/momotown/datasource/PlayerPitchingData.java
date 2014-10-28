package jp.momotown.datasource;

import jp.momotown.datasource.pitching.SabermetricsDataTable;
import jp.momotown.datasource.pitching.SplitStatsCountDataTable;
import jp.momotown.datasource.pitching.SplitStatsDataTable;
import jp.momotown.datasource.pitching.SplitStatsPitchTypeDataTable;
import jp.momotown.datasource.pitching.SplitStatsRISPDataTable;
import jp.momotown.datasource.pitching.SplitStatsRunnerDataTable;
import jp.momotown.datasource.pitching.SplitStatsVsDataTable;

public class PlayerPitchingData {
	
	public String team;
	public String name;
	public SplitStatsDataTable				splitStatsDataTable;			// Split
	public SabermetricsDataTable			sabermetricsDataTable;			// �Z�C�o�[���g���N�X����
	public SplitStatsRISPDataTable			splitStatsRISPDataTable;		// ���_����ŗ�����
	public SplitStatsRunnerDataTable		splitStatsRunnerDataTable;		// �󋵕ʐ���
	public SplitStatsVsDataTable			splitStatsVsDataTable;			// ���E�Ŏҕʐ���
	public SplitStatsPitchTypeDataTable	splitStatsPitchTypeDataTable;	// ����ʐ���
	public SplitStatsCountDataTable		splitStatsCountDataTable;		// �J�E���g�ʐ���

	public PlayerPitchingData() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

}

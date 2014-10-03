package jp.momotown.datasource;

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

public class PlayerBattingData {
	
	public String team;
	public String name;
	public SplitStatsDataTable				splitStatsDataTable;			// Split
	public SabermetricsDataTable			sabermetricsDataTable;			// �Z�C�o�[���g���N�X����
	public EyeDataTable					eyeDataTable;					// �I����֘A
	public SplitStatsRISPDataTable			splitStatsRISPDataTable;		// ���_������
	public SplitStatsRunnerDataTable		splitStatsRunnerDataTable;		// �󋵕ʐ��у}�g���N�X�\
	public SplitStatsScoreDataTable		splitStatsScoreDataTable;		// ���_���󋵕ʐ���
	public SplitStatsVsDataTable			splitStatsVsDataTable;			// ���E���萬��
	public SplitStatsPitchTypeDataTable	splitStatsPitchTypeDataTable;	// ����ʈ��Ŋ���
	public SplitStatsCountDataTable		splitStatsCountDataTable;		// �J�E���g�ʐ���
	public SplitStatsAngleDataTable		splitStatsAngleDataTable;		// �ŋ������ʐ���
	public SplitStatsInningDataTable		splitStatsInningDataTable;		// �C�j���O�ʐ���

	public PlayerBattingData() {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

}

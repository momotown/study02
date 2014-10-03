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
	public SabermetricsDataTable			sabermetricsDataTable;			// セイバーメトリクス成績
	public EyeDataTable					eyeDataTable;					// 選球眼関連
	public SplitStatsRISPDataTable			splitStatsRISPDataTable;		// 得点圏成績
	public SplitStatsRunnerDataTable		splitStatsRunnerDataTable;		// 状況別成績マトリクス表
	public SplitStatsScoreDataTable		splitStatsScoreDataTable;		// 得点差状況別成績
	public SplitStatsVsDataTable			splitStatsVsDataTable;			// 左右投手成績
	public SplitStatsPitchTypeDataTable	splitStatsPitchTypeDataTable;	// 球種別安打割合
	public SplitStatsCountDataTable		splitStatsCountDataTable;		// カウント別成績
	public SplitStatsAngleDataTable		splitStatsAngleDataTable;		// 打球方向別成績
	public SplitStatsInningDataTable		splitStatsInningDataTable;		// イニング別成績

	public PlayerBattingData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}

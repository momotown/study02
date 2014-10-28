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
	public SabermetricsDataTable			sabermetricsDataTable;			// セイバーメトリクス成績
	public SplitStatsRISPDataTable			splitStatsRISPDataTable;		// 得点圏被打率成績
	public SplitStatsRunnerDataTable		splitStatsRunnerDataTable;		// 状況別成績
	public SplitStatsVsDataTable			splitStatsVsDataTable;			// 左右打者別成績
	public SplitStatsPitchTypeDataTable	splitStatsPitchTypeDataTable;	// 球種別成績
	public SplitStatsCountDataTable		splitStatsCountDataTable;		// カウント別成績

	public PlayerPitchingData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}

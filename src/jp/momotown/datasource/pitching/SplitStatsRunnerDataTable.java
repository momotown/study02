package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import jp.momotown.datasource.pitching.SplitStatsRunnerChildDataTable;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsRunnerDataTable extends DataTable {
	
	public List<SplitStatsRunnerChildDataTable> childDataTables = new ArrayList<SplitStatsRunnerChildDataTable>();

	public SplitStatsRunnerDataTable() {
		
		setCustomProperty("テーブル名", "状況別成績マトリクス表");

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("runnner",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("lead",		ValueType.TEXT,		"リード"));
		cd.add(new ColumnDescription("even",		ValueType.TEXT,		"同点"));
		cd.add(new ColumnDescription("behind",		ValueType.TEXT,		"ビハインド"));
		cd.add(new ColumnDescription("total",		ValueType.TEXT,		"計"));
		
		addColumns(cd);
		
		
		String nameOfParentTable = getCustomProperty("テーブル名");
		SplitStatsRunnerChildDataTable child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（リード）");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（同点）");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（ビハインド）");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（計）");
		childDataTables.add(child);
		
	}

}

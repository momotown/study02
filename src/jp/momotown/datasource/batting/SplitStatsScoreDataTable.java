package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsScoreDataTable extends DataTable {

	public List<SplitStatsScoreChildDataTable> childDataTables = new ArrayList<SplitStatsScoreChildDataTable>();

	public SplitStatsScoreDataTable() {
		
		setCustomProperty("テーブル名", "得点差状況別成績");

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("score",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("total",		ValueType.TEXT,		"通算"));
		cd.add(new ColumnDescription("RISP",		ValueType.TEXT,		"得点圏"));
		
		addColumns(cd);
		
		
		String nameOfParentTable = getCustomProperty("テーブル名");
		SplitStatsScoreChildDataTable child = new SplitStatsScoreChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（通算）");
		childDataTables.add(child);
		
		child = new SplitStatsScoreChildDataTable();
		child.setCustomProperty("テーブル名",  nameOfParentTable + "（得点圏）");
		childDataTables.add(child);
		
		
	}

}

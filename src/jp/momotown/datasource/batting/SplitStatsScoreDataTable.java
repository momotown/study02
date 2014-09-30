package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsScoreDataTable extends DataTable {

	public List<SplitStatsScoreChildDataTable> childDataTables = new ArrayList<SplitStatsScoreChildDataTable>();

	public SplitStatsScoreDataTable() {

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("score",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("total",		ValueType.TEXT,		"’ÊŽZ"));
		cd.add(new ColumnDescription("RISP",		ValueType.TEXT,		"“¾“_Œ—"));
		
		addColumns(cd);
		
		for(int i = 0; i < 2; ++i) {
			childDataTables.add(new SplitStatsScoreChildDataTable());
		}
		
	}

}

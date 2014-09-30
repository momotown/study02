package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsScoreChildDataTable extends DataTable {

	public SplitStatsScoreChildDataTable() {

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("score",		ValueType.TEXT,		"得点差"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"率"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"打"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"安"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"本"));
		cd.add(new ColumnDescription("RBI",			ValueType.TEXT,		"点"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"三振"));
		
		addColumns(cd);

	}

}

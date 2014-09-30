package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsScoreChildDataTable extends DataTable {

	public SplitStatsScoreChildDataTable() {

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("score",		ValueType.TEXT,		"���_��"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"�{"));
		cd.add(new ColumnDescription("RBI",			ValueType.TEXT,		"�_"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"�O�U"));
		
		addColumns(cd);

	}

}

package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsRunnerChildDataTable extends DataTable {

	public SplitStatsRunnerChildDataTable() {

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("runnner",			ValueType.TEXT,		"�����i�["));
		cd.add(new ColumnDescription("BA",					ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("AB",					ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("H",						ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("HR",					ValueType.TEXT,		"�{"));
		cd.add(new ColumnDescription("RBI",					ValueType.TEXT,		"�_"));
		
		addColumns(cd);

	}

}

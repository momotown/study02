package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountDataTable extends DataTable {

	public SplitStatsCountDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",	ValueType.TEXT,		"カウント"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"打率"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"安打"));
		cd.add(new ColumnDescription("1B",			ValueType.TEXT,		"単打"));
		cd.add(new ColumnDescription("2B",			ValueType.TEXT,		"2塁打"));
		cd.add(new ColumnDescription("3B",			ValueType.TEXT,		"3塁打"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"本塁打"));
		
		addColumns(cd);
		
	}

}

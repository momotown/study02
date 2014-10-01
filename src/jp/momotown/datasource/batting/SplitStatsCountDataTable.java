package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountDataTable extends DataTable {

	public SplitStatsCountDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",	ValueType.TEXT,		"�J�E���g"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"�ŗ�"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("1B",			ValueType.TEXT,		"�P��"));
		cd.add(new ColumnDescription("2B",			ValueType.TEXT,		"2�ۑ�"));
		cd.add(new ColumnDescription("3B",			ValueType.TEXT,		"3�ۑ�"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"�{�ۑ�"));
		
		addColumns(cd);
		
	}

}

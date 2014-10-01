package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsAngleDataTable extends DataTable {

	public SplitStatsAngleDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("angle",		ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"�ŗ�"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"�{�ۑ�"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"����"));
		
		addColumns(cd);
		
	}

}

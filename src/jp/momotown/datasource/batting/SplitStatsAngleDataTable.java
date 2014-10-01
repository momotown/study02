package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsAngleDataTable extends DataTable {

	public SplitStatsAngleDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("angle",		ValueType.TEXT,		"ï˚å¸"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"ë≈ó¶"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"ñ{ó€ë≈"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"ë≈êî"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"à¿ë≈"));
		
		addColumns(cd);
		
	}

}

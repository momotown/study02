package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsPitchTypeDataTable extends DataTable {

	public SplitStatsPitchTypeDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("type",		ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"�ŗ�"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"�{"));
		cd.add(new ColumnDescription("BB+HBP",		ValueType.TEXT,		"�l��"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"�O�U"));
		
		addColumns(cd);
		
	}

}

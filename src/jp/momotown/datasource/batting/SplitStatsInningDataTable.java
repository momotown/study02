package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsInningDataTable extends DataTable {

	public SplitStatsInningDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("inning",	ValueType.TEXT,		"�C�j���O"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"��"));
		cd.add(new ColumnDescription("PA",			ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"�{"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"�O�U"));
		cd.add(new ColumnDescription("1B",			ValueType.TEXT,		"1B"));
		cd.add(new ColumnDescription("2B",			ValueType.TEXT,		"2B"));
		cd.add(new ColumnDescription("3B",			ValueType.TEXT,		"3B"));
		cd.add(new ColumnDescription("SH",			ValueType.TEXT,		"�]��"));
		cd.add(new ColumnDescription("SF",			ValueType.TEXT,		"�]��"));
		cd.add(new ColumnDescription("BB",			ValueType.TEXT,		"�l"));
		cd.add(new ColumnDescription("HBP",			ValueType.TEXT,		"��"));
		
		addColumns(cd);
		
	}

}

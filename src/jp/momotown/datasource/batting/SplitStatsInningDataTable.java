package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsInningDataTable extends DataTable {

	public SplitStatsInningDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("inning",	ValueType.TEXT,		"イニング"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"率"));
		cd.add(new ColumnDescription("PA",			ValueType.TEXT,		"打席"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"安打"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"本"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"三振"));
		cd.add(new ColumnDescription("1B",			ValueType.TEXT,		"1B"));
		cd.add(new ColumnDescription("2B",			ValueType.TEXT,		"2B"));
		cd.add(new ColumnDescription("3B",			ValueType.TEXT,		"3B"));
		cd.add(new ColumnDescription("SH",			ValueType.TEXT,		"犠打"));
		cd.add(new ColumnDescription("SF",			ValueType.TEXT,		"犠飛"));
		cd.add(new ColumnDescription("BB",			ValueType.TEXT,		"四"));
		cd.add(new ColumnDescription("HBP",			ValueType.TEXT,		"死"));
		
		addColumns(cd);
		
	}

}

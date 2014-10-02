package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsVsDataTable extends DataTable {

	public SplitStatsVsDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
  	cd.add(new ColumnDescription("hand",	ValueType.TEXT,		""));
  	cd.add(new ColumnDescription("BA",		ValueType.TEXT,		"打率"));
		cd.add(new ColumnDescription("RBI",		ValueType.TEXT,		"打点"));
		cd.add(new ColumnDescription("HR",		ValueType.TEXT,		"本塁打"));
		cd.add(new ColumnDescription("PA",		ValueType.TEXT,		"打席数"));
		cd.add(new ColumnDescription("AB",		ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"安打"));
		cd.add(new ColumnDescription("1B",		ValueType.TEXT,		"単打"));
		cd.add(new ColumnDescription("2B",		ValueType.TEXT,		"2塁打"));
		cd.add(new ColumnDescription("3B",		ValueType.TEXT,		"3塁打"));
		cd.add(new ColumnDescription("BB",		ValueType.TEXT,		"四球"));
		cd.add(new ColumnDescription("HBP",		ValueType.TEXT,		"死球"));
		cd.add(new ColumnDescription("SO",		ValueType.TEXT,		"三振"));
		cd.add(new ColumnDescription("OBP",		ValueType.TEXT,		"出塁率"));
		cd.add(new ColumnDescription("SLG",		ValueType.TEXT,		"長打率"));
		cd.add(new ColumnDescription("OPS",		ValueType.TEXT,		"OPS"));
		
		addColumns(cd);
		
	}

}

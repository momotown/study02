package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsPitchTypeDataTable extends DataTable {

	public SplitStatsPitchTypeDataTable() {
		
		setCustomProperty("テーブル名", "球種別被安打割合");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("type",		ValueType.TEXT,		"球種"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"被打率"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"被打数"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"被安打"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"被本"));
		cd.add(new ColumnDescription("BB+HBP",		ValueType.TEXT,		"被四死"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"奪三振"));
		cd.add(new ColumnDescription("swing",		ValueType.TEXT,		"空振率"));
		cd.add(new ColumnDescription("look",		ValueType.TEXT,		"見逃率"));
		
		addColumns(cd);
		
	}

}

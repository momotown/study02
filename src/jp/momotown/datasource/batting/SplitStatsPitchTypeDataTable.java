package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsPitchTypeDataTable extends DataTable {

	public SplitStatsPitchTypeDataTable() {
		
		setCustomProperty("テーブル名", "球種別安打割合");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("type",		ValueType.TEXT,		"球種"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"打率"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"安打"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"本"));
		cd.add(new ColumnDescription("BB+HBP",		ValueType.TEXT,		"四死"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"三振"));
		
		addColumns(cd);
		
	}

}

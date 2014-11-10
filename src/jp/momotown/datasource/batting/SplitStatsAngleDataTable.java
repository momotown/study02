package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsAngleDataTable extends DataTable {

	public SplitStatsAngleDataTable() {
		
		setCustomProperty("テーブル名", "打球方向別成績");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("angle",		ValueType.TEXT,		"方向"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"打率"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"本塁打"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"安打"));
		
		addColumns(cd);
		
	}

}

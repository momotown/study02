package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountDataTable extends DataTable {
	
	public SplitStatsCountChildDataTable rateTable;

	public SplitStatsCountDataTable() {
		
		setCustomProperty("テーブル名", "カウント別球種配分＆成績");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",			ValueType.TEXT,		"カウント(S-B)"));
		cd.add(new ColumnDescription("rate",			ValueType.TEXT,		"球種配分"));
		cd.add(new ColumnDescription("BA",				ValueType.TEXT,		"被打率"));
		cd.add(new ColumnDescription("AB",				ValueType.TEXT,		"打数"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"被安打"));
		cd.add(new ColumnDescription("HR",				ValueType.TEXT,		"被本"));
		
		addColumns(cd);
		
	}

}

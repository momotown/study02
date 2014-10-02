package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountChildDataTable extends DataTable {

	public SplitStatsCountChildDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",						ValueType.TEXT,		"カウント(S-B)"));
		cd.add(new ColumnDescription("fast",						ValueType.TEXT,		"ストレート"));
		cd.add(new ColumnDescription("slider",					ValueType.TEXT,		"スライダー"));
		cd.add(new ColumnDescription("cutter",					ValueType.TEXT,		"カットボール"));
		cd.add(new ColumnDescription("curve",						ValueType.TEXT,		"カーブ"));
		cd.add(new ColumnDescription("sinkingfast",			ValueType.TEXT,		"シュート"));
		cd.add(new ColumnDescription("fork",						ValueType.TEXT,		"フォーク"));
		cd.add(new ColumnDescription("sinker",					ValueType.TEXT,		"シンカー"));
		cd.add(new ColumnDescription("change",					ValueType.TEXT,		"チェンジアップ"));
		cd.add(new ColumnDescription("special",					ValueType.TEXT,		"特殊球"));
		
		addColumns(cd);
		
	}

}

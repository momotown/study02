package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SabermetricsDataTable extends DataTable {

	public SabermetricsDataTable() {
		
		setCustomProperty("テーブル名", "セイバーメトリクス成績");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("league",		ValueType.TEXT,		"リーグ"));
		cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"被打率"));
		cd.add(new ColumnDescription("OBP",			ValueType.TEXT,		"被出塁率"));
		cd.add(new ColumnDescription("SLG",			ValueType.TEXT,		"被長打率"));
		cd.add(new ColumnDescription("OPS",			ValueType.TEXT,		"被OPS"));
		cd.add(new ColumnDescription("QS",			ValueType.TEXT,		"QS"));
		cd.add(new ColumnDescription("QSP",			ValueType.TEXT,		"QS率"));
		cd.add(new ColumnDescription("FIP",			ValueType.TEXT,		"FIP"));
		cd.add(new ColumnDescription("LOBP",		ValueType.TEXT,		"LOB%"));
		cd.add(new ColumnDescription("DIPS1",		ValueType.TEXT,		"DIPS1"));
		cd.add(new ColumnDescription("DIPS2",		ValueType.TEXT,		"DIPS2"));
		cd.add(new ColumnDescription("BB9",			ValueType.TEXT,		"BB/9"));
		cd.add(new ColumnDescription("HR9",			ValueType.TEXT,		"HR/9"));
		cd.add(new ColumnDescription("RSAA",		ValueType.TEXT,		"RSAA"));
		cd.add(new ColumnDescription("WHIP",		ValueType.TEXT,		"WHIP"));
		
		addColumns(cd);
		
	}

}

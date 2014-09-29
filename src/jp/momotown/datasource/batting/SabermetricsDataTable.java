package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SabermetricsDataTable extends DataTable {

	public SabermetricsDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
  	cd.add(new ColumnDescription("リーグ",	ValueType.TEXT,		"リーグ"));
  	cd.add(new ColumnDescription("NOI",			ValueType.TEXT,		"NOI"));
		cd.add(new ColumnDescription("GPA",			ValueType.TEXT,		"GPA"));
		cd.add(new ColumnDescription("IsoD",		ValueType.TEXT,		"IsoD"));
		cd.add(new ColumnDescription("IsoP",		ValueType.TEXT,		"IsoP"));
		cd.add(new ColumnDescription("BABIP",		ValueType.TEXT,		"BABIP"));
		cd.add(new ColumnDescription("BB/K",		ValueType.TEXT,		"BB/K"));
		cd.add(new ColumnDescription("PA/K",		ValueType.TEXT,		"PA/K"));
		cd.add(new ColumnDescription("AB/HR",		ValueType.TEXT,		"AB/HR"));
		cd.add(new ColumnDescription("SecA",		ValueType.TEXT,		"SecA"));
		cd.add(new ColumnDescription("TA",			ValueType.TEXT,		"TA"));
		cd.add(new ColumnDescription("PS",			ValueType.TEXT,		"PS"));
		cd.add(new ColumnDescription("RC",			ValueType.TEXT,		"RC"));
		cd.add(new ColumnDescription("RC27",		ValueType.TEXT,		"RC27"));
		cd.add(new ColumnDescription("XR",			ValueType.TEXT,		"XR"));
		cd.add(new ColumnDescription("XR27",		ValueType.TEXT,		"XR27"));
		cd.add(new ColumnDescription("XR+",			ValueType.TEXT,		"XR+"));
		cd.add(new ColumnDescription("XRWIN",		ValueType.TEXT,		"XRWIN"));
		
		addColumns(cd);
		
	}

}

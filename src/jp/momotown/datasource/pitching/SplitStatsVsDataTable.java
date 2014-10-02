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
  	cd.add(new ColumnDescription("BA",		ValueType.TEXT,		"�ŗ�"));
		cd.add(new ColumnDescription("RBI",		ValueType.TEXT,		"�œ_"));
		cd.add(new ColumnDescription("HR",		ValueType.TEXT,		"�{�ۑ�"));
		cd.add(new ColumnDescription("PA",		ValueType.TEXT,		"�ŐȐ�"));
		cd.add(new ColumnDescription("AB",		ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",			ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("1B",		ValueType.TEXT,		"�P��"));
		cd.add(new ColumnDescription("2B",		ValueType.TEXT,		"2�ۑ�"));
		cd.add(new ColumnDescription("3B",		ValueType.TEXT,		"3�ۑ�"));
		cd.add(new ColumnDescription("BB",		ValueType.TEXT,		"�l��"));
		cd.add(new ColumnDescription("HBP",		ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("SO",		ValueType.TEXT,		"�O�U"));
		cd.add(new ColumnDescription("OBP",		ValueType.TEXT,		"�o�ۗ�"));
		cd.add(new ColumnDescription("SLG",		ValueType.TEXT,		"���ŗ�"));
		cd.add(new ColumnDescription("OPS",		ValueType.TEXT,		"OPS"));
		
		addColumns(cd);
		
	}

}

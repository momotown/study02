package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsPitchTypeDataTable extends DataTable {

	public SplitStatsPitchTypeDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
  	cd.add(new ColumnDescription("type",		ValueType.TEXT,		"‹…í"));
  	cd.add(new ColumnDescription("BA",			ValueType.TEXT,		"”í‘Å—¦"));
		cd.add(new ColumnDescription("AB",			ValueType.TEXT,		"”í‘Å”"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"”íˆÀ‘Å"));
		cd.add(new ColumnDescription("HR",			ValueType.TEXT,		"”í–{"));
		cd.add(new ColumnDescription("BB+HBP",	ValueType.TEXT,		"”íl€"));
		cd.add(new ColumnDescription("SO",			ValueType.TEXT,		"’DOU"));
		cd.add(new ColumnDescription("swing",		ValueType.TEXT,		"‹óU—¦"));
		cd.add(new ColumnDescription("look",		ValueType.TEXT,		"Œ©“¦—¦"));
		
		addColumns(cd);
		
	}

}

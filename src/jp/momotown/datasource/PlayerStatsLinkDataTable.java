package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class PlayerStatsLinkDataTable extends DataTable {

	public PlayerStatsLinkDataTable() {
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("name",	ValueType.TEXT,		"�I�薼"));
		cd.add(new ColumnDescription("link",	ValueType.TEXT,		"�����N"));
		
		addColumns(cd);
		
	}

}

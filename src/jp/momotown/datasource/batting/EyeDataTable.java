package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class EyeDataTable extends DataTable {
	
	public String nameOfTable;

	public EyeDataTable() {
		
		setCustomProperty("テーブル名", "選球眼関連");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("ボール球計",			ValueType.TEXT,		"ボール球計"));
		cd.add(new ColumnDescription("見極数",				ValueType.TEXT,		"見極数"));
		cd.add(new ColumnDescription("見極率",				ValueType.TEXT,		"見極率"));
		cd.add(new ColumnDescription("ストライクゾーン計",	ValueType.TEXT,		"ストライクゾーン計"));
		cd.add(new ColumnDescription("見逃",				ValueType.TEXT,		"見逃"));
		cd.add(new ColumnDescription("空振",				ValueType.TEXT,		"空振"));
		cd.add(new ColumnDescription("スイング率",			ValueType.TEXT,		"スイング率"));
		cd.add(new ColumnDescription("見逃率",				ValueType.TEXT,		"見逃率"));
		cd.add(new ColumnDescription("空振率",				ValueType.TEXT,		"空振率"));
		
		addColumns(cd);
		
	}

}

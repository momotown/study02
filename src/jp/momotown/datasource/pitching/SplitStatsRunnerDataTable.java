package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsRunnerDataTable extends DataTable {
	
	public List<SplitStatsRunnerChildDataTable> childDataTables = new ArrayList<SplitStatsRunnerChildDataTable>();

	public SplitStatsRunnerDataTable() {

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("runnner",			ValueType.TEXT,		""));
		cd.add(new ColumnDescription("behind",			ValueType.TEXT,		"�r�n�C���h"));
		cd.add(new ColumnDescription("even",				ValueType.TEXT,		"���_"));
		cd.add(new ColumnDescription("lead",				ValueType.TEXT,		"���[�h"));
		cd.add(new ColumnDescription("total",				ValueType.TEXT,		"�v"));
		
		addColumns(cd);
		
		for(int i = 0; i < 4; ++i) {
			childDataTables.add(new SplitStatsRunnerChildDataTable());
		}
		
	}

}

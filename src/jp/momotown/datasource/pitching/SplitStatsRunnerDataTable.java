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
		cd.add(new ColumnDescription("behind",			ValueType.TEXT,		"ビハインド"));
		cd.add(new ColumnDescription("even",				ValueType.TEXT,		"同点"));
		cd.add(new ColumnDescription("lead",				ValueType.TEXT,		"リード"));
		cd.add(new ColumnDescription("total",				ValueType.TEXT,		"計"));
		
		addColumns(cd);
		
		for(int i = 0; i < 4; ++i) {
			childDataTables.add(new SplitStatsRunnerChildDataTable());
		}
		
	}

}

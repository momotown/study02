package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsScoreDataTable extends DataTable {

	public List<SplitStatsScoreChildDataTable> childDataTables = new ArrayList<SplitStatsScoreChildDataTable>();

	public SplitStatsScoreDataTable() {
		
		setCustomProperty("�e�[�u����", "���_���󋵕ʐ���");

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("score",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("total",		ValueType.TEXT,		"�ʎZ"));
		cd.add(new ColumnDescription("RISP",		ValueType.TEXT,		"���_��"));
		
		addColumns(cd);
		
		
		String nameOfParentTable = getCustomProperty("�e�[�u����");
		SplitStatsScoreChildDataTable child = new SplitStatsScoreChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i�ʎZ�j");
		childDataTables.add(child);
		
		child = new SplitStatsScoreChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i���_���j");
		childDataTables.add(child);
		
		
	}

}

package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import jp.momotown.datasource.pitching.SplitStatsRunnerChildDataTable;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsRunnerDataTable extends DataTable {
	
	public List<SplitStatsRunnerChildDataTable> childDataTables = new ArrayList<SplitStatsRunnerChildDataTable>();

	public SplitStatsRunnerDataTable() {
		
		setCustomProperty("�e�[�u����", "�󋵕ʐ��у}�g���N�X�\");

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("runnner",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("lead",		ValueType.TEXT,		"���[�h"));
		cd.add(new ColumnDescription("even",		ValueType.TEXT,		"���_"));
		cd.add(new ColumnDescription("behind",		ValueType.TEXT,		"�r�n�C���h"));
		cd.add(new ColumnDescription("total",		ValueType.TEXT,		"�v"));
		
		addColumns(cd);
		
		
		String nameOfParentTable = getCustomProperty("�e�[�u����");
		SplitStatsRunnerChildDataTable child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i���[�h�j");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i���_�j");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i�r�n�C���h�j");
		childDataTables.add(child);
		
		child = new SplitStatsRunnerChildDataTable();
		child.setCustomProperty("�e�[�u����",  nameOfParentTable + "�i�v�j");
		childDataTables.add(child);
		
	}

}

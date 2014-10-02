package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountChildDataTable extends DataTable {

	public SplitStatsCountChildDataTable() {
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",						ValueType.TEXT,		"�J�E���g(S-B)"));
		cd.add(new ColumnDescription("fast",						ValueType.TEXT,		"�X�g���[�g"));
		cd.add(new ColumnDescription("slider",					ValueType.TEXT,		"�X���C�_�["));
		cd.add(new ColumnDescription("cutter",					ValueType.TEXT,		"�J�b�g�{�[��"));
		cd.add(new ColumnDescription("curve",						ValueType.TEXT,		"�J�[�u"));
		cd.add(new ColumnDescription("sinkingfast",			ValueType.TEXT,		"�V���[�g"));
		cd.add(new ColumnDescription("fork",						ValueType.TEXT,		"�t�H�[�N"));
		cd.add(new ColumnDescription("sinker",					ValueType.TEXT,		"�V���J�["));
		cd.add(new ColumnDescription("change",					ValueType.TEXT,		"�`�F���W�A�b�v"));
		cd.add(new ColumnDescription("special",					ValueType.TEXT,		"���ꋅ"));
		
		addColumns(cd);
		
	}

}

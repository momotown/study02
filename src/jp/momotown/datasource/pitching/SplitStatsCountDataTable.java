package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsCountDataTable extends DataTable {
	
	public SplitStatsCountChildDataTable rateTable;

	public SplitStatsCountDataTable() {
		
		setCustomProperty("�e�[�u����", "�J�E���g�ʋ���z��������");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("count",			ValueType.TEXT,		"�J�E���g(S-B)"));
		cd.add(new ColumnDescription("rate",			ValueType.TEXT,		"����z��"));
		cd.add(new ColumnDescription("BA",				ValueType.TEXT,		"��ŗ�"));
		cd.add(new ColumnDescription("AB",				ValueType.TEXT,		"�Ő�"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"�����"));
		cd.add(new ColumnDescription("HR",				ValueType.TEXT,		"��{"));
		
		addColumns(cd);
		
	}

}

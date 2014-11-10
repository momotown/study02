package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class EyeDataTable extends DataTable {
	
	public String nameOfTable;

	public EyeDataTable() {
		
		setCustomProperty("�e�[�u����", "�I����֘A");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("�{�[�����v",			ValueType.TEXT,		"�{�[�����v"));
		cd.add(new ColumnDescription("���ɐ�",				ValueType.TEXT,		"���ɐ�"));
		cd.add(new ColumnDescription("���ɗ�",				ValueType.TEXT,		"���ɗ�"));
		cd.add(new ColumnDescription("�X�g���C�N�]�[���v",	ValueType.TEXT,		"�X�g���C�N�]�[���v"));
		cd.add(new ColumnDescription("����",				ValueType.TEXT,		"����"));
		cd.add(new ColumnDescription("��U",				ValueType.TEXT,		"��U"));
		cd.add(new ColumnDescription("�X�C���O��",			ValueType.TEXT,		"�X�C���O��"));
		cd.add(new ColumnDescription("������",				ValueType.TEXT,		"������"));
		cd.add(new ColumnDescription("��U��",				ValueType.TEXT,		"��U��"));
		
		addColumns(cd);
		
	}

}

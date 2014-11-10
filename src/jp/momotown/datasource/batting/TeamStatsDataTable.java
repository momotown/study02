package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TeamStatsDataTable extends DataTable {

	public TeamStatsDataTable() {
		
	setCustomProperty("�e�[�u����", "�ŎҐ���");
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
   	cd.add(new ColumnDescription("rank",			ValueType.TEXT,		"����"));
  	cd.add(new ColumnDescription("team",			ValueType.TEXT,		"���c"));
	cd.add(new ColumnDescription("name",			ValueType.TEXT,		"�I�薼"));
	cd.add(new ColumnDescription("isFirst",			ValueType.TEXT,		"��R"));
	cd.add(new ColumnDescription("condition",		ValueType.TEXT,		"���q"));
	cd.add(new ColumnDescription("BA",				ValueType.TEXT,		"�ŗ�"));
	cd.add(new ColumnDescription("RBI",				ValueType.TEXT,		"�œ_"));
	cd.add(new ColumnDescription("HR",				ValueType.TEXT,		"�{�ۑ�"));
	cd.add(new ColumnDescription("H",				ValueType.TEXT,		"���Ő�"));
	cd.add(new ColumnDescription("1B",				ValueType.TEXT,		"�P��"));
	cd.add(new ColumnDescription("2B",				ValueType.TEXT,		"2�ۑ�"));
	cd.add(new ColumnDescription("3B",				ValueType.TEXT,		"3�ۑ�"));
	cd.add(new ColumnDescription("L5D",				ValueType.TEXT,		"�ŋ�5����"));
	cd.add(new ColumnDescription("OBP",				ValueType.TEXT,		"�o�ۗ�"));
	cd.add(new ColumnDescription("SLG",				ValueType.TEXT,		"���ŗ�"));
	cd.add(new ColumnDescription("OPS",				ValueType.TEXT,		"OPS"));
	cd.add(new ColumnDescription("RISP-AB",			ValueType.TEXT,		"���_���Ő�"));
	cd.add(new ColumnDescription("RISP-H",			ValueType.TEXT,		"���_������"));
	cd.add(new ColumnDescription("RISP-BA",			ValueType.TEXT,		"���_���ŗ�"));
	cd.add(new ColumnDescription("UC-BA",			ValueType.TEXT,		"UC��"));
	cd.add(new ColumnDescription("UC-HR",			ValueType.TEXT,		"UC�{�ۑ�"));
	cd.add(new ColumnDescription("G",				ValueType.TEXT,		"������"));
	cd.add(new ColumnDescription("PA",				ValueType.TEXT,		"�ŐȐ�"));
	cd.add(new ColumnDescription("AB",				ValueType.TEXT,		"�Ő�"));
	cd.add(new ColumnDescription("R",				ValueType.TEXT,		"���_"));
	cd.add(new ColumnDescription("BB",				ValueType.TEXT,		"�l��"));
	cd.add(new ColumnDescription("HBP",				ValueType.TEXT,		"����"));
	cd.add(new ColumnDescription("TrySB",			ValueType.TEXT,		"�铐��"));
	cd.add(new ColumnDescription("SB",				ValueType.TEXT,		"����"));
	cd.add(new ColumnDescription("SBA",				ValueType.TEXT,		"���ې�����"));
	cd.add(new ColumnDescription("TrySH",			ValueType.TEXT,		"��]��"));
	cd.add(new ColumnDescription("SH",				ValueType.TEXT,		"�]��"));
	cd.add(new ColumnDescription("SHA",				ValueType.TEXT,		"�]�Ő�����"));
	cd.add(new ColumnDescription("SF",				ValueType.TEXT,		"�]��"));
	cd.add(new ColumnDescription("PH-AB",			ValueType.TEXT,		"��Ő�"));
	cd.add(new ColumnDescription("PH-H",			ValueType.TEXT,		"��ň���"));
	cd.add(new ColumnDescription("PH-BA",			ValueType.TEXT,		"��ŗ�"));
	cd.add(new ColumnDescription("DP",				ValueType.TEXT,		"���E"));
	cd.add(new ColumnDescription("E",				ValueType.TEXT,		"����"));
	cd.add(new ColumnDescription("SO",				ValueType.TEXT,		"�O�U"));
		
		addColumns(cd);
		
	}

}

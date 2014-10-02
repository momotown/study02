package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TeamStatsDataTable extends DataTable {

	public TeamStatsDataTable() {
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
   	cd.add(new ColumnDescription("rank",				ValueType.TEXT,			"����"));
  	cd.add(new ColumnDescription("team",				ValueType.TEXT,			"���c"));
		cd.add(new ColumnDescription("name",				ValueType.TEXT,			"�I�薼"));
		cd.add(new ColumnDescription("first",				ValueType.TEXT,			"��R"));
		cd.add(new ColumnDescription("ERA",					ValueType.TEXT,			"�h�䗦"));
		cd.add(new ColumnDescription("Wins",				ValueType.TEXT,			"��"));
		cd.add(new ColumnDescription("Losses",			ValueType.TEXT,			"��"));
		cd.add(new ColumnDescription("Saves",				ValueType.TEXT,			"S"));
		cd.add(new ColumnDescription("SO",					ValueType.TEXT,			"�D�O�U"));
		cd.add(new ColumnDescription("G",						ValueType.TEXT,			"������"));
		cd.add(new ColumnDescription("IP",					ValueType.TEXT,			"������"));
		cd.add(new ColumnDescription("SOP",					ValueType.TEXT,			"�D�O�U��"));
		cd.add(new ColumnDescription("Pitches",			ValueType.TEXT,			"������"));
		cd.add(new ColumnDescription("Batters",			ValueType.TEXT,			"�ŎҐ�"));
		cd.add(new ColumnDescription("H",						ValueType.TEXT,			"�����"));
		cd.add(new ColumnDescription("HR",					ValueType.TEXT,			"��{�ۑ�"));
		cd.add(new ColumnDescription("BB",					ValueType.TEXT,			"�^�l��"));
		cd.add(new ColumnDescription("HBP",					ValueType.TEXT,			"�^����"));
		cd.add(new ColumnDescription("IBB",					ValueType.TEXT,			"�h��"));
		cd.add(new ColumnDescription("R",						ValueType.TEXT,			"���_"));
		cd.add(new ColumnDescription("ER",					ValueType.TEXT,			"���ӓ_"));
		cd.add(new ColumnDescription("CG",					ValueType.TEXT,			"����"));
		cd.add(new ColumnDescription("SHO",					ValueType.TEXT,			"����"));
		cd.add(new ColumnDescription("NoWalks",			ValueType.TEXT,			"���l��"));
		cd.add(new ColumnDescription("BA",					ValueType.TEXT,			"��ŗ�"));
		cd.add(new ColumnDescription("QS",					ValueType.TEXT,			"QS��"));
		cd.add(new ColumnDescription("BackUp-R",		ValueType.TEXT,			"����_"));
		cd.add(new ColumnDescription("BackUp-A",		ValueType.TEXT,			"���엦"));
		cd.add(new ColumnDescription("WHIP",				ValueType.TEXT,			"WHIP"));
		cd.add(new ColumnDescription("UP-AB",				ValueType.TEXT,			"UP�Ő�"));
		cd.add(new ColumnDescription("UP-H",				ValueType.TEXT,			"UP�����"));
		cd.add(new ColumnDescription("UP-BA",				ValueType.TEXT,			"UP��ŗ�"));
		cd.add(new ColumnDescription("UP-HR",				ValueType.TEXT,			"UP��{�ۑ�"));
		cd.add(new ColumnDescription("MaxSpeed",		ValueType.TEXT,			"�ō�����"));
		cd.add(new ColumnDescription("MinSpped",		ValueType.TEXT,			"�Œዅ��"));
		cd.add(new ColumnDescription("SpeedDiff",		ValueType.TEXT,			"������"));
		
		addColumns(cd);
		
	}

}

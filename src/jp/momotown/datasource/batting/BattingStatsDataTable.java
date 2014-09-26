package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class BattingStatsDataTable extends DataTable {

	public BattingStatsDataTable() {
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("splitName",		ValueType.TEXT,			"������"));
		cd.add(new ColumnDescription("G",						ValueType.NUMBER,	"������"));
		cd.add(new ColumnDescription("PA",					ValueType.NUMBER,	"�ŐȐ�"));
		cd.add(new ColumnDescription("AB",					ValueType.NUMBER,	"�Ő�"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"���_"));
		cd.add(new ColumnDescription("H",						ValueType.NUMBER,	"���Ő�"));
		cd.add(new ColumnDescription("2B",					ValueType.NUMBER,	"2�ۑ�"));
		cd.add(new ColumnDescription("3B",					ValueType.NUMBER,	"3�ۑ�"));
		cd.add(new ColumnDescription("HR",					ValueType.NUMBER,	"�{�ۑ�"));
		cd.add(new ColumnDescription("RBI",					ValueType.NUMBER,	"�œ_"));
		cd.add(new ColumnDescription("BA",					ValueType.NUMBER,	"�ŗ�"));
		cd.add(new ColumnDescription("OBP",					ValueType.NUMBER,	"�o�ۗ�"));
		cd.add(new ColumnDescription("SLG",					ValueType.NUMBER,	"���ŗ�"));
		cd.add(new ColumnDescription("OPS",					ValueType.NUMBER,	"OPS"));
		cd.add(new ColumnDescription("RISP-AB",			ValueType.NUMBER,	"���_���Ő�"));
		cd.add(new ColumnDescription("RISP-H",			ValueType.NUMBER,	"���_������"));
		cd.add(new ColumnDescription("RISP-BA",			ValueType.NUMBER,	"���_���ŗ�"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"���_"));
		cd.add(new ColumnDescription("BB",					ValueType.NUMBER,	"�l��"));
		cd.add(new ColumnDescription("HBP",					ValueType.NUMBER,	"����"));
		cd.add(new ColumnDescription("SB",					ValueType.NUMBER,	"����"));
		cd.add(new ColumnDescription("CS",					ValueType.NUMBER,	"���ێ�"));
		cd.add(new ColumnDescription("SH",					ValueType.NUMBER,	"�]��"));
		cd.add(new ColumnDescription("PH-AB",				ValueType.NUMBER,	"��Ő�"));
		cd.add(new ColumnDescription("PH-H",				ValueType.NUMBER,	"��ň���"));
		cd.add(new ColumnDescription("DP",					ValueType.NUMBER,	"���E"));
		cd.add(new ColumnDescription("E",						ValueType.NUMBER,	"����"));
		cd.add(new ColumnDescription("SO",					ValueType.NUMBER,	"�O�U"));
		
		addColumns(cd);

	}
	
	public void addRow(Object... values) {
		
		try {
			addRowFromValues(values);
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}

	}

}

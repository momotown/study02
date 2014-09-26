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
  	
		cd.add(new ColumnDescription("splitName",		ValueType.TEXT,			"分割名"));
		cd.add(new ColumnDescription("G",						ValueType.NUMBER,	"試合数"));
		cd.add(new ColumnDescription("PA",					ValueType.NUMBER,	"打席数"));
		cd.add(new ColumnDescription("AB",					ValueType.NUMBER,	"打数"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"得点"));
		cd.add(new ColumnDescription("H",						ValueType.NUMBER,	"安打数"));
		cd.add(new ColumnDescription("2B",					ValueType.NUMBER,	"2塁打"));
		cd.add(new ColumnDescription("3B",					ValueType.NUMBER,	"3塁打"));
		cd.add(new ColumnDescription("HR",					ValueType.NUMBER,	"本塁打"));
		cd.add(new ColumnDescription("RBI",					ValueType.NUMBER,	"打点"));
		cd.add(new ColumnDescription("BA",					ValueType.NUMBER,	"打率"));
		cd.add(new ColumnDescription("OBP",					ValueType.NUMBER,	"出塁率"));
		cd.add(new ColumnDescription("SLG",					ValueType.NUMBER,	"長打率"));
		cd.add(new ColumnDescription("OPS",					ValueType.NUMBER,	"OPS"));
		cd.add(new ColumnDescription("RISP-AB",			ValueType.NUMBER,	"得点圏打数"));
		cd.add(new ColumnDescription("RISP-H",			ValueType.NUMBER,	"得点圏安打"));
		cd.add(new ColumnDescription("RISP-BA",			ValueType.NUMBER,	"得点圏打率"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"得点"));
		cd.add(new ColumnDescription("BB",					ValueType.NUMBER,	"四球"));
		cd.add(new ColumnDescription("HBP",					ValueType.NUMBER,	"死球"));
		cd.add(new ColumnDescription("SB",					ValueType.NUMBER,	"盗塁"));
		cd.add(new ColumnDescription("CS",					ValueType.NUMBER,	"盗塁死"));
		cd.add(new ColumnDescription("SH",					ValueType.NUMBER,	"犠飛"));
		cd.add(new ColumnDescription("PH-AB",				ValueType.NUMBER,	"代打数"));
		cd.add(new ColumnDescription("PH-H",				ValueType.NUMBER,	"代打安打"));
		cd.add(new ColumnDescription("DP",					ValueType.NUMBER,	"併殺"));
		cd.add(new ColumnDescription("E",						ValueType.NUMBER,	"失策"));
		cd.add(new ColumnDescription("SO",					ValueType.NUMBER,	"三振"));
		
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

package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TeamBattingStatsDataTable extends DataTable {

	public TeamBattingStatsDataTable() {
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
  	cd.add(new ColumnDescription("team",				ValueType.TEXT,			"c"));
		cd.add(new ColumnDescription("name",				ValueType.TEXT,			"Iè¼"));
		cd.add(new ColumnDescription("link",				ValueType.TEXT,			"N"));
		cd.add(new ColumnDescription("isFirst",			ValueType.BOOLEAN,	"êR"));
		cd.add(new ColumnDescription("condition",		ValueType.NUMBER,	"²q"));
		cd.add(new ColumnDescription("BA",					ValueType.NUMBER,	"Å¦"));
		cd.add(new ColumnDescription("RBI",					ValueType.NUMBER,	"Å_"));
		cd.add(new ColumnDescription("HR",					ValueType.NUMBER,	"{ÛÅ"));
		cd.add(new ColumnDescription("H",						ValueType.NUMBER,	"ÀÅ"));
		cd.add(new ColumnDescription("1B",					ValueType.NUMBER,	"PÅ"));
		cd.add(new ColumnDescription("2B",					ValueType.NUMBER,	"2ÛÅ"));
		cd.add(new ColumnDescription("3B",					ValueType.NUMBER,	"3ÛÅ"));
		cd.add(new ColumnDescription("L5D",					ValueType.NUMBER,	"Åß5"));
		cd.add(new ColumnDescription("OBP",					ValueType.NUMBER,	"oÛ¦"));
		cd.add(new ColumnDescription("SLG",					ValueType.NUMBER,	"·Å¦"));
		cd.add(new ColumnDescription("OPS",					ValueType.NUMBER,	"OPS"));
		cd.add(new ColumnDescription("RISP-AB",			ValueType.NUMBER,	"¾_Å"));
		cd.add(new ColumnDescription("RISP-H",			ValueType.NUMBER,	"¾_ÀÅ"));
		cd.add(new ColumnDescription("RISP-BA",			ValueType.NUMBER,	"¾_Å¦"));
		cd.add(new ColumnDescription("UC-BA",				ValueType.NUMBER,	"UC¦"));
		cd.add(new ColumnDescription("UC-HR",				ValueType.NUMBER,	"UC{ÛÅ"));
		cd.add(new ColumnDescription("G",						ValueType.NUMBER,	""));
		cd.add(new ColumnDescription("PA",					ValueType.NUMBER,	"ÅÈ"));
		cd.add(new ColumnDescription("AB",					ValueType.NUMBER,	"Å"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"¾_"));
		cd.add(new ColumnDescription("BB",					ValueType.NUMBER,	"l"));
		cd.add(new ColumnDescription("HBP",					ValueType.NUMBER,	""));
		cd.add(new ColumnDescription("TrySB",				ValueType.NUMBER,	"éÛ"));
		cd.add(new ColumnDescription("SB",					ValueType.NUMBER,	"Û"));
		cd.add(new ColumnDescription("SBA",					ValueType.NUMBER,	"Û¬÷¦"));
		cd.add(new ColumnDescription("TrySH",				ValueType.NUMBER,	"é]Å"));
		cd.add(new ColumnDescription("SH",					ValueType.NUMBER,	"]Å"));
		cd.add(new ColumnDescription("SHA",					ValueType.NUMBER,	"]Å¬÷¦"));
		cd.add(new ColumnDescription("SF",					ValueType.NUMBER,	"]ò"));
		cd.add(new ColumnDescription("PH-AB",				ValueType.NUMBER,	"ãÅ"));
		cd.add(new ColumnDescription("PH-H",				ValueType.NUMBER,	"ãÅÀÅ"));
		cd.add(new ColumnDescription("PH-BA",				ValueType.NUMBER,	"ãÅ¦"));
		cd.add(new ColumnDescription("DP",					ValueType.NUMBER,	"¹E"));
		cd.add(new ColumnDescription("E",						ValueType.NUMBER,	"¸ô"));
		cd.add(new ColumnDescription("SO",					ValueType.NUMBER,	"OU"));
		
		addColumns(cd);
		
	}

}

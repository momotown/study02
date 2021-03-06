package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsDataTable extends DataTable {

	public SplitStatsDataTable() {
		
		setCustomProperty("e[u¼", "Å¬ÑÚ×");

		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		
		cd.add(new ColumnDescription("splitName",		ValueType.TEXT,		""));
		cd.add(new ColumnDescription("team",			ValueType.TEXT,		""));
		cd.add(new ColumnDescription("BA",				ValueType.TEXT,		"Å¦"));
		cd.add(new ColumnDescription("RBI",				ValueType.TEXT,		"Å_"));
		cd.add(new ColumnDescription("HR",				ValueType.TEXT,		"{ÛÅ"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,		"ÀÅ"));
		cd.add(new ColumnDescription("1B",				ValueType.TEXT,		"PÅ"));
		cd.add(new ColumnDescription("2B",				ValueType.TEXT,		"2ÛÅ"));
		cd.add(new ColumnDescription("3B",				ValueType.TEXT,		"3ÛÅ"));
		cd.add(new ColumnDescription("L5D",				ValueType.TEXT,		"Åß5"));
		cd.add(new ColumnDescription("OBP",				ValueType.TEXT,		"oÛ¦"));
		cd.add(new ColumnDescription("SLG",				ValueType.TEXT,		"·Å¦"));
		cd.add(new ColumnDescription("OPS",				ValueType.TEXT,		"OPS"));
		cd.add(new ColumnDescription("RISP-AB",			ValueType.TEXT,		"¾_Å"));
		cd.add(new ColumnDescription("RISP-H",			ValueType.TEXT,		"¾_ÀÅ"));
		cd.add(new ColumnDescription("RISP-BA",			ValueType.TEXT,		"¾_Å¦"));
		cd.add(new ColumnDescription("UC-AB",			ValueType.TEXT,		"UCÅ"));
		cd.add(new ColumnDescription("UC-H",			ValueType.TEXT,		"UCÀÅ"));
		cd.add(new ColumnDescription("UC-BA",			ValueType.TEXT,		"UC¦"));
		cd.add(new ColumnDescription("UC-HR",			ValueType.TEXT,		"UC{ÛÅ"));
		cd.add(new ColumnDescription("G",				ValueType.TEXT,		""));
		cd.add(new ColumnDescription("PA",				ValueType.TEXT,		"ÅÈ"));
		cd.add(new ColumnDescription("AB",				ValueType.TEXT,		"Å"));
		cd.add(new ColumnDescription("R",				ValueType.TEXT,		"¾_"));
		cd.add(new ColumnDescription("BB",				ValueType.TEXT,		"l"));
		cd.add(new ColumnDescription("HBP",				ValueType.TEXT,		""));
		cd.add(new ColumnDescription("TrySB",			ValueType.TEXT,		"éÛ"));
		cd.add(new ColumnDescription("SB",				ValueType.TEXT,		"Û"));
		cd.add(new ColumnDescription("SBA",				ValueType.TEXT,		"Û¬÷¦"));
		cd.add(new ColumnDescription("TrySH",			ValueType.TEXT,		"é]Å"));
		cd.add(new ColumnDescription("SH",				ValueType.TEXT,		"]Å"));
		cd.add(new ColumnDescription("SHA",				ValueType.TEXT,		"]Å¬÷¦"));
		cd.add(new ColumnDescription("SF",				ValueType.TEXT,		"]ò"));
		cd.add(new ColumnDescription("PH-AB",			ValueType.TEXT,		"ãÅ"));
		cd.add(new ColumnDescription("PH-H",			ValueType.TEXT,		"ãÅÀÅ"));
		cd.add(new ColumnDescription("PH-BA",			ValueType.TEXT,		"ãÅ¦"));
		cd.add(new ColumnDescription("DP",				ValueType.TEXT,		"¹E"));
		cd.add(new ColumnDescription("E",				ValueType.TEXT,		"¸ô"));
		cd.add(new ColumnDescription("SO",				ValueType.TEXT,		"OU"));
		
		addColumns(cd);

	}

}

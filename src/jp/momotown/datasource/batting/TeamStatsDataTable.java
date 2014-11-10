package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TeamStatsDataTable extends DataTable {

	public TeamStatsDataTable() {
		
	setCustomProperty("テーブル名", "打者成績");
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
   	cd.add(new ColumnDescription("rank",			ValueType.TEXT,		"順位"));
  	cd.add(new ColumnDescription("team",			ValueType.TEXT,		"球団"));
	cd.add(new ColumnDescription("name",			ValueType.TEXT,		"選手名"));
	cd.add(new ColumnDescription("isFirst",			ValueType.TEXT,		"一軍"));
	cd.add(new ColumnDescription("condition",		ValueType.TEXT,		"調子"));
	cd.add(new ColumnDescription("BA",				ValueType.TEXT,		"打率"));
	cd.add(new ColumnDescription("RBI",				ValueType.TEXT,		"打点"));
	cd.add(new ColumnDescription("HR",				ValueType.TEXT,		"本塁打"));
	cd.add(new ColumnDescription("H",				ValueType.TEXT,		"安打数"));
	cd.add(new ColumnDescription("1B",				ValueType.TEXT,		"単打"));
	cd.add(new ColumnDescription("2B",				ValueType.TEXT,		"2塁打"));
	cd.add(new ColumnDescription("3B",				ValueType.TEXT,		"3塁打"));
	cd.add(new ColumnDescription("L5D",				ValueType.TEXT,		"最近5試合"));
	cd.add(new ColumnDescription("OBP",				ValueType.TEXT,		"出塁率"));
	cd.add(new ColumnDescription("SLG",				ValueType.TEXT,		"長打率"));
	cd.add(new ColumnDescription("OPS",				ValueType.TEXT,		"OPS"));
	cd.add(new ColumnDescription("RISP-AB",			ValueType.TEXT,		"得点圏打数"));
	cd.add(new ColumnDescription("RISP-H",			ValueType.TEXT,		"得点圏安打"));
	cd.add(new ColumnDescription("RISP-BA",			ValueType.TEXT,		"得点圏打率"));
	cd.add(new ColumnDescription("UC-BA",			ValueType.TEXT,		"UC率"));
	cd.add(new ColumnDescription("UC-HR",			ValueType.TEXT,		"UC本塁打"));
	cd.add(new ColumnDescription("G",				ValueType.TEXT,		"試合数"));
	cd.add(new ColumnDescription("PA",				ValueType.TEXT,		"打席数"));
	cd.add(new ColumnDescription("AB",				ValueType.TEXT,		"打数"));
	cd.add(new ColumnDescription("R",				ValueType.TEXT,		"得点"));
	cd.add(new ColumnDescription("BB",				ValueType.TEXT,		"四球"));
	cd.add(new ColumnDescription("HBP",				ValueType.TEXT,		"死球"));
	cd.add(new ColumnDescription("TrySB",			ValueType.TEXT,		"企盗塁"));
	cd.add(new ColumnDescription("SB",				ValueType.TEXT,		"盗塁"));
	cd.add(new ColumnDescription("SBA",				ValueType.TEXT,		"盗塁成功率"));
	cd.add(new ColumnDescription("TrySH",			ValueType.TEXT,		"企犠打"));
	cd.add(new ColumnDescription("SH",				ValueType.TEXT,		"犠打"));
	cd.add(new ColumnDescription("SHA",				ValueType.TEXT,		"犠打成功率"));
	cd.add(new ColumnDescription("SF",				ValueType.TEXT,		"犠飛"));
	cd.add(new ColumnDescription("PH-AB",			ValueType.TEXT,		"代打数"));
	cd.add(new ColumnDescription("PH-H",			ValueType.TEXT,		"代打安打"));
	cd.add(new ColumnDescription("PH-BA",			ValueType.TEXT,		"代打率"));
	cd.add(new ColumnDescription("DP",				ValueType.TEXT,		"併殺"));
	cd.add(new ColumnDescription("E",				ValueType.TEXT,		"失策"));
	cd.add(new ColumnDescription("SO",				ValueType.TEXT,		"三振"));
		
		addColumns(cd);
		
	}

}

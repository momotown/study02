package jp.momotown.datasource.batting;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TeamBattingStatsDataTable extends DataTable {

	public TeamBattingStatsDataTable() {
		
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
  	cd.add(new ColumnDescription("team",				ValueType.TEXT,			"球団"));
		cd.add(new ColumnDescription("name",				ValueType.TEXT,			"選手名"));
		cd.add(new ColumnDescription("link",				ValueType.TEXT,			"リンク"));
		cd.add(new ColumnDescription("isFirst",			ValueType.BOOLEAN,	"一軍"));
		cd.add(new ColumnDescription("condition",		ValueType.NUMBER,	"調子"));
		cd.add(new ColumnDescription("BA",					ValueType.NUMBER,	"打率"));
		cd.add(new ColumnDescription("RBI",					ValueType.NUMBER,	"打点"));
		cd.add(new ColumnDescription("HR",					ValueType.NUMBER,	"本塁打"));
		cd.add(new ColumnDescription("H",						ValueType.NUMBER,	"安打数"));
		cd.add(new ColumnDescription("1B",					ValueType.NUMBER,	"単打"));
		cd.add(new ColumnDescription("2B",					ValueType.NUMBER,	"2塁打"));
		cd.add(new ColumnDescription("3B",					ValueType.NUMBER,	"3塁打"));
		cd.add(new ColumnDescription("L5D",					ValueType.NUMBER,	"最近5試合"));
		cd.add(new ColumnDescription("OBP",					ValueType.NUMBER,	"出塁率"));
		cd.add(new ColumnDescription("SLG",					ValueType.NUMBER,	"長打率"));
		cd.add(new ColumnDescription("OPS",					ValueType.NUMBER,	"OPS"));
		cd.add(new ColumnDescription("RISP-AB",			ValueType.NUMBER,	"得点圏打数"));
		cd.add(new ColumnDescription("RISP-H",			ValueType.NUMBER,	"得点圏安打"));
		cd.add(new ColumnDescription("RISP-BA",			ValueType.NUMBER,	"得点圏打率"));
		cd.add(new ColumnDescription("UC-BA",				ValueType.NUMBER,	"UC率"));
		cd.add(new ColumnDescription("UC-HR",				ValueType.NUMBER,	"UC本塁打"));
		cd.add(new ColumnDescription("G",						ValueType.NUMBER,	"試合数"));
		cd.add(new ColumnDescription("PA",					ValueType.NUMBER,	"打席数"));
		cd.add(new ColumnDescription("AB",					ValueType.NUMBER,	"打数"));
		cd.add(new ColumnDescription("R",						ValueType.NUMBER,	"得点"));
		cd.add(new ColumnDescription("BB",					ValueType.NUMBER,	"四球"));
		cd.add(new ColumnDescription("HBP",					ValueType.NUMBER,	"死球"));
		cd.add(new ColumnDescription("TrySB",				ValueType.NUMBER,	"企盗塁"));
		cd.add(new ColumnDescription("SB",					ValueType.NUMBER,	"盗塁"));
		cd.add(new ColumnDescription("SBA",					ValueType.NUMBER,	"盗塁成功率"));
		cd.add(new ColumnDescription("TrySH",				ValueType.NUMBER,	"企犠打"));
		cd.add(new ColumnDescription("SH",					ValueType.NUMBER,	"犠打"));
		cd.add(new ColumnDescription("SHA",					ValueType.NUMBER,	"犠打成功率"));
		cd.add(new ColumnDescription("SF",					ValueType.NUMBER,	"犠飛"));
		cd.add(new ColumnDescription("PH-AB",				ValueType.NUMBER,	"代打数"));
		cd.add(new ColumnDescription("PH-H",				ValueType.NUMBER,	"代打安打"));
		cd.add(new ColumnDescription("PH-BA",				ValueType.NUMBER,	"代打率"));
		cd.add(new ColumnDescription("DP",					ValueType.NUMBER,	"併殺"));
		cd.add(new ColumnDescription("E",						ValueType.NUMBER,	"失策"));
		cd.add(new ColumnDescription("SO",					ValueType.NUMBER,	"三振"));
		
		addColumns(cd);
		
	}

}

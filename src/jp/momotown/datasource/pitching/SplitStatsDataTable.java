package jp.momotown.datasource.pitching;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SplitStatsDataTable extends DataTable {

	public SplitStatsDataTable() {
		
		setCustomProperty("テーブル名", "投手成績詳細");
		
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
  	
		cd.add(new ColumnDescription("splitName",		ValueType.TEXT,			""));
		cd.add(new ColumnDescription("team",			ValueType.TEXT,			""));
		cd.add(new ColumnDescription("ERA",				ValueType.TEXT,			"防御率"));
		cd.add(new ColumnDescription("Wins",			ValueType.TEXT,			"勝"));
		cd.add(new ColumnDescription("Losses",			ValueType.TEXT,			"負"));
		cd.add(new ColumnDescription("Saves",			ValueType.TEXT,			"S"));
		cd.add(new ColumnDescription("SO",				ValueType.TEXT,			"奪三振"));
		cd.add(new ColumnDescription("G",				ValueType.TEXT,			"試合数"));
		cd.add(new ColumnDescription("IP",				ValueType.TEXT,			"投球回"));
		cd.add(new ColumnDescription("SOP",				ValueType.TEXT,			"奪三振率"));
		cd.add(new ColumnDescription("Pitches",			ValueType.TEXT,			"投球数"));
		cd.add(new ColumnDescription("Batters",			ValueType.TEXT,			"打者数"));
		cd.add(new ColumnDescription("H",				ValueType.TEXT,			"被安打"));
		cd.add(new ColumnDescription("HR",				ValueType.TEXT,			"被本塁打"));
		cd.add(new ColumnDescription("BB",				ValueType.TEXT,			"与四球"));
		cd.add(new ColumnDescription("HBP",				ValueType.TEXT,			"与死球"));
		cd.add(new ColumnDescription("IBB",				ValueType.TEXT,			"敬遠"));
		cd.add(new ColumnDescription("R",				ValueType.TEXT,			"失点"));
		cd.add(new ColumnDescription("ER",				ValueType.TEXT,			"自責点"));
		cd.add(new ColumnDescription("CG",				ValueType.TEXT,			"完投"));
		cd.add(new ColumnDescription("SHO",				ValueType.TEXT,			"完封"));
		cd.add(new ColumnDescription("NoWalks",			ValueType.TEXT,			"無四球"));
		cd.add(new ColumnDescription("BA",				ValueType.TEXT,			"被打率"));
		cd.add(new ColumnDescription("QSP",				ValueType.TEXT,			"QS率"));
		cd.add(new ColumnDescription("BackUp-R",		ValueType.TEXT,			"援護点"));
		cd.add(new ColumnDescription("BackUp-A",		ValueType.TEXT,			"援護率"));
		cd.add(new ColumnDescription("WHIP",			ValueType.TEXT,			"WHIP"));
		cd.add(new ColumnDescription("UC-AB",			ValueType.TEXT,			"UC打数"));
		cd.add(new ColumnDescription("UC-H",			ValueType.TEXT,			"UC被安打"));
		cd.add(new ColumnDescription("UC-BA",			ValueType.TEXT,			"UC被打率"));
		cd.add(new ColumnDescription("UC-HR",			ValueType.TEXT,			"UC被本塁打"));
		cd.add(new ColumnDescription("MaxSpeed",		ValueType.TEXT,			"最高球速"));
		cd.add(new ColumnDescription("MinSpped",		ValueType.TEXT,			"最低球速"));
		cd.add(new ColumnDescription("SpeedDiff",		ValueType.TEXT,			"球速差"));
		
		addColumns(cd);
		
	}

}

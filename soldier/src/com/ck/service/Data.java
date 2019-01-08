package com.ck.service;

public class Data {
    public static final int SOLDIER = 10;
    public static final int INFANTRY = 11;
    public static final int SPECIALTROOPS = 12;
    public static final int COMMANDER = 13;
    public static final int PISTOL = 21;
    public static final int RIFLE = 22;
    public static final int GRENADE = 23;
    public static final String[][] SOLDIERS = new String[][]{
    	{"10", "1", "路人甲", "22", "3000"}, 
    	{"13", "2", "路人乙", "32", "18000", "15000", "5"}, 
    	{"11", "3", "路人丙", "23", "7000"}, 
    	{"11", "4", "一大师", "24", "7300"}, 
    	{"12", "5", "二大师", "28", "10000", "5000"}, 
    	{"11", "6", "三大师", "22", "6800"}, 
    	{"12", "7", "四大师", "29", "10800", "5200"}, 
    	{"13", "8", "五大师", "30", "19800", "15000", "3"}, 
    	{"12", "9", "六大师", "26", "9800", "5500"}, 
    	{"11", "10", "七大师", "21", "6600"}, 
    	{"11", "11", "八大师", "25", "7100"}, 
    	{"12", "12", "九大师", "27", "9600", "4800"}
    	};
    public static final String[][] WEAPONS = new String[][]{new String[0], 
    	{"22", "AK47", "7.62"}, 
    	{"21", "伯莱塔92F ", "8000"}, 
    	{"21", "德国HKP7", "3800"}, 
    	{"23", "杀伤型", "M24型柄式"}, 
    	{"21", "沙漠之鹰", "9000"}, 
    	{"21", "中国QSG92", "10000"}, 
    	{"23", "烟雾", "OTO M35"}, 
    	{"22", "M4A1", "5.56"}, 
    	{"21", "鲁格P85", "5000"}, 
    	{"21", "捷克CZ83", "6000"}, 
    	{"22", "95式", "5.8"}};

    public Data() {
    }

}

package com.ms.algo.quickfind;

public enum Commands {

	SHOW("SHOW"),UNION("UNION"),CONNECTED("CONNECTED"),EXIT("EXIT"),HELP("HELP");
	String type;
	Commands(String type){
		this.type=type;
	}
	public String getType() {
		return type;
	}

}

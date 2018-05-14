package auto;

public enum WhatDo {
	NOTHING("Do nothing"),
	RUN_FOR_IT("Run for it"),
	SWITCH("Switch"),
	BEST_OPTION("Robot Choice");

	private final String name;
	WhatDo(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
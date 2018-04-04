package com.xebia.application.enums;

public enum TaskStatus {
	
	PENDING("Pending" , 1),
	COMPLETED("Completed" , 2);

    private final String key;
    private final Integer value;

    TaskStatus(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }



}

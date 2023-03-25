package com.mehmetnuri.springmongodbornek2.enums;

public enum EnumStatusAP {
    ACTIVE("Active"),
    PASSIVE("Passive");

    private final String status;

    EnumStatusAP(String status) {
        this.status = status;
    }
}

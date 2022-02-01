package me.mraxetv.beasttokens.api;

public enum DropType {
    MINING("Mining"),
    FARMING("Farming"),
    MOBS("Mobs"),
    MYTHIC_MOBS("MythicMobs");

    private String path;

    private DropType(String path) {
        this.path = path;
    }

    public String getName(){
        return path;

    }



}

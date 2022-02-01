package me.mraxetv.beasttokens.api.wrappers.shop;

import org.bukkit.configuration.file.FileConfiguration;

public interface BTShopData {

    String getName();

    String getTitle();


    BTItemData getItemData(String id);

    boolean hasItemData(int slot);

    FileConfiguration getConfig();

    void saveConfig();


    public BTShopRotatingData getRotatingData();

    //public HashMap<Integer, ItemData> getGUIContent();



}

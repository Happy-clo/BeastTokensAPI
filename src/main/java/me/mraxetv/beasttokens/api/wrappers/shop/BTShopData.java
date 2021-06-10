package me.mraxetv.beasttokens.api.wrappers.shop;

import org.bukkit.configuration.file.FileConfiguration;

public interface BTShopData {

    String getName();

    String getTitle();

    BTItemData getItemData(int slot);

    boolean hasItemData(int slot);

    FileConfiguration getConfig();

    void saveConfig();

    //public HashMap<Integer, ItemData> getGUIContent();



}

package me.mraxetv.beasttokens.api.wrappers.shop;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashMap;

public interface ShopData {

    String getName();

    String getTitle();

    ItemData getItemData(int slot);

    boolean hasItemData(int slot);

    FileConfiguration getConfig();

    void saveConfig();

    //public HashMap<Integer, ItemData> getGUIContent();



}

package me.mraxetv.beasttokens.api.wrappers.player;

import me.mraxetv.beasttokens.api.wrappers.boosters.ChanceBoosterManager;
import me.mraxetv.beasttokens.api.wrappers.boosters.QuantityBoosterManager;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

public interface BTOfflinePlayer {


    OfflinePlayer getOfflinePlayer();

    String getName();

    UUID getUUID();


    FileConfiguration getConfig();


    void saveFile();



}

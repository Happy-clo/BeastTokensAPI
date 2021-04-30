package me.mraxetv.beasttokens.api.wrappers.player;

import me.mraxetv.beasttokens.api.wrappers.boosters.ChanceBoosterManager;
import me.mraxetv.beasttokens.api.wrappers.boosters.QuantityBoosterManager;
import me.mraxetv.beasttokens.api.wrappers.shop.ShopData;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public interface BTPlayer extends BTOfflinePlayer {
    Player getPlayer();


    boolean hasOpenShop();


    //void setShop(String shop);

    ShopData getShop();
    String getShopName();

    void openShop(String shop);
    void openShop(ShopData shop);

    int getShopPage();
    void setShopPage(int page);

    void reloadBoosters();

    void refreshShop();


    void closeShop();


    QuantityBoosterManager getQuantityBoosters();

    ChanceBoosterManager getChanceBoosterManager();


    //void removeShop();

}

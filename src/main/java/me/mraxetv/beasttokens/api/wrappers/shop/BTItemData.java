package me.mraxetv.beasttokens.api.wrappers.shop;

import me.mraxetv.beasttokens.api.StockType;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

public interface BTItemData {
    String getPermission();

    void setPermission(String permission);

    boolean hasPermission();

    void setPrice(double price);

    void setCmd(List<String> cmd);

    void setRandomCmd(List<String> randomCmd);

    void setPlayerCmd(List<String> playerCmd);

    int getSlot();

    String getId();

    String getShopName();

    List<String> getCmd();

    List<String> getRandomCmd();

    List<String> getPlayerCmd();

    boolean hasCmd();

    boolean hasRandomCmd();

    boolean hasPlayerCmd();

    boolean hasOpenShop();

    String getOpenShop();

    void setOpenShop(String openShop);


    boolean isStockLimited();

    StockType getStockType();

    int getMaxStockAmount();

    int getSoldStockAmount();

    void setSoldStockAmount(int amount);

    double getPrice();

    boolean isCloseShop();

    void setCloseShop(boolean b);

    boolean isFree();

    BTItemStackBuilder getbItemStack();

    boolean isSkull();

    String getSkullName();

    boolean isUpdatable();

    ConfigurationSection getConfig();
}

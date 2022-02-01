package me.mraxetv.beasttokens.api.handlers;

import me.mraxetv.beasttokens.api.wrappers.shop.BTShopData;

import java.util.ArrayList;

public interface BTShopManager {
    boolean isShopExists(String shop);

    ArrayList<String> getShopsList();

    BTShopData getBTShop(String shop);

}

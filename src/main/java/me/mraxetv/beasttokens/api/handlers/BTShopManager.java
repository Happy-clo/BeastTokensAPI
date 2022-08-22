package me.mraxetv.beasttokens.api.handlers;

import me.mraxetv.beasttokens.api.wrappers.shop.BTShopData;

import java.util.ArrayList;
import java.util.Set;

public interface BTShopManager {
    boolean isShopExists(String shop);

    Set<String> getShopsIds();

    ArrayList<String> getShopsList();

    BTShopData getBTShop(String shop);

}

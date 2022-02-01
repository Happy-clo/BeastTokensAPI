package me.mraxetv.beasttokens.api.wrappers.shop;

import java.util.Collection;

public interface BTShopPage {

    void addItem(BTItemData itemData);

    boolean hasItem(int slot);

    boolean hasItem(String id);

    void removeItem(String id);


    Collection<String> getItemDataList();

    BTItemData getItemData(int slot);



}

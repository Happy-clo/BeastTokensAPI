package me.mraxetv.beasttokens.api.wrappers.shop;

public interface BTShopView {

    BTItemData getClickedItem();

    void setClickedItem(BTItemData btItemData);

    boolean hasOpenConfirmMenu();

    boolean setOpenConfirmMenu(boolean b);

    int getShopPage();

    void setShopPage(int page);

}

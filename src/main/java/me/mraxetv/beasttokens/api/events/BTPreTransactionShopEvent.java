package me.mraxetv.beasttokens.api.events;


import me.mraxetv.beasttokens.api.wrappers.shop.BTItemData;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;



public class BTPreTransactionShopEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancelled;


    private BTItemData itemInfo;

    private String shopName;

    private Player player;

    public BTItemData getItemInfo() {
        return itemInfo;
    }

    public Player getPlayer() {
        return player;
    }

    public String getShopName() {
        return shopName;
    }

    public BTPreTransactionShopEvent(Player p , String shopName, BTItemData item){
        this.player= p;
        this.itemInfo = item;
        this.shopName = shopName;
    }


    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        cancelled = b;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}

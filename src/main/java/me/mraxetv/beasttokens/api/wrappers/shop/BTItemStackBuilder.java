package me.mraxetv.beasttokens.api.wrappers.shop;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface BTItemStackBuilder extends Cloneable {

    boolean isItem(Material mat);

    void setType(String material);

    void setAmount(int amount);

    void setDisplayName(String displayName);

    void setLore(List<String> lore);

    void setDurability(int data);

    void setCustomModelData();

    void setCustomModelData(int data);

    void setGlow(boolean b);

     ItemStack clone();


}

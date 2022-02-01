package me.mraxetv.beasttokens;


import me.mraxetv.beasttokens.api.handlers.BTPlayersManager;
import me.mraxetv.beasttokens.api.handlers.BTShopManager;
import me.mraxetv.beasttokens.api.handlers.BTTokensManager;

public interface BeastTokens {


   BTPlayersManager getPlayersManager();
   BTShopManager getBTShopManager();
   BTTokensManager getTokensManager();


}

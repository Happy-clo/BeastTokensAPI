package me.mraxetv.beasttokens;


import me.mraxetv.beasttokens.api.handlers.PlayersManager;
import me.mraxetv.beasttokens.api.handlers.BTShopManager;
import me.mraxetv.beasttokens.api.handlers.TokensManager;

public interface BeastTokens {


   PlayersManager getPlayersManager();
   BTShopManager getShopManager();
   TokensManager getTokensManager();


}

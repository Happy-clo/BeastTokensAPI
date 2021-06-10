package me.mraxetv.beasttokens;

import me.mraxetv.beasttokens.api.handlers.PlayersManager;
import me.mraxetv.beasttokens.api.handlers.BTShopManager;
import me.mraxetv.beasttokens.api.handlers.TokensManager;

public final class BeastTokensAPI {

    private static BeastTokens instance;

    public static PlayersManager getPlayersManger(){
        return instance.getPlayersManager();
    }

    public static BTShopManager getShopManger(){ return instance.getShopManager(); }

    public static TokensManager getTokensManager(){ return instance.getTokensManager(); }


}

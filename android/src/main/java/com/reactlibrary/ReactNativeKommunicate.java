package com.reactlibrary

import io.Kommunicate;

public class ReactNativeKommunicate{
    private static APP_ID;
    private static CONTEXT;

    public static void initMessaging (){
        this.setAppId(appID);
        this.setContext(context);
        Kommunicate.init(CONTEXT, APP_ID);
    }

    public setAppId(appID){
        this.APP_ID = appID;
    }

    public setContext(context){
        this.CONTEXT = context;
    }

    public static void createSingleChat(groupName, kmUser, withPreChat, isUnique, agentList, botList, callback){
        Kommunicate.launchSingleChat(CONTEXT, groupName, kmUser, withPreChat, isUnique, agentList, botList, callback);
    }
}
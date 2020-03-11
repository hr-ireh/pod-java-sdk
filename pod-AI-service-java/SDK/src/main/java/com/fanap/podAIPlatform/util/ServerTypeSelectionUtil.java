package com.fanap.podAIPlatform.util;

import com.fanap.podBaseService.enums.EnumBaseURLPlatform;
import com.fanap.podBaseService.enums.Enum_Server_type;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL() {

//        if (enum_server_type.getValue().equals(Enum_Server_type.PRODUCTION.getValue()))
        return EnumBaseURLPlatform.PRODUCTION.getValue();
//        else
//            return EnumBaseURLPlatform.SANDBOX.getValue();
    }
}

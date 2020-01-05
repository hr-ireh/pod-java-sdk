package com.fanap.podDealing.util;

import com.fanap.podDealing.enums.EnumBaseURLPlatform;
import com.fanap.podDealing.enums.Enum_Server_type;

/**
 * Created by Shahab Askarian on 8/3/2019.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL(Enum_Server_type enum_server_type) {

//        if (enum_server_type.getValue().equals(Enum_Server_type.PRODUCTION.getValue()))
            return EnumBaseURLPlatform.PRODUCTION.getValue();
//        else
//            return EnumBaseURLPlatform.SANDBOX.getValue();
    }
}

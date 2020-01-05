package com.fanap.podNeshan.util;

import com.fanap.podNeshan.enums.EnumBaseURLPlatform;
import com.fanap.podNeshan.enums.Enum_Server_type;

/**
 * Created by Zahra Gholinia on 10/12/2019.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL(Enum_Server_type enum_server_type) {

//        if (enum_server_type.getValue().equals(Enum_Server_type.PRODUCTION.getValue()))
        return EnumBaseURLPlatform.PRODUCTION.getValue();
//        else
//            return EnumBaseURLPlatform.SANDBOX.getValue();
    }
}

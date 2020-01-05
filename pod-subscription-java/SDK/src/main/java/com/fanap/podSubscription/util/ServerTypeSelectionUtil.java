package com.fanap.podSubscription.util;

import com.fanap.podSubscription.enums.EnumBaseURLPlatform;
import com.fanap.podSubscription.enums.Enum_Server_type;

/**
 * Created by Shahab Askarian on 8/3/2019.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL(Enum_Server_type enum_server_type) {


            return EnumBaseURLPlatform.PRODUCTION.getValue();

    }
}

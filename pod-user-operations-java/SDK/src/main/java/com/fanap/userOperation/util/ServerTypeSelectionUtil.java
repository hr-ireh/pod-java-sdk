package com.fanap.userOperation.util;

import com.fanap.userOperation.enums.BaseURL;
import com.fanap.userOperation.enums.Enum_Server_type;

/**
 * Created by Shahab Askarian on 8/3/2019.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL(Enum_Server_type enum_server_type) {

        return BaseURL.PRODUCTION.getValue();

    }
}

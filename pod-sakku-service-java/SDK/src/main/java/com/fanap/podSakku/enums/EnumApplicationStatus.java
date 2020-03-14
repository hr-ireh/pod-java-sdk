package com.fanap.podSakku.enums;

public enum  EnumApplicationStatus {

    /**
     * Running application is an application that is running and accessible  >> db value = 0
     */
    RUNNING,
    /**
     * deploying application is an application is trying to start from base image >> db value = 1
     */
    DEPLOYING,
    /**
     * staged application is an application that is waiting to be deployed >> db value = 2
     */
    STAGED,
    /**
     * stopped application is an application that is stopped and can be started again >> db value = 3
     */
    STOPPED,
    /**
     * app not stopped by user request and can not be restarted! >> db value = 4
     */
    FAILED,
    /**
     * remvoed application is an application that removed and cant be start anyMore >> db value = 5
     */
    REMOVED,


}

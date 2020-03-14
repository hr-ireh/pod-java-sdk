package com.fanap.podSakku.enums;

public enum EnumStateCode {

    NOT_STARTED(1),
    BUILDING_IMAGE(2),
    BUILDING_MODULES(3),
    MODULE_STORAGE(4),
    MODULE_DBASS(5),
    MODULE_PROXY(6),
    DEPLOYING_ON_MARATHON(7),
    CONFIG_DOMAINS(8),
    POST_PROCESS(9),
    HEALTH_CHECK(10),
    ERROR(500),
    COMPLETE(11);

    private final int code;

    EnumStateCode(int v) {
        code = v;
    }

    public int getVal() {
        return code;
    }

    public static EnumStateCode getByVal(int v) {//todo later: save enum (@zamiri)
        switch (v) {
            case 1:
                return NOT_STARTED;
            case 2:
                return BUILDING_IMAGE;
            case 3:
                return BUILDING_MODULES;
            case 4:
                return MODULE_STORAGE;
            case 5:
                return MODULE_DBASS;
            case 6:
                return MODULE_PROXY;
            case 7:
                return DEPLOYING_ON_MARATHON;
            case 8:
                return CONFIG_DOMAINS;
            case 9:
                return POST_PROCESS;
            case 10:
                return HEALTH_CHECK;
            case 500:
                return ERROR;
            case 11:
                return COMPLETE;
            default:
                return NOT_STARTED;
        }
    }


}

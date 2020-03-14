package com.fanap.podSakku.enums;

public enum EnumAccessLevel {

    /**
     * user with {{@link EnumAccessLevel#VIEW}} access level can just see application data, configs,
     * resources and logs
     */
    VIEW(0),
    /**
     * user with {{@link EnumAccessLevel#MODIFY}} access level can change application config and
     * change {{@link  ApplicationStatus}} but cant delete app
     */
    MODIFY(1),

    /**
     * user with {{@link EnumAccessLevel#MODERATE}} access level is same as application owner
     */
    MODERATE(2);


    private int priority;

    EnumAccessLevel(int i) {
        priority = i;
    }

    public static EnumAccessLevel getByNameOrDefault(String name, EnumAccessLevel defaultAccessLevel) {

        if (name == null) {
            return defaultAccessLevel;
        } else {
            try {
                return EnumAccessLevel.valueOf(name);
            } catch (IllegalArgumentException e) {
                return defaultAccessLevel;
            }
        }
    }

    public int getPriority() {
        return priority;
    }

    public boolean isEqualOrHigherThan(EnumAccessLevel outterLevel) {
        if (this == outterLevel || this == MODERATE || (this == MODIFY && outterLevel != MODERATE))
            return true;
        return false;
    }

}

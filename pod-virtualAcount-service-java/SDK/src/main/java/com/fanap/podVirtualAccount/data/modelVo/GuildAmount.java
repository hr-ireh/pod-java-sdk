package com.fanap.podVirtualAccount.data.modelVo;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class GuildAmount {
    private String guildCode;
    private Long amount;

    public GuildAmount(String guildCode, Long amount) {
        this.guildCode = guildCode;
        this.amount = amount;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public GuildAmount setGuildCode(String guildCode) {
        this.guildCode = guildCode;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public GuildAmount setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
}

package com.fanap.podSakku.enums;

public enum EnumRecordType {
    SOA("SOA"),
    A("A"),
    AAAA("AAAA"),
    CAA("CAA"),
    CNAME("CNAME"),
    MX("MX"),
    PTR("PTR"),
    SPF("SPF"),
    SRV("SRV"),
    TXT("TXT"),
    LOC("LOC"),
    NS("NS");
    private String value;

    EnumRecordType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

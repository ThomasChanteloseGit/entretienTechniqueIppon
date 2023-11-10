package fr.ippon.mill.farmer.domain;

public enum TypeCereal {
    BLE("blé"),
    AVOINE("Avoine");
    
    private String value;

    TypeCereal(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

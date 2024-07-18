package org.example;

public class Cup {
    Liquid liquid;

    public <T extends Liquid> T fillOutLiquid(T liquidType) {
        liquid = liquidType;
        return liquidType;
    }

    public void clearUpLiquid() {
        liquid = null;
    }

    Cup(Liquid liquid) {
        this.liquid = liquid;
    }

    Cup() {
    }
}

package com.pluralsight.fruit;

public class Banana implements IFruit {

    private static final String NAME = "Banana Veg";
    private static final int ROLL_MULTIPLIER = 0;

    public String getName() {

        return NAME;
    }

    public int getRollMultiplier() {

        return ROLL_MULTIPLIER;
    }

    public void garbage() {
        int x = 1;
        int y = 2;
    }
}

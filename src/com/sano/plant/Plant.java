package com.sano.plant;

public abstract class Plant {

    protected int currentProductivityLevel;
    protected static  final int defaultGrowing = 4;

    public int produceFood(){
        return 0;
    }
}

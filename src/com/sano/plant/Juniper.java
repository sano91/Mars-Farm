package com.sano.plant;

public class Juniper extends Plant implements EverGreen {
    private static final int defaultProduction = 14;

    @Override
    public void fifthMonthIncrease(int fifthMonth) {
        if(fifthMonth % 5 == 0){
            super.currentProductivityLevel += fifthMOnth;
        }
    }

    @Override
    public void sayFullProduction() {
        if(super.currentProductivityLevel > maxProductivity){
            super.currentProductivityLevel = maxProductivity;
            System.out.println(getClass().getSimpleName() + " at max production level");
        }
    }

    public Juniper(){
        super.currentProductivityLevel = defaultProduction;
    }

    public int produceFood(int m){
        super.currentProductivityLevel += Plant.defaultGrowing;
        fifthMonthIncrease(m);
        sayFullProduction();
        return super.currentProductivityLevel;
    }
}

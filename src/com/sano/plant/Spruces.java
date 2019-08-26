package com.sano.plant;

import com.sano.util.Util;

public class Spruces extends Plant implements ShroomAndRoot, EverGreen {

    private static final int defaultProduction = 26;
    private boolean rot;

    public Spruces(){
        this.rot = false;
        super.currentProductivityLevel = defaultProduction;
    }

    @Override
    public void growShroom() {
        if(Util.giveChance(5)){
            super.currentProductivityLevel += 15;
        }
    }

    @Override
    public void rotten() {
        if(Util.giveChance(4)){
            super.currentProductivityLevel -= 20;
            rot = true;
        }
    }

    @Override
    public void fifthMonthIncrease(int fifth) {
        if(fifth % 5 == 0){
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


    public int produceFood(int month){
        this.rot = false;
        currentProductivityLevel += Plant.defaultGrowing;
        this.growShroom();
        this.fifthMonthIncrease(month);
        this.rotten();
        if(rot){
            this.sayFullProduction();
            return 0;
        }
        this.sayFullProduction();
        return super.currentProductivityLevel;
    }
}

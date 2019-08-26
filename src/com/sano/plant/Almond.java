package com.sano.plant;

import com.sano.util.Util;


public class Almond extends Plant implements ShroomAndRoot {

    private static final int standartProductovity = 50;
    private boolean rot;

    private void doubleProduct(){
        if(!rot && super.currentProductivityLevel < 40 && super.currentProductivityLevel > 0){
            super.currentProductivityLevel = super.currentProductivityLevel * 2;
        }
    }

    @Override
    public void growShroom() {
        if(Util.giveChance(8)){
            System.out.println("Shroom  happened increase product by 10");
            super.currentProductivityLevel += 10;
        }
    }

    @Override
    public void rotten() {
        if(Util.giveChance(13)){
            super.currentProductivityLevel -= 18;
            System.out.println("decreased producticity by 18");
            this.rot = true;
        }
    }

    @Override
    public int produceFood(){
        this.rot = false;
        currentProductivityLevel += Plant.defaultGrowing;
        this.growShroom();
        this.rotten();
        if(this.rot){
            System.out.println("NO produce this month because of rot");
            return 0;
        }
        this.doubleProduct();
        System.out.println(super.currentProductivityLevel);
        return super.currentProductivityLevel;
    }

    public Almond() {
        this.rot = false;
        super.currentProductivityLevel = standartProductovity;
    }

    @Override
    public String toString() {
        return "Almond{" +
                "rot=" + rot +
                ", currentProductivityLevel=" + currentProductivityLevel +
                '}';
    }
}

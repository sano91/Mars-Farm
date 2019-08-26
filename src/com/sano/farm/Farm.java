package com.sano.farm;

import com.sano.plant.Almond;
import com.sano.plant.Juniper;
import com.sano.plant.Plant;
import com.sano.plant.Spruces;

import java.util.HashSet;
import java.util.Set;

public class Farm {

    private Set<Plant> plants;
    private int totalProducedFood;

    private Farm() {
        this.plants = new HashSet<>();
        this.totalProducedFood = 0;
        plants.add(new Spruces());
        plants.add(new Almond());
        plants.add(new Spruces());
        plants.add(new Almond());
        plants.add(new Juniper());
        plants.add(new Juniper());
    }

    private int simulateEightyMonths() {
        for (int i = 0; i < 80; i++) {
            for (Plant plant : plants) {
                if (plant instanceof Almond) {
                    totalProducedFood += ((Almond) plant).produceFood();
                }
                else if( plant instanceof Spruces){
                    totalProducedFood += ((Spruces) plant).produceFood(i);
                }
                else if(plant instanceof Juniper){
                    totalProducedFood += ((Juniper) plant).produceFood(i);
                }
                else{
                    System.out.println("unknown plan");
                }
            }
        }
        System.out.println("Total: " + this.totalProducedFood);
        return totalProducedFood;
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.simulateEightyMonths();
    }
}



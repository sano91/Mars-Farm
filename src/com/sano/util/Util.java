package com.sano.util;

import java.util.concurrent.ThreadLocalRandom;

public class Util {


    public static boolean giveChance(int percentage){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 101);
        return randomNum <= percentage;
    }
}

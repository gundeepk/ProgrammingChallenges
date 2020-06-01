package com.company;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> kidsWithCandies = kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < kidsWithCandies.size() ; i++) {
            System.out.println(kidsWithCandies.get(i));
        }

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> kidsWithCandies = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        

        for (int i = 0; i < candies.length ; i++) {
            int maxCandies = extraCandies + candies[i];
            if (maxCandies >= max){
                kidsWithCandies.add(true);
            }else{
                kidsWithCandies.add(false);
            }
        }

        return kidsWithCandies;
    }

}

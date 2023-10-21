package com.reverse;

class Reverse {

    String reverse(String text){
        char[] inter = text.toCharArray();

        int i=0;
        int j= inter.length-1;

        while(i < j){
            char temp = inter[i];
            inter[i] = inter[j];
            inter[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(inter);

    }

}

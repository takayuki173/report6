package jp.ac.uryukyu.e195756;

import java.util.Arrays;

public class Chincillo {

    public int method(){
        int[] dices = new int[3];
        for (int i = 0; i < dices.length; i++){
            dices[i] = (int)(Math.random() * 6) + 1;
        }
        String list = Arrays.toString(dices);
        System.out.println(list);
        int a = dices[0];
        int b = dices[1];
        int c = dices[2];
        int scores = 0;
        if (a == b){
            if (a == c){
                System.out.println("勝ち");
                scores = 7;
            }
            else{
                scores = c;
                System.out.println("スコアは"+scores+"です");
            }
        }
        else if (b == c){
            scores = a;
            System.out.println("スコアは"+scores+"です");
        }
        else if (a == c){
            scores = b;
            System.out.println("スコアは" +scores+ "です");
        }
        else if (a + b + c == 15){
            System.out.println("勝ち　配当が２倍になります");
            scores = 11;
        }
        else if (a + b + c == 6){
            System.out.println("負け　配当を２倍払います");
            scores = 12;
        }
        else{
            System.out.println("役なしです");
        }
        int score = scores;
        return score;
    }
}

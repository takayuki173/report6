package jp.ac.uryukyu.e195756;

public class Bet {
    int money1 = 10;
    int money2 = 10;
    void method(){
    }
    void win(){
        money1 = +1;
        money2 = -1;
    }
    void loss(){
        money1 = -1;
        money2 = +1;
    }
    void big_win(){
        money1 = money1 +2;
        money2 = money2 -2;
    }
    void big_loss(){
        money1 = money1 -2;
        money2 = money2 +2;
    }

}

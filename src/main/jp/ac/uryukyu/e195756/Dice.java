package jp.ac.uryukyu.e195756;

public class Dice {
    int money1 = 1000;
    int money2 = 1000;
    void method(){
        int score1;
        int score2;
        int score = 0;
        Bet bet = new Bet();
        Chincillo chin = new Chincillo();
        System.out.println("プレイヤー１のターン");
        chin.method();
        score1 = score;
        System.out.println("プレイヤー２のターン");
        chin.method();
        score2 = score;
        if(score1 == 12){
            bet.big_loss();
        }
        if(score2 == 12){
            bet.big_win();
        }
        if(score1  == 11){
            bet.big_win();
        }
        if(score2 == 11){
            bet.big_loss();
        }
        else if(score1<score2){
            bet.loss();
            System.out.println("プレイヤー１の負け");
        }
        else if(score1>score2) {
            bet.win();
            System.out.println("プレイヤー１の勝ち");
        }
        else if(score1==score2){
            System.out.println("引き分け");
        }
        System.out.println("プレイヤー１の持ち金は"+money1+"円。プレイヤー２の持ち金は"+money2+"円。");
    }
}

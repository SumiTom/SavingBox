package com.jsnk77.savingbox;

/**
 * Created by jsnk77 on 14/11/20.
 */
public class SavingBox {

    //合計金額
    private int total;

    //コンストラクタ
    public SavingBox(){
        total = 0;
    }

    //１００円追加
    public void insertCoin100(int coins){
        if(coins > 0){
            total += coins*100;
        }
    }

    //５００円追加
    public void insertCoin500(int coins){
        if(coins>0){
            total += coins*500;
        }
    }

    //１０００円追加
    public void insertCash1000(int coins){
        if(coins>0){
            total += coins * 1000;
        }
    }

    //合計出力
    public int getTotal(){
        return total;
    }
}

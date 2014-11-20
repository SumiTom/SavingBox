package com.jsnk77.savingbox;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.microsoft.windowsazure.mobileservices.MobileServiceApplication;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //100円追加のボタンイベント
        Button btn =(Button)findViewById(R.id.onehButton);
        btn.setOnClickListener(
                new View.OnClickListener(){

                    public void onClick(View view){

                        //コインの枚数のID獲得
                        EditText coinsNumber =(EditText)findViewById(R.id.coinsNumber);

                        //string →　int 変換
                        Editable getText = coinsNumber.getText();
                        int int_text = Integer.parseInt(getText.toString());

                        //SavingBoxクラスで計算　total_yenに合計を代入
                        SavingBox input = new SavingBox();
                        input.insertCoin100(int_text);
                        int total_yen = input.getTotal();

                        //totalCashにtotal_yenを代入　テキストボックスに結果を表示
                        TextView totalCash =(TextView)findViewById(R.id.totalCash);
                        totalCash.setText(String.format("%d円です", total_yen));

                    }
                }
        );

                      

        //500円追加のボタンイベント
        Button btn1 =(Button)findViewById(R.id.fivehButton);
        btn1.setOnClickListener(
                new View.OnClickListener(){

                    public void onClick(View view){

                        //コインの枚数のID獲得
                        EditText coinsNumber =(EditText)findViewById(R.id.coinsNumber);

                        //string →　int 変換
                        Editable getText = coinsNumber.getText();
                        int int_text = Integer.parseInt(getText.toString());

                        //SavingBoxクラスで計算　total_yenに合計を代入
                        SavingBox input = new SavingBox();
                        input.insertCoin500(int_text);
                        int total_yen = input.getTotal();

                        //totalCashにtotal_yenを代入　テキストボックスに結果を表示
                        TextView totalCash =(TextView)findViewById(R.id.totalCash);
                        totalCash.setText(String.format("%d円です", total_yen));

                    }
                }
        );
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



/*
    public void fivehButton_onClick(View view){
        EditText coinsNumber =(EditText) findViewById(coinsNumber);

        Editable getText = coinsNumber.getText();
        int int_text = Integer.parseInt(getText.toString());


        SavingBox input = new SavingBox();
        input.insertCoin500(coinsNumber);

        new SavingBox().getTotal();
    }
*/







}

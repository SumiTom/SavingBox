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


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //addition of 100 yen 
        Button btn =(Button)findViewById(R.id.onehButton);
        btn.setOnClickListener(
                new View.OnClickListener(){

                    public void onClick(View view){

                        //get the number of coins
                        EditText coinsNumber =(EditText)findViewById(R.id.coinsNumber);

                        //convert string → int
                        Editable getText = coinsNumber.getText();
                        int int_text = Integer.parseInt(getText.toString());

                        //Calculate the value as SavingBox class and get the total additional savings
                        SavingBox input = new SavingBox();
                        input.insertCoin100(int_text);
                        int total_yen = input.getTotal();

                        //Show total value in a textbox
                        TextView totalCash =(TextView)findViewById(R.id.totalCash);
                        totalCash.setText(String.format("It is %d Yen", total_yen));
                    }
                }
        );



        //addition of 500 yen
        Button btn1 =(Button)findViewById(R.id.fivehButton);
        btn1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){

                        //get the number of coins
                        EditText coinsNumber =(EditText)findViewById(R.id.coinsNumber);

                        //convert string → int
                        Editable getText = coinsNumber.getText();
                        int int_text = Integer.parseInt(getText.toString());

                        //Calculate the value as SavingBox class and get the total additional savings
                        SavingBox input = new SavingBox();
                        input.insertCoin500(int_text);
                        int total_yen = input.getTotal();

                        //Show total value in a textbox
                        TextView totalCash =(TextView)findViewById(R.id.totalCash);
                        totalCash.setText(String.format("It is %d Yen", total_yen));
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
}

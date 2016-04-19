package kenny.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button reset;
    Button buttonA1;
    Button buttonB1;
    Button buttonC1;
    Button buttonA2;
    Button buttonB2;
    Button buttonC2;
    Button buttonA3;
    Button buttonB3;
    Button buttonC3;
    Button [] buttonArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA1 = (Button) findViewById(R.id.A1);
        buttonB1 = (Button) findViewById(R.id.B1);
        buttonC1 = (Button) findViewById(R.id.C1);
        buttonA2 = (Button) findViewById(R.id.A2);
        buttonB2 = (Button) findViewById(R.id.B2);
        buttonC2 = (Button) findViewById(R.id.C2);
        buttonA3 = (Button) findViewById(R.id.A3);
        buttonB3 = (Button) findViewById(R.id.B3);
        buttonC3 = (Button) findViewById(R.id.C3);
        reset = (Button) findViewById(R.id.reset);
        buttonArray= new Button[]{buttonA1,buttonA2,buttonA3,buttonB1,buttonB2,buttonB3,buttonC1,buttonC2,buttonC3};

        for(Button b : buttonArray){
            b.setClickable(false);
        }
        reset.setText("Start");

    }

    public boolean checkWin(){
        boolean win = false;
        if(buttonA1.getText().equals(buttonA2.getText()) && buttonA2.getText().equals(buttonA3.getText())){
            win = true;
        }else if(buttonB1.getText().equals(buttonB2.getText()) && buttonB2.getText().equals(buttonB3.getText())){
            win = true;
        }else if(buttonC1.getText().equals(buttonC2.getText()) && buttonC2.getText().equals(buttonC3.getText())){
            win = true;
        }else if(buttonA1.getText().equals(buttonB1.getText()) && buttonB1.getText().equals(buttonC1.getText())){
            win = true;
        }else if(buttonA2.getText().equals(buttonB2.getText()) && buttonB2.getText().equals(buttonC2.getText())){
            win = true;
        }else if(buttonA3.getText().equals(buttonB3.getText()) && buttonB3.getText().equals(buttonC3.getText())){
            win = true;
        }else if(buttonA1.getText().equals(buttonB2.getText()) && buttonB2.getText().equals(buttonC3.getText())){
            win = true;
        }else if(buttonA3.getText().equals(buttonB2.getText()) && buttonB2.getText().equals(buttonC1.getText())){
            win = true;
        }
        return win;
    }
   public void playerClick(View v) {
       Button button = (Button) v;
       if((button.getId()== reset.getId())) {
           for (Button b : buttonArray) {
               b.setText("");
               b.setClickable(true);
           }
           if(button.getText().equals("Start")){
               button.setText("Reset");
           }else{
               button.setText("Start");
           }
       }
        else{
           button.setText("x");
           //boolean won = checkWin();
           /*if(won){
               AlertDialog.Builder winAlert = new AlertDialog.Builder(this);
               winAlert.setMessage("Player X has won!")
                       .setPositiveButton("Continue",new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog, int which){
                               dialog.dismiss();
                           }
               }).create();*/
           for (Button b : buttonArray) {
               b.setText("");
               b.setClickable(false);
           }
       }
   }

}



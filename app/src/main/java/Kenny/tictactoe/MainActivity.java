package kenny.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        Button reset = (Button) findViewById(R.id.reset);
        reset.setText("Start");

    }

    public void beginGame(){

        reset.setText("Reset");
        


    }


}

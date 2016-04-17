package kenny.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button reset = (Button) findViewById(R.id.reset);
        reset.setText("Start");

    }

    public void beginGame(){
        final Button reset = (Button) findViewById(R.id.reset);
        reset.setText("Reset");

        final Button buttonA1 = (Button) findViewById(R.id.A1);
        final Button buttonB1 = (Button) findViewById(R.id.B1);
        final Button buttonC1 = (Button) findViewById(R.id.C1);
        final Button buttonA2 = (Button) findViewById(R.id.A2);
        final Button buttonB2 = (Button) findViewById(R.id.B2);
        final Button buttonC2 = (Button) findViewById(R.id.C2);
        final Button buttonA3 = (Button) findViewById(R.id.A3);
        final Button buttonB3 = (Button) findViewById(R.id.B3);
        final Button buttonC3 = (Button) findViewById(R.id.C3);





    }


}

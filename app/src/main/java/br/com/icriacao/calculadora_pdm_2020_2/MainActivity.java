package br.com.icriacao.calculadora_pdm_2020_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayTvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(getString(R.string.app_name), "executou onCreate()");

        displayTvw = findViewById(R.id.displayTvw);
    }

    protected void updateDisplay(String s) {
        String previous = (String) displayTvw.getText();
        displayTvw.setText(previous + s);
    }

    protected void cleanDisplay() {
        displayTvw.setText("");
    }

    protected void setResult(String s) {
        cleanDisplay();
        displayTvw.setText(s);
    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.zeroBtn:
                if (displayTvw.getText().length() == 1) {
                    if (String.valueOf(displayTvw.getText().charAt(0)).equals("0")) {
                        return;
                    }
                }
                updateDisplay("0");
                break;

            case R.id.oneBtn:
                updateDisplay("1");;
                break;

            case R.id.twoBtn:
                updateDisplay("2");
                break;

            case R.id.threeBtn:
                updateDisplay("3");
                break;

            case R.id.fourBtn:
                updateDisplay("4");
                break;

            case R.id.fiveBtn:
                updateDisplay("5");
                break;

            case R.id.sixBtn:
                updateDisplay("6");
                break;

            case R.id.sevenBtn:
                updateDisplay("7");
                break;

            case R.id.eightBtn:
                updateDisplay("8");
                break;

            case R.id.nineBtn:
                updateDisplay("9");
                break;

            case R.id.decimalDivisorBtn:
                if (displayTvw.getText().length() == 0) return;
                else {
                    if (String.valueOf(displayTvw.getText().charAt(displayTvw.getText().length() - 1)).equals(",")) {
                        return;
                    }
                }
                updateDisplay(",");
                break;

            case R.id.clearDisplayBtn:
                cleanDisplay();
                break;
        }
    }
}
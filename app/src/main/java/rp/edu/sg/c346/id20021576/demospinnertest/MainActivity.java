package rp.edu.sg.c346.id20021576.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        textView.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        textView.setText("Spinner Item, No Selected");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
}
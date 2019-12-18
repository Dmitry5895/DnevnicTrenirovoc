package asus.com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NavMenuTrenirovok extends AppCompatActivity implements View.OnClickListener {
    private Button buttonPlan;
    private Button buttonOtchet;
    private Button buttonReminder;
    private Button buttonProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_menu_trenirovok);

        ImageButton buttonReturn = findViewById(R.id.buttonReturn);
        buttonReturn.setOnClickListener(this);

        buttonPlan = (Button) findViewById(R.id.buttonPlan);
        buttonPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlanTrenirovok ();
            }
        });

        buttonOtchet = (Button) findViewById(R.id.buttonOtchet);
        buttonOtchet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtchet ();
            }
        });

        buttonReminder = (Button) findViewById(R.id.buttonReminder);
        buttonReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReminder ();
            }
        });

        buttonProgress = (Button) findViewById(R.id.buttonProgress);
        buttonProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgress ();
            }
        });
    }

    public void openPlanTrenirovok() {
        Intent intent = new Intent(this, PlanTrenirovok.class);
        startActivity(intent);
    }

    public void openOtchet() {
        Intent intent = new Intent(this, Otchet.class);
        startActivity(intent);
    }

    public void openReminder() {
        Intent intent = new Intent(this, Reminder.class);
        startActivity(intent);
    }

    public void openProgress() {
        Intent intent = new Intent(this, Progress.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
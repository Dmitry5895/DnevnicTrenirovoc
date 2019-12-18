package asus.com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlanTrenirovok extends AppCompatActivity implements View.OnClickListener {

    private static final String SAVED_TEXT = "Заметка сохранена";
    EditText editText1;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trenirovok);

        editText1 = (EditText) findViewById(R.id.editText1);

        loadText();
        saveText();
    }

    @Override
    public void onClick(View v) {

    }

    private void saveText() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sharedPreferences.edit();
        ed.putString(SAVED_TEXT, editText1.getText().toString());
        ed.commit();
    }

    private void loadText() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        String savedText = sharedPreferences.getString(SAVED_TEXT, "");
        editText1.setText(savedText);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }
}

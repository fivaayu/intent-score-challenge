package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ScorerActivity extends AppCompatActivity {

    private static final String ADD_KEY = "tambah";
    private EditText nameScorer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);
        nameScorer = findViewById(R.id.editText);
    }

    public void handleButton(View view) {
        Intent intent = new Intent();
        intent.putExtra(ADD_KEY, nameScorer.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}

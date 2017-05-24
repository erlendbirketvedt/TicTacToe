package no.hulitax.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerActivity extends AppCompatActivity {

    private EditText p1field, p2field;

    private Button btnScore;

    public static final String PLAYER_ONE_NAME =
            "no.hulitax.geoquiz.player_one_name";

    public static final String PLAYER_TWO_NAME =
            "no.hulitax.geoquiz.player_two_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent1 = new Intent(this, ScoreActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerscreen);
        p1field = (EditText) findViewById(R.id.p1input);
        p2field = (EditText) findViewById(R.id.p2input);
        Button button = (Button) findViewById(R.id.start_game);
        btnScore = (Button) findViewById(R.id.history);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }

    private void changeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        String p1name;
        String p2name;

        if(p1field.getText().toString() != "") {
            p1name = p1field.getText().toString();
        } else {
            p1name = "Player One";
        }

        if(p2field.getText().toString() != "") {
            p2name = p2field.getText().toString();
        } else {
            p2name = "Player Two";
        }

        intent.putExtra(PLAYER_ONE_NAME, p1name);
        intent.putExtra(PLAYER_TWO_NAME, p2name);
        startActivity(intent);
    }
}

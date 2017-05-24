package no.hulitax.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;
import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {

    private ListView scoreScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<User> testUser = new ArrayList<>();
        testUser.add(new User("Erlend", "950"));
        testUser.add(new User("Klister", "12"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreScreen = (ListView) findViewById(R.id.score_view);
        UserAdapter userAdapter = new UserAdapter(this, testUser);
        scoreScreen.setAdapter(userAdapter);
    }
}

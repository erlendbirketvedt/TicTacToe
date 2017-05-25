package no.hulitax.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;
import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {

    private ListView scoreScreen;

    /* Using an ArrayList in a ListView we (hopefully) will be
     * able to display a list of games previously played and
     * who won them.
     */

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

package no.hulitax.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;

    String p1name, p2name;

    // Let's map up buttons and change their state depending on which player clicks it.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get player names from PlayerActivity intent

        p1name = getIntent().getStringExtra(PlayerActivity.PLAYER_ONE_NAME);
        p2name = getIntent().getStringExtra(PlayerActivity.PLAYER_TWO_NAME);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;

        /* Add a listener to the buttons that make up the game board
         * If player one clicks the button make it an 'X', else make it an 'O'
         * Finally check board state to see if conditions are met for declaring a winner.
         */

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

    }

    // This method checks board state to see if a player has met the conditions for a win.

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        // The board with added spaces to mentally visualize lay-out

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        // We need to output something if win conditions are met

        String toastWinP1 = getString(R.string.won_the_game, p1name);
        String toastWinP2 = getString(R.string.won_the_game, p2name);

        // Check all rows and diagonals for three in a row

        if (a.equals("X") && b.equals("X") && c.equals("X") || a.equals("X") && e.equals("X") && i.equals("X")
                || a.equals("X") && d.equals("X") && g.equals("X") || b.equals("X") && e.equals("X") && h.equals("X")
                || c.equals("X") && e.equals("X") && g.equals("X") || c.equals("X") && f.equals("X") && i.equals("X")
                || d.equals("X") && e.equals("X") && f.equals("X") || g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, toastWinP1, Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("O") && b.equals("O") && c.equals("O") || a.equals("O") && e.equals("O") && i.equals("O")
                || a.equals("O") && d.equals("O") && g.equals("O") || b.equals("O") && e.equals("O") && h.equals("O")
                || c.equals("O") && e.equals("O") && g.equals("O") || c.equals("O") && f.equals("O") && i.equals("O")
                || d.equals("O") && e.equals("O") && f.equals("O") || g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, toastWinP2, Toast.LENGTH_LONG).show();
            end = true;
        }

        // When we have a winner, the board can be disabled. 

        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
}

package no.hulitax.tictactoe;

/**
 * Created by erlend on 24.05.17.
 */

public class User {
    private String name;
    private String score;

    public User(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }



}

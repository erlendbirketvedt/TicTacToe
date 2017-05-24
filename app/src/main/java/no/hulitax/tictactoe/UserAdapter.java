package no.hulitax.tictactoe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by erlend on 24.05.17.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.player_name);
        TextView tvHome = (TextView) convertView.findViewById(R.id.player_score);
        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
        tvHome.setText(user.getScore());
        // Return the completed view to render on screen
        return convertView;
    }
}


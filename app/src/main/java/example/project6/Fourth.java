package example.project6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.os.Bundle;

public class Fourth extends Third {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lvLanguages.setAdapter(new ArrayAdapter<String[]>(
                this,
                R.layout.row_fourth,
                R.id.row1,
                theList) {
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String[] entry = theList.get(position);
                TextView text1 = view.findViewById(R.id.row1);
                TextView text2 = view.findViewById(R.id.row2);
                text1.setText(entry[0]);
                text2.setText(entry[1]);
                view.setOnClickListener(v -> showToast(entry));
                return view;
            }
        });
    }
}
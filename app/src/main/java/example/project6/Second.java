package example.project6;

import android.widget.ArrayAdapter;
import android.os.Bundle;

public class Second extends First {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lvLanguages.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.row_second,
                languages));
    }
}
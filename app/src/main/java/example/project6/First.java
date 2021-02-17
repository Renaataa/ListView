package example.project6;

import android.widget.Toast;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.app.Activity;

public class First extends Activity {

    protected ListView lvLanguages;
    protected String[] languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        lvLanguages = findViewById(R.id.lvLanguages);
        languages = getResources().getStringArray(R.array.languages);

        lvLanguages.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                languages));

        lvLanguages.setOnItemClickListener((parent, v, pos, id) -> showToast(parent.getItemAtPosition(pos).toString()));
    }

    protected void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
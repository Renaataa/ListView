package example.project6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void run(View view){
        Button button = (Button) view;
        Intent intent = makeIntent(button.getText().toString());
        startActivity(intent);
    }

    private Intent makeIntent(String txt){
        switch (txt){
            case "One string item": return new Intent(this, First.class);
            case "Simple item layout": return new Intent(this, Second.class);
            case "Two strings item": return new Intent(this, Third.class);
            case "Custom": return new Intent(this, Fourth.class);
        }
        return  null;
    }
}
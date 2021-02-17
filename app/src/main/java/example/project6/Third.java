package example.project6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.os.Bundle;
import java.util.LinkedList;

public class Third extends First {

    protected String[] helloes;
    protected LinkedList<String[]> theList = new LinkedList<>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        helloes = getResources().getStringArray(R.array.hello_phrases);
        makeList();

        lvLanguages.setAdapter(new ArrayAdapter<String[]>(
                this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                theList){
            public View getView(int position, View convertView, ViewGroup parent){
                View view = super.getView(position, convertView, parent);
                String[] entry = theList.get(position);
                TextView text1 = view.findViewById(android.R.id.text1);
                TextView text2 = view.findViewById(android.R.id.text2);
                text1.setText(entry[0]);
                text2.setText(entry[1]);
                view.setOnClickListener(v -> showToast(entry));
                return view;
            }
        });
    }

    private void makeList(){
        for(int i=0; i<languages.length; i++){
            theList.add(new String[] {languages[i], helloes[i]});
        }
    }

    protected void showToast(String[] txt){
        showToast(txt[0] + "\n" + txt[1]);
    }
}
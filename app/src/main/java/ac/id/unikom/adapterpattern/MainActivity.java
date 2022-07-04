package ac.id.unikom.adapterpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<String> foods = new ArrayList<String>();
        foods.add("Burger");
        foods.add("Salad");
        foods.add("Sayur Lodeh");
        foods.add("Lumpia Basah");

        MainAdapter adapter = new MainAdapter(foods);

        recyclerView.setAdapter(adapter);
    }
}
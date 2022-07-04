package ac.id.unikom.adapterpattern;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<String> foods;

    public MainAdapter(List<String> foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(foods.get(position));
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        private final TextView food;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            food = itemView.findViewById(R.id.food);
        }

        public void bind (String food) {
            this.food.setText(food);
        }
    }
}

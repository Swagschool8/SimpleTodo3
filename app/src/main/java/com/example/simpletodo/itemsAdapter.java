package com.example.simpletodo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


// Responsible for displaying data from the modelinto a row in the recycler view
public class itemsAdapter extends RecyclerView.Adapter<itemsAdapter.ViewHolder>{


    List<String> items;
    public itemsAdapter(List<String> item)  {
   this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Use layout inflator to inflate a view
       View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

      //Wrap it indside view holder and return it

        return new ViewHolder(todoView);
    }



    // responsible for building data to a particular view holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      // Grab the item at the position
       String item = items.get (position);
        //Bind the item into a specific view holder
        holder.bind(item);



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // Container to provide easy access to view that  represent each row of the list
    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvItem;

     public ViewHolder(@NonNull View itemView) {
         super(itemView);
         tvItem = itemView.findViewById(android.R.id.text1);
     }

        public void bind(String item) {
       tvItem.setText(item);

        }
    }

}

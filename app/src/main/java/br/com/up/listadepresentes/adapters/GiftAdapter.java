package br.com.up.listadepresentes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.up.listadepresentes.R;
import br.com.up.listadepresentes.models.Gift;


public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.GiftViewHolder> {

    private ArrayList<Gift> gifts;

    public GiftAdapter(ArrayList<Gift> gifts) {
        this.gifts = gifts;

    }

    public static class GiftViewHolder extends RecyclerView.ViewHolder {
        public GiftViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View layout =  inflater.inflate(R.layout.view_item_gift, parent, false);
        return new GiftViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftViewHolder holder, int position) {


            Gift gift = gifts.get(position);

            TextView textViewGiftName = holder.itemView.findViewById(R.id.text_gift_name);
            TextView textViewGiftTitle= holder.itemView.findViewById(R.id.text_gift_title);
            TextView textViewGiftDescription = holder.itemView.findViewById(R.id.text_gift_description);

            textViewGiftName.setText(gift.getGiftName());
            textViewGiftTitle.setText(gift.getGiftName());
            textViewGiftDescription.setText(gift.getDescription());


    }

    @Override
    public int getItemCount() {
        return gifts.size();
    }



}

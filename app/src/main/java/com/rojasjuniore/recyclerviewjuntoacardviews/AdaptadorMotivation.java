package com.rojasjuniore.recyclerviewjuntoacardviews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Junior on 01/08/2016.
 */
public class AdaptadorMotivation extends RecyclerView.Adapter<AdaptadorMotivation.MotivationViewHolder> {

    private List<Motivation> items;

    public static class MotivationViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        private ImageView imagen;
        private TextView nombre;
        private TextView visitas;

        public MotivationViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            visitas = (TextView) v.findViewById(R.id.visitas);
        }
    }

    public AdaptadorMotivation(List<Motivation> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public MotivationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.motivation_card, parent, false);
        return new MotivationViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MotivationViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText("Visitas:" + items.get(position).getVisita());
    }


}

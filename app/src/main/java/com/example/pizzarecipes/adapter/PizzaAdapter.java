package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;
import java.util.Locale;

public class PizzaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Produit> listePizzas;
    private final LayoutInflater inflater;

    public PizzaAdapter(Context context, List<Produit> listePizzas) {
        this.context = context;
        this.listePizzas = listePizzas;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listePizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return listePizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listePizzas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        // Réutilisation de la vue pour améliorer les performances
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_pizza, parent, false);

            holder = new ViewHolder();
            holder.imagePizza = convertView.findViewById(R.id.imgPizza);
            holder.nomPizza = convertView.findViewById(R.id.tvNom);
            holder.infoPizza = convertView.findViewById(R.id.tvMeta);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Produit produitActuel = listePizzas.get(position);

        holder.imagePizza.setImageResource(produitActuel.getImageRes());
        holder.nomPizza.setText(produitActuel.getNom());

        String texteMeta = String.format(
                Locale.getDefault(),
                "%s  •  %.2f €",
                produitActuel.getDuree(),
                produitActuel.getPrix()
        );
        holder.infoPizza.setText(texteMeta);

        return convertView;
    }

    // Petite classe interne pour éviter les findViewById répétitifs
    private static class ViewHolder {
        ImageView imagePizza;
        TextView nomPizza;
        TextView infoPizza;
    }
}
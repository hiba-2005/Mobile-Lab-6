package com.example.pizzarecipes.service;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProduitService();
        }
        return INSTANCE;
    }

    private void seed() {

        create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.drawable.pizza1, "35 min",
                "Chicken, barbecue sauce, Gouda cheese, onion, cilantro",
                "Saucy grilled chicken pizza with smoky flavor.",
                "1. Grill chicken.\n2. Prepare crust.\n3. Add toppings and grill again."));

        create(new Produit("BRUSCHETTA PIZZA", 5, R.drawable.pizza2, "35 min",
                "Sausage, pepperoni, mozzarella, tomatoes, basil",
                "Italian style pizza full of fresh tomato flavor.",
                "1. Cook sausage.\n2. Bake crust with toppings.\n3. Add tomato mixture."));

        create(new Produit("SPINACH PIZZA", 2, R.drawable.pizza3, "25 min",
                "Spinach, tomatoes, Alfredo sauce, cheese",
                "Light vegetable pizza easy to prepare.",
                "1. Prepare dough.\n2. Add spinach and tomatoes.\n3. Bake until golden."));

        create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.drawable.pizza4, "45 min",
                "Yeast dough, sausage, mozzarella, herbs",
                "Classic deep dish pizza with thick crust.",
                "1. Prepare dough.\n2. Add layers of cheese and sausage.\n3. Bake."));

        create(new Produit("HOMEMADE PIZZA", 4, R.drawable.pizza5, "50 min",
                "Ground beef, tomato sauce, onion, pepper, mozzarella",
                "Traditional homemade pizza recipe.",
                "1. Prepare dough.\n2. Cook beef.\n3. Add toppings.\n4. Bake."));

        create(new Produit("PESTO CHICKEN PIZZA", 3, R.drawable.pizza6, "50 min",
                "Chicken, pesto sauce, peppers, mushrooms, mozzarella",
                "Healthy pizza with chicken and vegetables.",
                "1. Prepare dough.\n2. Cook chicken.\n3. Add pesto and toppings.\n4. Bake."));

        create(new Produit("LOADED MEXICAN PIZZA", 3, R.drawable.pizza7, "30 min",
                "Beans, tomatoes, jalapeno, cheddar, pepper jack",
                "Mexican style pizza with spicy flavors.",
                "1. Mash beans.\n2. Add vegetables.\n3. Bake with cheese."));

        create(new Produit("BACON CHEESEBURGER PIZZA", 2, R.drawable.pizza8, "20 min",
                "Ground beef, bacon, pickles, mozzarella, cheddar",
                "Pizza inspired by cheeseburger flavor.",
                "1. Cook beef.\n2. Add bacon and pickles.\n3. Bake."));

        create(new Produit("PIZZA MARGHERITA", 1, R.drawable.pizza9, "30 min",
                "Tomatoes, mozzarella, basil",
                "Classic Italian pizza with simple ingredients.",
                "1. Prepare dough.\n2. Add tomatoes and basil.\n3. Bake."));

        create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.drawable.pizza10, "45 min",
                "Pepperoni, sausage, mozzarella, cheddar",
                "Stuffed pizza full of meat and cheese.",
                "1. Prepare dough.\n2. Add stuffing.\n3. Bake until crust is golden."));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
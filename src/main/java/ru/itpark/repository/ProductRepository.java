package ru.itpark.repository;

import ru.itpark.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public List<Product> getAll(){
        return products;
    }
}

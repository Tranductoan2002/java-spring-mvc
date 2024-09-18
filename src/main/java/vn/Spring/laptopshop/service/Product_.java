package vn.Spring.laptopshop.service;

import jakarta.persistence.metamodel.SingularAttribute;
import vn.Spring.laptopshop.domain.Product;

public class Product_ {

    public static volatile SingularAttribute<Product, String> NAME;
    public static volatile SingularAttribute<Product, Double> PRICE;
    public static volatile SingularAttribute<Product, String> FACTORY;

    // public static volatile SingularAttribute<Product, String> NAME;

}

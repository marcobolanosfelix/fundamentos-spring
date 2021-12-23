package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    //Deben ser los mismos metodos que hay en ProductoRepository.java pero apuntando a la clase Product.java
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}

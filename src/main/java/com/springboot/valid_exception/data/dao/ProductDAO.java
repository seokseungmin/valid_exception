package com.springboot.valid_exception.data.dao;


import com.springboot.valid_exception.data.entity.Product;
import java.util.Optional;

public interface ProductDAO {

    Product insertProduct(Product product);
    Optional<Product> selectProduct(Long number);
    Product updateProductName(Long number, String namem) throws Exception;
    void deleteProduct(Long number) throws Exception;
}

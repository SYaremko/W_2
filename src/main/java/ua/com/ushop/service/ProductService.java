package ua.com.ushop.service;

import ua.com.ushop.entity.Product;


import java.util.List;

public interface ProductService {

     List<Product> findAll();

     void save(Product product);

}

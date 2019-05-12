package ua.com.ushop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.ushop.dao.DAOproducts;
import ua.com.ushop.entity.Product;
import ua.com.ushop.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private DAOproducts daOproducts;

    @Override
    public List<Product> findAll() {
        return daOproducts.findAll();
    }

    @Override
    public void save(Product product) {
    daOproducts.save(product);
    }
}

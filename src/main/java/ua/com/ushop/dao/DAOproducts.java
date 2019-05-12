package ua.com.ushop.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.ushop.entity.Product;



public interface DAOproducts extends JpaRepository<Product,Integer> {

}

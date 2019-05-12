package ua.com.ushop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.com.ushop.entity.Product;
import ua.com.ushop.service.ProductService;



@Controller
public class Example_2_GET {
    @Autowired
    private ProductService productService;


        @GetMapping("save2")
        public String newProduct2(@RequestParam("title") String title,
                                  @RequestParam("file") String file) {
            Product product = new Product();
            product.setTitle(title);
            product.setFile("\\file\\"+file);

            productService.save(product);
            return "example2";
        }



}

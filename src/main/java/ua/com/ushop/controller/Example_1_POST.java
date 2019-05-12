package ua.com.ushop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.com.ushop.entity.Product;
import ua.com.ushop.service.ProductService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class Example_1_POST {
@Autowired
    private ProductService productService;

    @PostMapping("save1")
    public String newProduct(@RequestParam("title") String title,

                             @RequestParam("file") MultipartFile multipartFile) throws IOException {


        String productPath = System.getProperty("user.home") + File.separator + "images" + File.separator;
        multipartFile.transferTo(new File(productPath + multipartFile.getOriginalFilename()));

        Product product = new Product();
        product.setTitle(title);

        product.setFile("\\file\\" + multipartFile.getOriginalFilename());

        productService.save(product);
        return "example1";
    }


}

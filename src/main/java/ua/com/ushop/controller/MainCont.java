package ua.com.ushop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.ushop.entity.Product;
import ua.com.ushop.service.ProductService;

import java.util.List;

@Controller
public class MainCont {
    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String main(Model model){
       /* List<Product> product = productService.findAll();
        model.addAttribute("allProducts", product);*/
        return "main";
    }
    @RequestMapping("/main")
    public String main_1(){

        return "main";
    }

    @RequestMapping("/picture")
    public String main_2(Model model){

        List<Product> product = productService.findAll();
        model.addAttribute("allProducts", product);
        return "picture";
    }

    @RequestMapping("example1")
    public String example1() {

        return "example1";
    }

    @RequestMapping("example2")
    public String example2() {
        return "example2";
    }

    @RequestMapping("example3")
    public String example3()
    {
        return "example3";
    }



    @RequestMapping("/next")
    public String main_2(){
        return "next";
    }

}

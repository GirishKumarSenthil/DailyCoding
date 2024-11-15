package com.example.Project.Controller;


import com.example.Project.Entity.Product;
import com.example.Project.Entity.ProductDTO;
import com.example.Project.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repo;

    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<Product> productList = repo.findAll();
        model.addAttribute("productList",productList);
        return "Products/index";
    }

    @GetMapping("/create")
    public String createProduct(Model model){
        ProductDTO prod = new ProductDTO();
        model.addAttribute("prod",prod);
        return "Products/form";
    }
}

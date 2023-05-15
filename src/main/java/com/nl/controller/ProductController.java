package com.nl.controller;

import com.nl.contracts.ProductAddRequest;
import com.nl.contracts.ProductResponse;
import com.nl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private static List<ProductResponse> products=new ArrayList();
    static {
        ProductResponse p=new ProductResponse(1,"Microwave","Samsung Microwave","Electronics",150.00,true);
        products.add(p);
        p=new ProductResponse(2,"TV","Samsung TV","Electronics",750.00,true);
        products.add(p);
        p=new ProductResponse(3,"iPhone 13","Apple iPhone 13","Electronics",930.00,true);
        products.add(p);
    }
    @Autowired
    private ProductService service;
    @RequestMapping(value = "",method={RequestMethod.GET})
    public List<ProductResponse> getProductsFromDb(){
        return service.getAllProducts();
    }
    @RequestMapping(value = "",method={RequestMethod.POST})
    public ProductResponse addProductToDb(@RequestBody ProductAddRequest product){
        return service.addProduct(product);
    }

    @RequestMapping(value = "/{id}",method={RequestMethod.DELETE})
    public boolean deleteProductToDb(@PathVariable long id){
        return service.deleteProduct(id);
    }
    @RequestMapping(value = "/",method={RequestMethod.GET})
    public List<ProductResponse> getProducts(){
        return products;
    }

}

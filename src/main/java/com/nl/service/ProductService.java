package com.nl.service;

import com.nl.contracts.ProductAddRequest;
import com.nl.contracts.ProductResponse;
import com.nl.data.entity.Product;
import com.nl.data.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<ProductResponse> getAllProducts(){
        ArrayList list=new ArrayList();
        productRepo.findAll().forEach(x -> list.add(new ProductResponse(x)));
        return list;
    }

    public ProductResponse addProduct(ProductAddRequest productRequest) {
        Product p=new Product(productRequest);
        productRepo.save(p);
        return new ProductResponse(p);
    }

    public boolean deleteProduct(long id) {
        //Product p=new Product(productRequest);
        productRepo.deleteById(id);
        return true;
    }
}

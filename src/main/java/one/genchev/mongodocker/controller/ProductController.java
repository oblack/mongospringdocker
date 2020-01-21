/**
 * Copyright (c) 2020 by CodeCoda Ltd.
 * http://www.codecoda.com
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information
 * of CodeCoda Ltd. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with CodeCoda Ltd.
 * <p>
 * Created by genchev: 2020
 */
package one.genchev.mongodocker.controller;

import one.genchev.mongodocker.entity.Product;
import one.genchev.mongodocker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") String id) {
        Optional<Product> p = productRepository.findById(id);
        return ResponseEntity.ok(p.orElse(null));
    }

    @PostMapping (value = "/products", consumes = "application/json")
    public ResponseEntity<Product> save(@RequestBody Product p) {
        Product result = productRepository.save(p);
        return ResponseEntity.ok(result);
    }
}

package com.xpass.ceshi.member.repository;

import com.xpass.ceshi.member.domain.eo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
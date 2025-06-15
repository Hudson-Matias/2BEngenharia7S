package com._BEngenharia7S.prova2Bim.Repositories;

import com._BEngenharia7S.prova2Bim.Domain.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
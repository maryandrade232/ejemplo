package com.maricela.webflux.WebFlux.repositories;

import com.maricela.webflux.WebFlux.documents.Product;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface ProductRepository  extends ReactiveSortingRepository<Product,Long> {
}

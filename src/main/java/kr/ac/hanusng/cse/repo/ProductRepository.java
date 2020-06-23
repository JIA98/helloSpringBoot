package kr.ac.hanusng.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hanusng.cse.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByCategory(String category);

}

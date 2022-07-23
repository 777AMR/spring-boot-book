package com.therecklers.sburrestdemo.repository;

import com.therecklers.sburrestdemo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}

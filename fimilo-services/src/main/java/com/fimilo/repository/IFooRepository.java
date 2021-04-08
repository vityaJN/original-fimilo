package com.fimilo.repository;

import com.fimilo.entity.Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}

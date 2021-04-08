package com.fimilo.repository;


import com.fimilo.entity.Foo;

import java.util.Optional;


public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);
    
    Iterable<Foo> findAll();

}

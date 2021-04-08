package com.fimilo.backend.controllers;


import com.fimilo.dto.FooDto;
import com.fimilo.entity.Foo;
import com.fimilo.repository.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

@RestController
@RequestMapping(value = "/api/foos")
@CrossOrigin(origins = "http://localhost:8084")
public class FooController {

    private IFooService fooService;

    @Autowired
    public FooController(IFooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping(value = "/{id}")
    public FooDto findOne(@PathVariable Long id) {
        return new FooDto(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody FooDto newFoo) {
        Foo entity = convertToEntity(newFoo);
        this.fooService.save(entity);
    }

    @GetMapping
    public Collection<FooDto> findAll() {
        Iterable<Foo> foos = this.fooService.findAll();
        List<FooDto> fooDtos = new ArrayList<>();
        foos.forEach(p -> fooDtos.add(convertToDto(p)));
        return fooDtos;
    }

    @PutMapping("/{id}")
    public FooDto updateFoo(@PathVariable("id") Long id, @RequestBody FooDto updatedFoo) {
        Foo fooEntity = convertToEntity(updatedFoo);
        return this.convertToDto(this.fooService.save(fooEntity));
    }

    protected FooDto convertToDto(Foo entity) {
        FooDto dto = new FooDto(entity.getId(), entity.getName());

        return dto;
    }

    protected Foo convertToEntity(FooDto dto) {
        Foo foo = new Foo(dto.getName());
        if (!StringUtils.isEmpty(dto.getId())) {
            foo.setId(dto.getId());
        }
        return foo;
    }
}

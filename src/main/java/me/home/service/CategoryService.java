package me.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.home.model.Category;
import me.home.repository.CategorytRepository;
import reactor.core.publisher.Flux;

@Service
@Transactional
public class CategoryService
{

    @Autowired
    private CategorytRepository repository;

    public Flux<Category> getAll( )
    {
        return repository.findAll( ).switchIfEmpty( Flux.empty( ) );
    }

}

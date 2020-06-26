package me.home.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import me.home.model.Category;
import reactor.core.publisher.Flux;

@Repository
public interface  CategorytRepository extends ReactiveCrudRepository<Category,Integer>
{

    @Query("SELECT * FROM category WHERE libelle = :libelle")
    Flux<Category> findByLibelle(String libelle);

}

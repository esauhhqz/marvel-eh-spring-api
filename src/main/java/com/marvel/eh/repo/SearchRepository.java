package com.marvel.eh.repo;

import com.marvel.eh.model.Busqueda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Busqueda, Long> {

}

package com.app.market.persistence;

import com.app.market.domain.Product;
import com.app.market.domain.Project;
import com.app.market.domain.repository.ProjectRepository;
import com.app.market.persistence.crud.ProyectoCrudRepository;
import com.app.market.persistence.entity.Producto;
import com.app.market.persistence.entity.Proyecto;
import com.app.market.persistence.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProyectoRepository implements ProjectRepository {
    @Autowired
    private ProyectoCrudRepository proyectoCrudRepository;

    @Autowired
    private ProjectMapper mapper;

    //crear un método que recupere una (todos) lista de productos de nuestra base de datos.
    @Override
    public List<Project> getAll(){
        List<Proyecto> proyectos = (List<Proyecto>) proyectoCrudRepository.findAll();
        return mapper.toProjects(proyectos);
    }
}

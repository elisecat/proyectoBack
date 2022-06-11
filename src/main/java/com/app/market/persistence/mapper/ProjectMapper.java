package com.app.market.persistence.mapper;

import com.app.market.domain.Product;
import com.app.market.domain.Project;
import com.app.market.persistence.entity.Producto;
import com.app.market.persistence.entity.Proyecto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

        @Mappings({
                @Mapping(source = "id", target = "projectId"),
                @Mapping(source = "titulo", target = "tittle"),
                @Mapping(source = "descripcion", target = "description"),
                @Mapping(source = "rutaImagen", target = "imageRoute"),
                @Mapping(source = "rutaLogo", target = "logoRoute"),
        })
        Project toProject(Proyecto proyecto);
        List<Project> toProjects (List<Proyecto> proyectos);

        //Le indica a mapStruct que la conversion es inversa
        @InheritInverseConfiguration
        Proyecto toProyecto(Project project);
}
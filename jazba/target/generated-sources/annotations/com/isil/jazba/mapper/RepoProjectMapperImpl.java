package com.isil.jazba.mapper;

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.model.RepoProject;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-16T20:30:27-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class RepoProjectMapperImpl implements RepoProjectMapper {

    @Override
    public RepoProjectDTO toDTO(RepoProject entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProjectDTO repoProjectDTO = new RepoProjectDTO();

        repoProjectDTO.setIdRepositorio( entity.getIdRepositorio() );
        repoProjectDTO.setFilename( entity.getFilename() );
        repoProjectDTO.setUploadRepo( entity.getUploadRepo() );
        repoProjectDTO.setDescripcion( entity.getDescripcion() );

        return repoProjectDTO;
    }

    @Override
    public RepoProject fromDTO(RepoProjectDTO entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProject repoProject = new RepoProject();

        repoProject.setIdRepositorio( entity.getIdRepositorio() );
        repoProject.setFilename( entity.getFilename() );
        repoProject.setUploadRepo( entity.getUploadRepo() );
        repoProject.setDescripcion( entity.getDescripcion() );

        return repoProject;
    }
}

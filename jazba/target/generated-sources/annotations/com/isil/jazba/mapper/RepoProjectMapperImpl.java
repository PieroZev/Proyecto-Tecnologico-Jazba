package com.isil.jazba.mapper;

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.model.RepoProject;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-15T17:02:17-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_251 (Oracle Corporation)"
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

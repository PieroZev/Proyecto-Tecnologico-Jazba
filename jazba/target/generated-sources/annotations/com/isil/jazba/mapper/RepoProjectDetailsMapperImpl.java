package com.isil.jazba.mapper;

import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.model.RepoProjectDetails;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-15T17:38:57-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class RepoProjectDetailsMapperImpl implements RepoProjectDetailsMapper {

    @Override
    public RepoProjectDetailsDTO toDTO(RepoProjectDetails entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProjectDetailsDTO repoProjectDetailsDTO = new RepoProjectDetailsDTO();

        repoProjectDetailsDTO.setComentario( entity.getComentario() );
        repoProjectDetailsDTO.setFechahoraComentario( entity.getFechahoraComentario() );
        repoProjectDetailsDTO.setIdDetalles( entity.getIdDetalles() );
        repoProjectDetailsDTO.setNumLikes( entity.getNumLikes() );

        return repoProjectDetailsDTO;
    }

    @Override
    public RepoProjectDetails fromDTO(RepoProjectDetailsDTO entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProjectDetails repoProjectDetails = new RepoProjectDetails();

        repoProjectDetails.setComentario( entity.getComentario() );
        repoProjectDetails.setFechahoraComentario( entity.getFechahoraComentario() );
        repoProjectDetails.setIdDetalles( entity.getIdDetalles() );
        repoProjectDetails.setNumLikes( entity.getNumLikes() );

        return repoProjectDetails;
    }
}

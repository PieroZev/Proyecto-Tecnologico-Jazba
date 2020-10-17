package com.isil.jazba.mapper;

import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.model.RepoProjectDetails;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-16T20:30:27-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class RepoProjectDetailsMapperImpl implements RepoProjectDetailsMapper {

    @Override
    public RepoProjectDetailsDTO toDTO(RepoProjectDetails entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProjectDetailsDTO repoProjectDetailsDTO = new RepoProjectDetailsDTO();

        repoProjectDetailsDTO.setIdDetalles( entity.getIdDetalles() );
        repoProjectDetailsDTO.setComentario( entity.getComentario() );
        repoProjectDetailsDTO.setFechahoraComentario( entity.getFechahoraComentario() );
        repoProjectDetailsDTO.setNumLikes( entity.getNumLikes() );

        return repoProjectDetailsDTO;
    }

    @Override
    public RepoProjectDetails fromDTO(RepoProjectDetailsDTO entity) {
        if ( entity == null ) {
            return null;
        }

        RepoProjectDetails repoProjectDetails = new RepoProjectDetails();

        repoProjectDetails.setIdDetalles( entity.getIdDetalles() );
        repoProjectDetails.setComentario( entity.getComentario() );
        repoProjectDetails.setFechahoraComentario( entity.getFechahoraComentario() );
        repoProjectDetails.setNumLikes( entity.getNumLikes() );

        return repoProjectDetails;
    }
}

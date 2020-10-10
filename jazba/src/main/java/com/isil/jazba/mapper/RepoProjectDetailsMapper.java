package com.isil.jazba.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.model.RepoProjectDetails;

@Mapper(componentModel = "spring")
public interface RepoProjectDetailsMapper {

	RepoProjectDetailsMapper INSTANCE = Mappers.getMapper(RepoProjectDetailsMapper.class);

    RepoProjectDetailsDTO toDTO(RepoProjectDetails entity);
    RepoProjectDetails fromDTO(RepoProjectDetailsDTO entity);
}

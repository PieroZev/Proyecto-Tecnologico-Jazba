package com.isil.jazba.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.model.RepoProject;

@Mapper(componentModel = "spring")
public interface RepoProjectMapper {

	RepoProjectMapper INSTANCE = Mappers.getMapper(RepoProjectMapper.class);

    RepoProjectDTO toDTO(RepoProject entity);
    RepoProject fromDTO(RepoProjectDTO entity);
}

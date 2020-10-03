package com.isil.jazba.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.isil.jazba.dto.UsuarioDTO;
import com.isil.jazba.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toDTO(Usuario entity);
    Usuario fromDTO(UsuarioDTO entity);
}

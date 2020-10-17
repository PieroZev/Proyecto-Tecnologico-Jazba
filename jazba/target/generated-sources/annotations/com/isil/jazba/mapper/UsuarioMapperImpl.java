package com.isil.jazba.mapper;

import com.isil.jazba.dto.UsuarioDTO;
import com.isil.jazba.model.Usuario;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-16T20:30:27-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setDni( entity.getDni() );
        usuarioDTO.setNombre( entity.getNombre() );
        usuarioDTO.setApePaterno( entity.getApePaterno() );
        usuarioDTO.setApeMaterno( entity.getApeMaterno() );
        usuarioDTO.setCorreo( entity.getCorreo() );
        usuarioDTO.setPassword( entity.getPassword() );
        usuarioDTO.setCelular( entity.getCelular() );
        if ( entity.getIdInstitucion() != null ) {
            usuarioDTO.setIdInstitucion( entity.getIdInstitucion().intValue() );
        }
        if ( entity.getIdTipo() != null ) {
            usuarioDTO.setIdTipo( entity.getIdTipo().intValue() );
        }
        if ( entity.getIdEspecialidad() != null ) {
            usuarioDTO.setIdEspecialidad( entity.getIdEspecialidad().intValue() );
        }

        return usuarioDTO;
    }

    @Override
    public Usuario fromDTO(UsuarioDTO entity) {
        if ( entity == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setDni( entity.getDni() );
        usuario.setNombre( entity.getNombre() );
        usuario.setApePaterno( entity.getApePaterno() );
        usuario.setApeMaterno( entity.getApeMaterno() );
        usuario.setCorreo( entity.getCorreo() );
        usuario.setPassword( entity.getPassword() );
        usuario.setCelular( entity.getCelular() );
        usuario.setIdInstitucion( (long) entity.getIdInstitucion() );
        usuario.setIdTipo( (long) entity.getIdTipo() );
        usuario.setIdEspecialidad( (long) entity.getIdEspecialidad() );

        return usuario;
    }
}

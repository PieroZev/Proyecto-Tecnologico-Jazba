package com.isil.jazba.mapper;

import com.isil.jazba.dto.UsuarioDTO;
import com.isil.jazba.model.Usuario;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-16T16:33:35-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.19.0.v20190903-0936, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setApeMaterno( entity.getApeMaterno() );
        usuarioDTO.setApePaterno( entity.getApePaterno() );
        usuarioDTO.setCelular( entity.getCelular() );
        usuarioDTO.setCorreo( entity.getCorreo() );
        usuarioDTO.setDni( entity.getDni() );
        if ( entity.getIdEspecialidad() != null ) {
            usuarioDTO.setIdEspecialidad( entity.getIdEspecialidad().intValue() );
        }
        if ( entity.getIdInstitucion() != null ) {
            usuarioDTO.setIdInstitucion( entity.getIdInstitucion().intValue() );
        }
        if ( entity.getIdTipo() != null ) {
            usuarioDTO.setIdTipo( entity.getIdTipo().intValue() );
        }
        usuarioDTO.setNombre( entity.getNombre() );
        usuarioDTO.setPassword( entity.getPassword() );

        return usuarioDTO;
    }

    @Override
    public Usuario fromDTO(UsuarioDTO entity) {
        if ( entity == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setApeMaterno( entity.getApeMaterno() );
        usuario.setApePaterno( entity.getApePaterno() );
        usuario.setCelular( entity.getCelular() );
        usuario.setCorreo( entity.getCorreo() );
        usuario.setDni( entity.getDni() );
        usuario.setIdEspecialidad( (long) entity.getIdEspecialidad() );
        usuario.setIdInstitucion( (long) entity.getIdInstitucion() );
        usuario.setIdTipo( (long) entity.getIdTipo() );
        usuario.setNombre( entity.getNombre() );
        usuario.setPassword( entity.getPassword() );

        return usuario;
    }
}

package com.luizalebs.comunicacao_api.business.converter;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.luizalebs.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@AllArgsConstructor
@Component
@Mapper(componentModel = "spring")
//public class ComunicacaoConverter {
public interface ComunicacaoConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataHoraenvio", target = "dataHoraenvio")
    @Mapping(source = "emailDestinatario", target = "emailDestinatario")
    @Mapping(source = "nomeDestinatario", target = "nomeDestinatario")
    @Mapping(source = "mensagem", target = "mensagem")
    @Mapping(source = "modoDeEnvio", target = "modoDeEnvio")
    @Mapping(source = "statusEnvio", target = "statusEnvio")
    @Mapping(source = "telefoneDestinatario", target = "telefoneDestinatario")
    ComunicacaoEntity paraEntity(ComunicacaoInDTO dto)
/*    public ComunicacaoEntity paraEntity(ComunicacaoInDTO dto) {
        return ComunicacaoEntity.builder()
                .dataHoraenvio(dto.getDataHoraEnvio())
                .emailDestinatario(dto.getEmailDestinatario())
                .nomeDestinatario(dto.getNomeDestinatario())
                .mensagem(dto.getMensagem())
                .modoDeEnvio(dto.getModoDeEnvio())
                .statusEnvio(dto.getStatusEnvio())
                .telefoneDestinatario(dto.getTelefoneDestinatario())
                .build();
    }
*/

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataHoraenvio", target = "dataHoraenvio")
    @Mapping(source = "emailDestinatario", target = "emailDestinatario")
    @Mapping(source = "nomeDestinatario", target = "nomeDestinatario")
    @Mapping(source = "mensagem", target = "mensagem")
    @Mapping(source = "modoDeEnvio", target = "modoDeEnvio")
    @Mapping(source = "telefoneDestinatario", target = "telefoneDestinatario")
    @Mapping(source = "statusEnvio", target = "statusEnvio")
    ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity)
/*
    public ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity) {
        return ComunicacaoOutDTO.builder()
                .dataHoraEnvio(entity.getDataHoraenvio())
                .emailDestinatario(entity.getEmailDestinatario())
                .nomeDestinatario(entity.getNomeDestinatario())
                .mensagem(entity.getMensagem())
                .modoDeEnvio(entity.getModoDeEnvio())
                .telefoneDestinatario(entity.getTelefoneDestinatario())
                .statusEnvio(entity.getStatusEnvio())
                .build();
    }
*/
}


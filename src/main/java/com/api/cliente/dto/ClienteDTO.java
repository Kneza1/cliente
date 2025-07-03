package com.api.cliente.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 

public class ClienteDTO extends RepresentationModel<ClienteDTO> {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;

}

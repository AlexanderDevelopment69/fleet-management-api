package fleet.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    private Long id;
    private String title;
    private String email;
    private String estado;
    private String tipoLicencia;
    private String expiracionLicencia;
    private String numeroLicencia;
    private String asignacionesConductores;
    private String asignacionesMediosPago;
    private String grupos;
    private String etiquetas;
    private String comentarios;
    private String documentos;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String creadoPor;
    private String licenciaPermanente;
    private String asigNumeroEconomico;
    private String telefCodPais;
    private String telefono;
    private String centroCostos;
    private String nombreUnidad;
    private String division;
    private String nombreTrabajo;
    private String paisTrabajo;
    private String localizacionTrabajo;
    private String departamento;
    private String supervisorNombre;
    private String supervisorEmail;
    private String itemType;
    private String path;

}

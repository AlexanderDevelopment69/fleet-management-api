package fleet.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    private Long id;
    private String title;
    private String tipoVehiculo;
    private String placa;
    private String propiedad;
    private String tipoCombustible;
    private String permisoCirculacion;
    private String chasis;
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private String estado;
    private String ultMotivCambioEstado;
    private String ultOdometro;
    private String fechaUltOdometro;
    private String origenUltOdometro;
    private String grupos;
    private String etiquetas;
    private String asigMediosPago;
    private String documentos;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String creadoPor;
    private String ciudad;
    private String edad;
    private String version;
    private String dispositivoTAG;
    private String arrendadora;
    private String numeroContrato;
    private String fechaInicioArrend;
    private String fechaFinArrend;
    private String plazoArrendamiento;
    private String aseguradora;
    private String numPolizaSeguro;
    private String inicioVigencia;
    private String finVigencia;
    private String asignacionConductor;
    private String itemType;
    private String path;

}

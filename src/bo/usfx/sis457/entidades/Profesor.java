/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Profesor extends Persona {
    protected String Contrato;
    protected String Titulo;
 
    public Profesor(String contrato, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Contrato = contrato;
        this.Titulo = titulo;
    }

    public Profesor(String contrato, String titulo) {
        this.Contrato = contrato;
        this.Titulo = titulo;
    }

    public Profesor() {
        
    }

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String Contrato) {
        this.Contrato = Contrato;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Contrato=" + Contrato + ", Titulo=" + Titulo + '}';
    }
    
}

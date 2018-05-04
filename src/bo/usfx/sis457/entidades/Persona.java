/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Persona {
    protected static int Total = 0;
    protected final int Id;
    protected String CarnetIdentidad;
    protected String Nombre;
    protected Calendar FechaNacimiento;

    public Persona(String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        Total++;
        this.Id = Total;
        this.CarnetIdentidad = carnetIdentidad;
        this.Nombre = nombre;
        this.FechaNacimiento = fechaNacimiento;
//        System.out.println("Se crea una Persona");
    }

    public Persona() {
        this("0", "Sin Nombre", new GregorianCalendar(1980, 1,1));
    }
    
    public int getId() {
        return this.Id;
    }

    public String getCarnetIdentidad() {
        return this.CarnetIdentidad;
    }

    public void setCarnetIdentidad(String CarnetIdentidad) {
        this.CarnetIdentidad = CarnetIdentidad;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Calendar getFechaNacimiento() {
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(Calendar FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "CarnetIdentidad=" + CarnetIdentidad + ", Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + '}';
    }
}

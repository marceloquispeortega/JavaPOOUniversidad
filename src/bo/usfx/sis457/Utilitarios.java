/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Utilitarios {
    public static String getFechaCalendario(Calendar fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        return formato.format(fecha.getTime());
    }   
}

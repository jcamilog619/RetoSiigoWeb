package co.com.certification.utils;

import java.time.LocalDate;

import static co.com.certification.utils.ConstastesTransversales.*;

public class Fecha {
    public static String getMes() {
        return String.valueOf(LocalDate.now().getMonth().getValue());
    }

    public static String getFecha() {
        String dia = String.valueOf(LocalDate.now().getDayOfMonth());
        String mes = String.valueOf(LocalDate.now().getMonth().getValue());
        return mes + "." + dia;
    }

    public static String getFechaRegreso() {
        int diaRegreso = LocalDate.now().plusDays(CINCO).getDayOfMonth();
        return getMesRegreso() + "." + diaRegreso;
    }

    public static String getMesRegreso() {
        Integer mes = LocalDate.now().getMonth().getValue();
        int dia = LocalDate.now().getDayOfMonth() + CINCO;
        for (int i = CERO; i <= dia; i++) {
            if (i >= TREINTA) {
                return String.valueOf(mes + UNO);
            }
        }
        return String.valueOf(mes);
    }

}

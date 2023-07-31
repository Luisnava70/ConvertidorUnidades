package com.mrfreaktoy.convertidor.InicioSys;

import com.mrfreaktoy.convertidor.interfazGrafica.InicioGrafico;

import javax.swing.*;

public class InicioGraf {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InicioGrafico ventana = new InicioGrafico();
            ventana.setVisible(true);
        });
    }
}

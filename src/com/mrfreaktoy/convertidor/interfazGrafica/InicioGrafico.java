package com.mrfreaktoy.convertidor.interfazGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InicioGrafico extends JFrame {
    public InicioGrafico() {
        setTitle("Convertidor Alura");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creamos dos botones
        JButton boton1 = new JButton("Moneda");
        JButton boton2 = new JButton("Longitud");


        // Creamos un panel para colocar los botones horizontalmente
        JPanel panel = new JPanel();
        panel.add(boton1);
        panel.add(boton2);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                InterfazInputValue inputValue = new InterfazInputValue();
                //inputValue.setVisible(true);
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                InterfazConvertionLength convertionLength  = new InterfazConvertionLength();
            }
        });

        // Agregamos el panel a la ventana
        add(panel);
        this.dispose();
    }
}

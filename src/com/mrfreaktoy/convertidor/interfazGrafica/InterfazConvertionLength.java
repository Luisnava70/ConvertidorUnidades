package com.mrfreaktoy.convertidor.interfazGrafica;

import com.mrfreaktoy.convertidor.Exeption.NumeroNegativoException;
import com.mrfreaktoy.convertidor.Model.ConvetsionUnits;
import com.mrfreaktoy.convertidor.Model.MeasurementUnits;

import javax.swing.*;
import java.util.Arrays;

public class InterfazConvertionLength extends JFrame {
    public InterfazConvertionLength(){
        double longituAconvertir = 0;
        int opcMenu = -1;
        int salida = -1;
        JFrame frame = new JFrame("Convertidor de Moneda");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Mostramos un cuadro de diálogo de entrada para obtener la cantidad a convertir
        do {
            try {
                longituAconvertir = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad a convertir:"
                        , "Convertidor de Longitud",
                        JOptionPane.INFORMATION_MESSAGE));
                if (longituAconvertir <= 0){
                    throw new NumeroNegativoException("Ingrese un numero positivo");
                }
            }catch (NumberFormatException  | NumeroNegativoException e){
                JOptionPane.showMessageDialog(null,"coloque un numero valido");
            }
        }while (longituAconvertir <= 0);

        String message = "Longitud a convertir: " + longituAconvertir;
        JOptionPane.showMessageDialog(null,message);

        String[] botones = {
                "1. cm a m",
                "2. cm a kl",
                "3. m a cm",
                "4. m a kl",
                "5. kl a cm",
                "6. kl a m "
        };

        do {
            String opcion =(String) JOptionPane.showInputDialog(frame,"Conversión de longitudes",
                    "Menu de longitudes",JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);

            opcMenu = Arrays.asList(botones).indexOf(opcion);
            MeasurementUnits centimetro = new MeasurementUnits("cm","Centimetro");
            MeasurementUnits metro = new MeasurementUnits("m","Metros");
            MeasurementUnits kilometro = new MeasurementUnits("km","Kilometro");

            //cambio-relacion de cm
            ConvetsionUnits cmAm = new ConvetsionUnits(centimetro,metro,0.01);
            ConvetsionUnits cmAkl = new ConvetsionUnits(centimetro,kilometro,0.00001);
            //cambio-relacion de m
            ConvetsionUnits mAcm = new ConvetsionUnits(metro,centimetro,100);
            ConvetsionUnits mAkl = new ConvetsionUnits(metro,kilometro,0.001);
            //cambio-relacion de m
            ConvetsionUnits klAcm = new ConvetsionUnits(kilometro,centimetro,100000);
            ConvetsionUnits klAm = new ConvetsionUnits(kilometro,metro,1000);


            switch (opcMenu){
                case 0:
                    InterfazConverterOperationLength.lenghtConvetion(cmAm, longituAconvertir);
                    break;
                case 1:
                    InterfazConverterOperationLength.lenghtConvetion(cmAkl, longituAconvertir);
                    break;
                case 2:
                    InterfazConverterOperationLength.lenghtConvetion(mAcm, longituAconvertir);
                    break;
                case 3:
                    InterfazConverterOperationLength.lenghtConvetion(mAkl, longituAconvertir);
                    break;
                case 4:
                    InterfazConverterOperationLength.lenghtConvetion(klAcm, longituAconvertir);
                    break;
                case 5:
                    InterfazConverterOperationLength.lenghtConvetion(klAm, longituAconvertir);
                    break;
                default:
                    break;
            }
            salida = JOptionPane.showConfirmDialog(null,"¿Deseas continuar?",
                    "Slect option",JOptionPane.YES_NO_OPTION);
        }while (salida != 1);
        InicioGrafico inicioGrafico = new InicioGrafico();
        inicioGrafico.setVisible(true);
    }
}

package com.mrfreaktoy.convertidor.interfazGrafica;

import com.mrfreaktoy.convertidor.Model.ConvetsionUnits;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InterfazConverterOperationLength {
    public static void lenghtConvetion(@NotNull ConvetsionUnits convetionUnits, double amounToConvert){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.UP);

        double convertedLenght = convetionUnits.getConversionFactor() * amounToConvert;
        String numeroRecortadoStr = decimalFormat.format(convertedLenght);
        double numeroRecortado = Double.parseDouble(numeroRecortadoStr);

        String lenghtConvertion =  amounToConvert
                + " "
                + convetionUnits.getOriginUnits().getUnitsCode()
                + " = "
                + numeroRecortado
                + " "
                + convetionUnits.getDestinationUnits().getUnitsCode();

        JOptionPane.showMessageDialog(null,lenghtConvertion,"Conversion de logitud"
                ,0,null);
    }
}

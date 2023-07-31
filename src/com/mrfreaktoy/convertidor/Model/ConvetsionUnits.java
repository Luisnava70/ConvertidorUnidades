package com.mrfreaktoy.convertidor.Model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ConvetsionUnits {
    private MeasurementUnits originUnits;
    private MeasurementUnits destinationUnits;
    private double conversionFactor;

    public ConvetsionUnits(MeasurementUnits originUnits, MeasurementUnits destinationUnits, double conversionFactor) {
        this.originUnits = originUnits;
        this.destinationUnits = destinationUnits;
        this.conversionFactor = conversionFactor;
    }

    public Units getOriginUnits() {
        return originUnits;
    }

    public Units getDestinationUnits() {
        return destinationUnits;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public static void conversionUnit(ConvetsionUnits convetionUnits, double amounToConvert){
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        decimalFormat.setRoundingMode(RoundingMode.UP);

        if (amounToConvert <= 0){
            System.out.println("Solo numeros positivos");
        }else {
            double convertedUnit = convetionUnits.getConversionFactor() * amounToConvert;
            String numeroRecortadoStr = decimalFormat.format(convertedUnit);
            double numeroRecortado = Double.parseDouble(numeroRecortadoStr);
            System.out.println(
                    amounToConvert
                    + " "
                    + convetionUnits.originUnits.getUnitsCode()
                    + " = "
                    + numeroRecortado
                    + " "
                    + convetionUnits.destinationUnits.getUnitsCode()
            );
        }
    }


}

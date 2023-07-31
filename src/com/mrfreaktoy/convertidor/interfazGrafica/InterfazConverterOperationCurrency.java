package com.mrfreaktoy.convertidor.interfazGrafica;

import com.mrfreaktoy.convertidor.Model.CurrencyRate;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InterfazConverterOperationCurrency {
    public static void currencyConversion(@NotNull CurrencyRate currency, double mone){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.UP);

        double convertedCurrency = currency.getConversionRate() * mone;
        String numeroRecortadoStr = decimalFormat.format(convertedCurrency);
        double numeroRecortado = Double.parseDouble(numeroRecortadoStr);

        String currencyConverted = currency.originCurrency.getCurrencySymbol()
                + mone + " Equivalen a "
                + currency.destinationCurrency.getCurrencySymbol()
                + numeroRecortado
                + " "
                + currency.destinationCurrency.getUnitsName() ;
        JOptionPane.showMessageDialog(null,currencyConverted,"Dinero Convertido",0,null);
    }
}

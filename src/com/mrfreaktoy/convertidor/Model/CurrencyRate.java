package com.mrfreaktoy.convertidor.Model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrencyRate {
    public Currency originCurrency;
    public Currency destinationCurrency;
    public double conversionRate;

    public CurrencyRate(Currency originCurrency, Currency destinationCurrency, double conversionRate) {
        this.originCurrency = originCurrency;
        this.destinationCurrency = destinationCurrency;
        this.conversionRate = conversionRate;
    }

    public Currency getOriginCurrency() {
        return originCurrency;
    }


    public Currency getDestinationCurrency() {
        return destinationCurrency;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public static void conversionCurrecny(CurrencyRate currencyRate, double mone){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.UP);
        if (mone <= 0){
            System.out.println("Solo numeros positivos");
        }else {
            double convertedCurrency = currencyRate.getConversionRate() * mone;
            String numeroRecortadoStr = decimalFormat.format(convertedCurrency);
            double numeroRecortado = Double.parseDouble(numeroRecortadoStr);
            System.out.println(currencyRate.originCurrency.getCurrencySymbol()
                    + mone + " Equivalen a "
                    + currencyRate.destinationCurrency.getCurrencySymbol()
                    + numeroRecortado
                    + " "
                    + currencyRate.destinationCurrency.getUnitsName());
        }

    }
}

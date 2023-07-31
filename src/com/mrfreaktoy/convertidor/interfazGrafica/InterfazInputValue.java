package com.mrfreaktoy.convertidor.interfazGrafica;

import com.mrfreaktoy.convertidor.Exeption.NumeroNegativoException;
import com.mrfreaktoy.convertidor.Model.Currency;
import com.mrfreaktoy.convertidor.Model.CurrencyRate;

import javax.swing.*;
import java.util.Arrays;

public class InterfazInputValue extends JFrame {
    public InterfazInputValue(){
        double dineroAconvertir = 0;
        int opcMenu = -1;
        int salida = -1;
        JFrame frame = new JFrame("Convertidor de Moneda");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Mostramos un cuadro de diálogo de entrada para obtener la cantidad a convertir
        do {
            try {
                dineroAconvertir = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad a convertir:"
                        , "Convertidor de Moneda",
                        JOptionPane.INFORMATION_MESSAGE));
                if (dineroAconvertir <= 0){
                    throw new NumeroNegativoException("Ingrese un numero positivo");
                }
            }catch (NumberFormatException  | NumeroNegativoException e){
                JOptionPane.showMessageDialog(null,"coloque un numero valido");
            }
        }while (dineroAconvertir <= 0);

        String message = "Dinero a convertir: " + dineroAconvertir;
           JOptionPane.showMessageDialog(null,message);

        String[] botones = {
                "1. Pesos MX a Dollar EUA",
                "2. Pesos MX a EURO",
                "3. Pesos MX a Yen Japones",
                "4. Pesos MX a Libra Esterlina",
                "5. Dollar EUA a Pesos MX",
                "6. EURO EUA a Pesos MX ",
                "7. Yen Japones EUA a Pesos MX",
                "8. Libra Esterlina a Pesos MX"
        };

        do {
            String opcion =(String) JOptionPane.showInputDialog(frame,"Conversión de Monedas",
                    "Menu de Monedas",JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);

            opcMenu = Arrays.asList(botones).indexOf(opcion);
            Currency pesos = new Currency("MX","Pesos","$");
            Currency dollar = new Currency("USD","Dolares","US$");
            Currency euro = new Currency("EUR","Euros","€");
            Currency yenJapones = new Currency("JPY","Yen Japones","¥");
            Currency libraEsterlina = new Currency("GBP","Libras Esterlinas",
                    "£");
            //Cambio de pesos a moneda extranjera
            CurrencyRate currencyRate1 = new CurrencyRate(pesos,dollar,0.05964);
            CurrencyRate currencyRate2 = new CurrencyRate(pesos,euro,0.05317);
            CurrencyRate currencyRate3 = new CurrencyRate(pesos,yenJapones,8.3472);
            CurrencyRate currencyRate4 = new CurrencyRate(pesos,libraEsterlina,0.04616);
            //cambio de moneda extranjera a pesos
            CurrencyRate currencyRate6 = new CurrencyRate(dollar,pesos,16.7667);
            CurrencyRate currencyRate7 = new CurrencyRate(euro,pesos,18.8064);
            CurrencyRate currencyRate8 = new CurrencyRate(yenJapones,pesos,0.1198);
            CurrencyRate currencyRate9 = new CurrencyRate(libraEsterlina,pesos,21.6626);


            switch (opcMenu){
                case 0:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate1, dineroAconvertir);
                    break;
                case 1:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate2, dineroAconvertir);
                    break;
                case 2:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate3, dineroAconvertir);
                    break;
                case 3:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate4, dineroAconvertir);
                    break;
                case 4:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate6, dineroAconvertir);
                    break;
                case 5:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate7, dineroAconvertir);
                    break;
                case 6:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate8, dineroAconvertir);
                    break;
                case 7:
                    InterfazConverterOperationCurrency.currencyConversion(currencyRate9, dineroAconvertir);
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


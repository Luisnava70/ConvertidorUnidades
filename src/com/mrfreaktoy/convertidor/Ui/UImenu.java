package com.mrfreaktoy.convertidor.Ui;

import com.mrfreaktoy.convertidor.Model.ConvetsionUnits;
import com.mrfreaktoy.convertidor.Model.Currency;
import com.mrfreaktoy.convertidor.Model.CurrencyRate;
import com.mrfreaktoy.convertidor.Model.MeasurementUnits;

import java.util.Scanner;

public class UImenu {
    /*public static void showMenu(){
        System.out.println("Bienvenido al convertidor alura");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Convertidor de monedas");
            System.out.println("2. Convertidor de Unidades");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    UImenu.MenuConversorMoneda();
                    break;
                case 2:
                    UImenu.menuConversionMeasurementUnits();
                    break;
                case 0:
                    System.out.println("Gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("Selecciona un opcion valida");
            }
        }while (response != 0);
    }

    public static void MenuConversorMoneda(){

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
            Scanner scMone = new Scanner(System.in);
            System.out.println("¿Cuanto dinero quieres convertir?");
            double dineroAConvertir = scMone.nextDouble();
            System.out.println("Selecciona la opción deseada");
            int response = -1;
            do {
                System.out.println("1. Pesos MX a Dollar EUA");
                System.out.println("2. Pesos MX a EURO");
                System.out.println("3. Pesos MX a Yen Japones");
                System.out.println("4. Pesos MX a Libra Esterlina");
                System.out.println("5. Dollar EUA a Pesos MX");
                System.out.println("6. EURO EUA a Pesos MX ");
                System.out.println("7. Yen Japones EUA a Pesos MX");
                System.out.println("8. Libra Esterlina a Pesos MX");
                System.out.println("0. Salir");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        CurrencyRate.conversionCurrecny(currencyRate1,dineroAConvertir);
                        break;
                    case 2:
                        CurrencyRate.conversionCurrecny(currencyRate2,dineroAConvertir);
                        break;
                    case 3:
                        CurrencyRate.conversionCurrecny(currencyRate3,dineroAConvertir);
                        break;
                    case 4:
                        CurrencyRate.conversionCurrecny(currencyRate4,dineroAConvertir);
                        break;
                    case 5:
                        CurrencyRate.conversionCurrecny(currencyRate6,dineroAConvertir);
                        break;
                    case 6:
                        CurrencyRate.conversionCurrecny(currencyRate7,dineroAConvertir);
                        break;
                    case 7:
                        CurrencyRate.conversionCurrecny(currencyRate8,dineroAConvertir);
                        break;
                    case 8:
                        CurrencyRate.conversionCurrecny(currencyRate9,dineroAConvertir);
                        break;
                    case 0:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Please select a correct answer");
                }
            }while (response != 0);
        }

        public static void menuConversionMeasurementUnits(){
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

            Scanner sc = new Scanner(System.in);
            System.out.println("Unidades a convertir: ");
            double unidadesAConvertir = sc.nextDouble();
            System.out.println("Selecciona la opción deseada");
            int response = -1;
            do {
                System.out.println("1. cm a m");
                System.out.println("2. cm a kl");
                System.out.println("3. m a cm");
                System.out.println("4. m a kl");
                System.out.println("5. kl a cm");
                System.out.println("6. kl a m ");
                System.out.println("0. Salir");

                response = sc.nextInt();

                switch (response){
                    case 1:
                        ConvetsionUnits.conversionUnit(cmAm,unidadesAConvertir);
                        break;
                    case 2:
                        ConvetsionUnits.conversionUnit(cmAkl,unidadesAConvertir);
                        break;
                    case 3:
                        ConvetsionUnits.conversionUnit(mAcm,unidadesAConvertir);
                        break;
                    case 4:
                        ConvetsionUnits.conversionUnit(mAkl,unidadesAConvertir);
                        break;
                    case 5:
                        ConvetsionUnits.conversionUnit(klAcm,unidadesAConvertir);
                        break;
                    case 6:
                        ConvetsionUnits.conversionUnit(klAm,unidadesAConvertir);
                        break;
                    case 0:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Please select a correct answer");
                }
            }while (response != 0);

        }*/
    }

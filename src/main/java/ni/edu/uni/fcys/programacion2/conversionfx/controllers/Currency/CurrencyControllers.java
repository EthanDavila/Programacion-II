/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers.Currency;

/**
 *
 * @author Sistemas-10
 */
public class CurrencyControllers {
    public static float ConversionCaD(float Cantidad){
        return ((float)Cantidad / 35.16f);
    }
    public static float ConversionCaE(float Cantidad){
        return ((float)Cantidad / 42.77f);
    }
    public static float ConversionDaC(float Cantidad){
        return ((float)Cantidad * 35.16f);
    }
    public static float ConversionDaE(float Cantidad){
        return ((float)Cantidad * 0.82f);
    }
    public static float ConversionEaC(float Cantidad){
        return ((float)Cantidad * 42.77f);
    }
    public static float ConversionEaD(float Cantidad){
        return ((float)Cantidad / 0.82f);
    }
}

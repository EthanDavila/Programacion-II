/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers.Temperature;

/**
 *
 * @author Sistemas-32
 */
public class TemperatureConversion {
    public static float ConversionF(float Temp){
        return ((float) 9/5) * Temp + 32;
    }
    
    public static float ConversionC(float Temp){
        return ((float) 5/9) * (Temp - 32);
    }
}

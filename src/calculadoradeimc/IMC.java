/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoradeimc;

import java.text.DecimalFormat;

/**
 *
 * @author matheus
 */
public class IMC {
    
    public float calcIMC(float altura, float peso) {
        float imc = peso / (altura * altura);
        
        return imc;
    }
    
    public String classificacaoIMC(float imc) {
        
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc <= 24.9) {
            return "Normal";
        } else if (imc <= 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
        
    }
}

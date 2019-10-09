/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpbo;
/**
 *
 * @author asus
 */
public class Sepedamotor {
    public static void main(String[] args) {
        Sepedamotor motor = new Sepedamotor();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String merk){
        merk = " honda ";
        System.out.println("Merk Motor Adalah : " + merk);
    }
    private void setNama(String nama){
        nama = " beat ";
        System.out.println("Merk Motor Adalah : " + nama);
        
}}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendezesek;


public class Rendezesek {
    
    public static int[] egyszeru(int[] sorozat){
        for (int i = 0; i < sorozat.length; i++) {
            int j = i - 1;
            while (( j >= 0 ) && (sorozat[j] > sorozat[j+1])){
                int seged = sorozat[j];
                sorozat[j] = sorozat[j+1];
                sorozat[j+1] = seged;
                j--;
            }
            
        }
    return sorozat;
    }
}

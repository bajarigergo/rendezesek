/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendezesek;

public class Teszt {
    
    public static void assertek(){
        int[] sor1 = {};
        assert rendezettE(Rendezesek.egyszeru(sor1)): "üres sorozatra nem működik";
    
        int[] sor2 = {3,5,6};
        assert rendezettE(Rendezesek.egyszeru(sor2)): "szigorúan monoton növekvő";
        
        int[] sor3 = {3,5,5,6};
        assert rendezettE(Rendezesek.egyszeru(sor3)): "Monoton növekvő sorozatra nem működik";
        
        int[] sor4 = {13, 5, -5, -6};
        assert rendezettE(Rendezesek.egyszeru(sor4)): "Csökkenő sorozatra nem működik";
        
        int[] sor5 = {10,2,14};
        assert rendezettE(Rendezesek.egyszeru(sor5)): "Völgy típusú sorozatra nem működik";
        
        int[] sor6 = {10, 42, 14};
        assert rendezettE(Rendezesek.egyszeru(sor6)): "Hegy típusú sorozatra nem működik";
        
        int[] sor7 = {13, 5, 5, 6};
        assert rendezettE(Rendezesek.egyszeru(sor7)): "Az első nagyobb, a többi rendezett sorozatra nem működik";
        
        int[] sor8 = {13, 55, 75, 6};
        assert rendezettE(Rendezesek.egyszeru(sor8)): "Az utolsó kisebb, a többi rendezet sorozatra nem működik";
        
        int[] sor9 = {13,55,35,46};
        assert rendezettE(Rendezesek.egyszeru(sor9)): "Hegy-völgy sorozatra nem működik";
        
        int[] sor10 = {13, -5, 35, 16, 45, 0};
        assert rendezettE(Rendezesek.egyszeru(sor10)): "Völgy-hegy sorozatra nem működik";
        
        
        
    }
    public static boolean rendezettE(int[] sor){
        int i = 0;
        while ( i < sor.length-1 && sor[i] <= sor[i+1] ){
        i++;
        }
        return i >= sor.length-1;
    }
}

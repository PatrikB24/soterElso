package main;

import java.util.Random;

public class ProgTetelekOsszefoglalo {

    private static final String SEP = System.lineSeparator();
    private static final Random rnd = new Random();
    private static int[] sorozat;/* = {3, 1, 7, 2};*/
    
    public static int[] sorozatElemei(){
        return sorozat;
    }
    
    public static void sorozatotBeallit(int[] tomb){
        sorozat = tomb;
    }
    
    public static void main(String[] args) {
        tetelekBemutatasa();
    }

    private static void tetelekBemutatasa() {
        sorozat = feltolt(10);
        konzolraIr(tombElemei() + SEP);
        
        konzolraIr("összeg: " + osszegzes() + SEP);
        
        String van = eldontes() ? "van" : "nincs";
        //System.out.println("van legalább 1 páratlan: " + van);
        konzolraIr("van legalább 1 páratlan: " + van + SEP);
    }

    public static int[] feltolt(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < db; i++) {
            tomb[i] = rnd.nextInt();
        }
        return tomb;
    }
    
    private static String tombElemei() {
        String s = "";
        for (int elem : sorozat) {
            s += elem + " ";
        }
        return s;
    }
    
    public static int osszegzes() {
        int osszeg = 0;
        for (int elem : sorozat) {
            osszeg += elem;
        }
        //System.out.println("összeg: " + osszeg);
        return osszeg;
    }

    public static boolean eldontes() {
        int i = 0;
        while(i < sorozat.length && !(sorozat[i] % 2 == 1)){
            i++;
        }
        //boolean van = i < sorozat.length;
        //System.out.println("van legalább 1 páratlan: " + van);
        return i < sorozat.length;
    }
 
    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

    
    
}

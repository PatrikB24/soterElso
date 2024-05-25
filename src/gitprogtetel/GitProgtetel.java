package gitprogtetel;

public class GitProgtetel {

    public static void main(String[] args) {
        int[] szamok = {3, 5, 2, 8, 6, 1};
        legnagyobbkivalasztas(szamok);
        osszegzes();
    }

    private static void legnagyobbkivalasztas(int szamok[]) {
        int max = szamok[0];
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i] > max) {
                max = szamok[i];
            }
        }
        System.out.println("A legnagyobb szám a tömbben: " + max);
    }

    private static void osszegzes() {
        int[] sorozat = {2, 5, 1, 6, 3};
        kiirEredmeny("A sorozat elemei: ");
        kiirTomb(sorozat);
        int osszeg = 0;
       
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
        
        System.out.println("A sorozat összege: " + osszeg);
    }

     private static void kiirEredmeny(String eredmeny) {
        System.out.println(eredmeny);}
        
        
     private static void kiirTomb(int[] tomb) {

        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }
    
    
}

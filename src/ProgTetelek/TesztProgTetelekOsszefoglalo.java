package teszt;

import main.ProgTetelekOsszefoglalo;

public class TesztProgTetelekOsszefoglalo {
    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        System.out.println("Teszt esetek:");
        //ProgTetelekOsszefoglalo.sorozat = new int[3];
        
        feltoltTeszt();
        osszegzesTeszt();
        eldontesTeszt();
    }

    private static void feltoltTeszt() {
        System.out.println(" - Feltöltés teszt 4 elemmel");
        int[] tesztErtekek = ProgTetelekOsszefoglalo.feltolt(4);
        ProgTetelekOsszefoglalo.sorozatotBeallit(tesztErtekek);
        int[] kapott = ProgTetelekOsszefoglalo.sorozatElemei();
        int vart = 4;
        assert kapott.length == vart : "feltöltési hiba!";
    }
    
    private static void osszegzesTeszt() {
        int[] tesztErtekek = {3, 1, 7, 2};
        ProgTetelekOsszefoglalo.sorozatotBeallit(tesztErtekek);

        int kapott = ProgTetelekOsszefoglalo.osszegzes();
        int vart = 13;
        System.out.println(" - Összegzés teszt (3, 1, 7, 2)");
//        if(kapott == vart){
//            System.out.println("sikeres");
//        }else{
//            System.out.println("sikertelen");
//        }
        assert kapott == vart : "sikertelen";
        
        tesztErtekek[0] = -1;
        tesztErtekek[1] = -1;
        tesztErtekek[2] = 0;
        tesztErtekek[3] = 1;
        ProgTetelekOsszefoglalo.sorozatotBeallit(tesztErtekek);

        kapott = ProgTetelekOsszefoglalo.osszegzes();
        vart = -1;
        System.out.println(" - Összegzés teszt (-1, -1, 0, -1)");
//        if(kapott == vart){
//            System.out.println("sikeres");
//        }else{
//            System.out.println("sikertelen");
//        }
        assert kapott == vart : "sikertelen";
    }

    private static void eldontesTeszt() {
        int[] tesztErtekek = {3, 1, 7, 2};
        ProgTetelekOsszefoglalo.sorozatotBeallit(tesztErtekek);
        boolean kapott = ProgTetelekOsszefoglalo.eldontes();
        boolean vart = true;
        System.out.println(" - Eldöntés teszt VAN (3, 1, 7, 2)");
        assert kapott == vart : "sikertelen";
        
        tesztErtekek[0] = 30;
        tesztErtekek[1] = 10;
        tesztErtekek[2] = 70;
        tesztErtekek[3] = 2;
        ProgTetelekOsszefoglalo.sorozatotBeallit(tesztErtekek);
        kapott = ProgTetelekOsszefoglalo.eldontes();
        vart = false;
        System.out.println(" - Eldöntés teszt NINCS (30, 10, 70, 2)");
        assert kapott == vart : "sikertelen";
    }

    
}

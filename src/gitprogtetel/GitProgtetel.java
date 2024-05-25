package gitprogtetel;

public class GitProgtetel {

    public static void main(String[] args) {
        int[] szamok = {3, 5, 2, 8, 6, 1};
        legnagyobbkivalasztas(szamok);
        
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

    

}

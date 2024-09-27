import java.util.Scanner;
public class TugasInduvidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte umur;
        String kategori="";
        
        System.out.println("Masukkan umur anda: ");
        umur = sc.nextByte();
        if (umur >=0 && umur <=13) {
            kategori = "Anak";
        }
        else if (umur >12 && umur <=19) {
            kategori = "Remaja";
        }
        else if (umur >19 && umur <=64) {
            kategori = "Dewasa";
        }
        else if (umur >=65)
        kategori = "Lansia";
        System.out.println("Jika usia anda " + umur + " maka anda termasuk dalam kategori : " + kategori);
        sc.close();
    }
}

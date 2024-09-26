import java.util.Scanner;
public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte umur;
        String kategori="";
    System.out.println("Masukkan umur anda: ");
    umur = sc.nextByte();
    if (umur >= 0 && umur <13) {
        kategori = "Anak";
    }
    else if (umur >12 && umur <=19){
        kategori = "remaja";
    }
    else if (umur >19 && umur <=64){
        kategori = "dewasa";
    }
    else if (umur >= 65)
    kategori = "lansia";
    System.out.println("Jika usia anda " + umur + " maka anda termasuk dalam kategori : " + kategori);
    }
}

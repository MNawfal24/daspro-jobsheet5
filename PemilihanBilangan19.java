import java.util.Scanner;
public class PemilihanBilangan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan Sebuah Angka: ");
        int angka = sc.nextInt();
        String Pengecekan = (angka % 2 == 0) ? "Angka genap" : "angka ganjil";
        System.out.println(" jadi Angka " + angka + " termasuk " + Pengecekan );
    }
}

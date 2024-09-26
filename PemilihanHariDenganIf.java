import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka Hari ");
        int angkaHari = sc.nextInt();
        if(angkaHari >= 1 && angkaHari <=5)
        {
            System.out.println(" Hari ini adalah hari weekday ");  
        } else if(angkaHari ==6 || angkaHari==7)
        {
            System.out.println(" Hari ini adalah Hari weekday ");
        }  
        else{
            System.out.println("Hari hanya ada 7");
        }
    }
}

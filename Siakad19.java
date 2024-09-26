import java.util.Scanner;
public class Siakad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String nama, nim, nilaiHuruf ="", Kualifikasi="";
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS ,nilaiAkhir;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print(" Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    nilaiUTS = sc.nextDouble();
    System.out.print("Masukkan nilai UAS: ");
    nilaiUAS = sc.nextDouble();
    nilaiAkhir = ((nilaiKuis * 0.20 ) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35)) / 3;
    
    if(nilaiAkhir >80){
        Kualifikasi = "Sangat Baik ";
        nilaiHuruf = "A ";
    }
    else if (nilaiAkhir >73){
        Kualifikasi ="lebih dari baik ";
        nilaiHuruf ="B+ ";
    }
    else if (nilaiAkhir >65){
        Kualifikasi ="Baik ";
        nilaiHuruf = "B ";
    }
    else if (nilaiAkhir >60){
        Kualifikasi = "Lebih dari cukup";
        nilaiHuruf = "C+ ";
    }
    else if (nilaiAkhir >50){
        Kualifikasi = "cukup ";
        nilaiHuruf = "C ";
    }
    else if (nilaiAkhir >39){
        Kualifikasi = "kurang";
        nilaiHuruf = "D ";
    }
    else if (nilaiAkhir <=39){
        Kualifikasi = "gagal";
        nilaiHuruf = "E ";
    }
    System.out.println("Nama: " + nama + "NIM:  " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir );
    System.out.println(" jadi Kualifikasinya adalah " + Kualifikasi);
    System.out.println(" Jadi nilai hurufnya adalah " + nilaiHuruf);

    }
}

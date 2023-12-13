import java.util.Scanner;

public class MenuKalkulator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        while (true){
            //Display Menu Calculator
            System.out.println("=====    MENU    =====");
            System.out.println("===== KALKULATOR =====");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            //Option
            System.out.print("Masukkan pilihan : ");
            int pilih = input.nextInt();

            if(pilih > 4){
                System.out.print("Pilihan Tidak Ditemukan. Silahkan Coba Lagi ^^");
                break;
            }

            //Variable
            System.out.print("Masukkan angka ke-1 : ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka ke-2 : ");
            double angka2 = input.nextDouble();
            double hasil = 0;

            //Memanggil Class Calculator dengan object kalkulator
            Kalkulator kalkulator = new Kalkulator(angka1, angka2);

            switch (pilih) {
                case 1:
                    hasil = kalkulator.tambah();
                    break;
                case 2:
                    hasil = kalkulator.kurang();
                    break;
                case 3:
                    hasil = kalkulator.kali();
                    break;
                case 4:
                    hasil = kalkulator.bagi();
                    break;
                default:
                    System.out.println("Your pilih is not available");
                    continue;
            }

            System.out.println("Hasil : " + hasil);

        }
        input.close();
    }
}
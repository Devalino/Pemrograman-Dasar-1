# Tugas1-PB1

Tugas pemrograman kasir sederhana dengan Java (PB1).

# Source Code
```java
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaBeras = 25000;
        int kg;
        double hargaAwal, hargaTotal, diskon, uang, kembalian;

        System.out.println("Penghitung Belanjaan");

        System.out.print("Total Beras (kg) = ");
        kg = input.nextInt();
        hargaAwal = hargaBeras * kg;
        System.out.printf("Harga sebelum diskon = Rp%,.0f%n", hargaAwal);

        System.out.print("Masukkan Diskon (%) = ");
        diskon = input.nextDouble();
        hargaTotal = hargaAwal - (hargaAwal * diskon / 100);
        System.out.printf("Diskon yang dimasukkan = %.0f%%%n", diskon);
        System.out.printf("Harga Setelah Diskon = Rp%,.0f%n", hargaTotal);

        System.out.print("Uang diterima = ");
        uang = input.nextDouble();
        kembalian = uang - hargaTotal;
        System.out.printf("Uang kembalian = Rp%,.0f%n", kembalian);

        input.close();
    }
}
```

# Hasil Codingan
![Hasil Program](Hasil%20tugas%20PB1.png)

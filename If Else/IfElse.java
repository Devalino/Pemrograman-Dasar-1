import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int barang, hargaBarang, member, uang;
        double diskon, harga, total, diskonMember, totalDiskon, kembalian;

        System.out.println("--- Toko Barokah ---");
        System.out.print("Jumlah Barang = ");
        barang = input.nextInt();
        System.out.print("Harga Barang = ");
        hargaBarang = input.nextInt();
        harga = barang * hargaBarang;
        System.out.println("total awal = "+harga);

        if (harga == 100000){
            diskon = 0;
        } else if (harga >= 100001 && harga <= 200000) {
            diskon = 5 * harga/100;
        } else if (harga >= 200001 && harga <= 300000){
            diskon = 10 * harga/100;
        } else if (harga >= 300001 && harga <= 400000){
            diskon = 15 * harga/100;
        }else if (harga >= 400001 && harga <= 500000){
            diskon = 20 * harga/100;
        }else if (harga >= 500000){
            diskon = 25 * harga/100;
        } else {
            diskon = 0;
        }
        
        total = harga - diskon;

        System.out.println("Diskon = "+diskon);
        System.out.println("Total Belanja = "+total);

        System.out.print("apakah memiliki memeber? (1. ya/2. tidak) = ");
        member = input.nextInt();

        if (member == 1) {
            diskonMember = 5 * total/100;
            totalDiskon = total - diskonMember;
            System.out.println("Diskon Member = "+diskonMember);
            System.out.println("total akhir = "+totalDiskon);
            System.out.print("Masukkan Nominal Uang = ");
            uang = input.nextInt();

            kembalian = uang - totalDiskon;
            System.out.println("Kembalian : "+kembalian);
        }
        else {
            System.out.println("total akhir = "+total);
            System.out.print("Masukkan Nominal Uang = ");
            uang = input.nextInt();

            kembalian = uang - total;
            System.out.println("Kembalian : "+kembalian);
        }
        input.close();
    }
}

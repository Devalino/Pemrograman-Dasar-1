import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Warung Wareg----");
        System.out.println("1. Sate\n2. Pecel\n3. Penyetan");
        System.out.print("Pilih menu makan = ");
        int menu = input.nextInt(), harga = 0, lauk, member;
        double hargaAkhir, diskon;

        switch (menu) {
            case 1:
                System.out.println("1. Ayam : 1.500/tusuk\n2. Kambing : 3.000/tusuk");
                System.out.print("Pilih daging sate = ");
                int sate = input.nextInt(), ayam = 1500, kambing = 3000;

                if (sate == 1) {
                    System.out.print("Masukkan total porsi = ");
                    int porsi = input.nextInt();
                    harga = ayam * porsi;
                    System.out.println("Harga Makanan = " + harga);
                } else if (sate == 2) {
                    System.out.print("Masukkan total porsi = ");
                    int porsi = input.nextInt();
                    harga = kambing * porsi;
                    System.out.println("Harga Makanan = " + harga);
                }
                break;

            case 2:
                System.out.println("1. Lauk ayam : 13.000/porsi\n2. Lauk empal : 15.000/porsi");
                System.out.print("Pilih lauk = ");
                lauk = input.nextInt();
                int Laukayam = 13000, Laukempal = 15000;

                if (lauk == 1) {
                    System.out.print("Masukkan total porsi = ");
                    int porsi = input.nextInt();
                    harga = Laukayam * porsi;
                    System.out.println("Harga Makanan = " + harga);
                } else if (lauk == 2) {
                    System.out.print("Masukkan total porsi = ");
                    int porsi = input.nextInt();
                    harga = Laukempal * porsi;
                    System.out.println("Harga Makanan = " + harga);
                }
                break;
            case 3:
                System.out.println("1. Lauk tahu/tempe : Rp. 5000/porsi\n2. Lauk Telur : Rp. 7000/porsi");
                System.out.println("3. Lauk ayam : Rp. 10000/porsi");
                System.out.print("pilih lauk = ");
                lauk = input.nextInt();
                int penyetantahutempe = 5000, penyetantelur = 7000, penyetanayam = 10000, porsi;

                switch (lauk) {
                    case 1:
                        System.out.print("Masukkan total porsi = ");
                        porsi = input.nextInt();
                        harga = penyetantahutempe * porsi;
                        System.out.println("harga makanan : " + harga);
                        break;
                    case 2:
                        System.out.print("Masukkan total porsi = ");
                        porsi = input.nextInt();
                        harga = penyetantelur * porsi;
                        System.out.println("harga makanan : " + harga);
                        break;
                    case 3:
                        System.out.print("Masukkan total porsi = ");
                        porsi = input.nextInt();
                        harga = penyetanayam * porsi;
                        System.out.println("harga makanan : " + harga);
                        break;
                    default:
                        System.out.println("menu tidak tersedia");
                        break;
                }
                break;
        }
        System.out.print("apakah anda memiliki member? (1. ya / 2. tidak) = ");
                member = input.nextInt();

                if (member == 1) {
                    diskon = 0.05 * harga;
                    hargaAkhir = harga - diskon;
                    System.out.println("harganya adalah : "+hargaAkhir);
                }
        input.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelEnkapsulasi;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class obj {

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    int jeniskamar, BBHari, harga, Fasilitas, FSKamar, pembayaran, hasil;
    String NJKamar, MPembayaran, JKKamar, FasilitasKm;

    public void inputJKH() {
        Scanner obj = new Scanner(System.in);

        System.out.print("Jenis Kamar Hotel : (1-10) \n1. Standard Room Rp. 200.000,00/Hari"
                + "\n2. Regular Room Rp. 350.000,00/Hari \n3. Deluxe Room Rp. 1.000.000,00/Hari \n4. Twin Room Rp. 700.000,00/Hari"
                + "\n5. Family Room Rp. 1.500.000,00/Hari \n6. Junior Suite Rp. 750.000,00/Hari \n7. Presidential Suite Rp. 60.000.000,00/Hari "
                + "\n8. Connecting Room Rp. 800.000,00/Hari \n9. Murphy Room Rp. 1.200.000,00/Hari  \n10. VIP Room Rp 1.300.000,00/Hari "
                + "\nPilih Jenis Kamar Hotel = ");
        jeniskamar = obj.nextInt();
        System.out.println("=============================================================");
    }

    public void getNomorKamar() {
        String[] JK = {
            "Standard Room", "Regular Room", "Deluxe Room", "Twin Room", "Family Room", "Junior Suite", 
            "Presidential Suite", "Connecting Room", "Murphy Room", "VIP Room"
        };
        Scanner obj = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int noKamar = (int) (Math.random() * range) + min;
        System.out.print("Berapa hari lo nginap bro = ");
        BBHari = obj.nextInt();

        if (jeniskamar == 1) {
            NJKamar = noKamar + "S";
            harga = BBHari * 200000;
            JKKamar = JK[0];
        } else if (jeniskamar == 2) {
            NJKamar = noKamar + "R";
            harga = BBHari * 350000;
            JKKamar = JK[1];
        } else if (jeniskamar == 3) {
            NJKamar = noKamar + "D";
            harga = BBHari * 1000000;
            JKKamar = JK[2];
        } else if (jeniskamar == 4) {
            NJKamar = noKamar + "T";
            harga = BBHari * 700000;
            JKKamar = JK[3];
        } else if (jeniskamar == 5) {
            NJKamar = noKamar + "F";
            harga = BBHari * 1500000;
            JKKamar = JK[4];
        } else if (jeniskamar == 6) {
            NJKamar = noKamar + "J";
            harga = BBHari * 750000;
            JKKamar = JK[5];
        } else if (jeniskamar == 7) {
            NJKamar = noKamar + "P";
            harga = BBHari * 60000000;
            JKKamar = JK[6];
        } else if (jeniskamar == 8) {
            NJKamar = noKamar + "C";
            harga = BBHari * 800000;
            JKKamar = JK[7];
        } else if (jeniskamar == 9) {
            NJKamar = noKamar + "M";
            harga = BBHari * 1200000;
            JKKamar = JK[8];
        } else if (jeniskamar == 10) {
            NJKamar = noKamar + "VIP";
            harga = BBHari * 1300000;
            JKKamar = JK[9];
        } else {
            System.out.println("Inputan salah!");
        }
        System.out.println("=============================================================");
        
    }

    public void Fasilitas() {
        String[] fasilitas;
        fasilitas = new String[4];
        fasilitas[0] = "Sarapan Gratis";
        fasilitas[1] = "View Sunrise";
        fasilitas[2] = "View Sunset";
        fasilitas[3] = "Tempat SPA";
        System.out.print("Pilih fasilitas yang diinginkan : (1-4)" + "\n1. "
                + fasilitas[0] + "\n2. " + fasilitas[1] + "\n3. " + fasilitas[2]
                + "\n4. " + fasilitas[3] + "\nPilih yang mana dek? = ");
        Scanner obj = new Scanner(System.in);
        Fasilitas = obj.nextInt();
        switch (Fasilitas) {
            case 1:
                FSKamar = 50000;
                FasilitasKm = fasilitas[0];
                break;
            case 2:
                FSKamar = 150000;
                FasilitasKm = fasilitas[1];
                break;
            case 3:
                FSKamar = 150000;
                FasilitasKm = fasilitas[2];
                break;
            case 4:
                FSKamar = 200000;
                FasilitasKm = fasilitas[3];
                break;
        }
        System.out.println("=============================================================");
    }

    public void Pembayaran() {
        String[] payment;
        payment = new String[5];
        payment[0] = "CASH";
        payment[1] = "E-Wallet (GOPAY, SHOPEE PAY, DANA, OVO)";
        payment[2] = "KARTU KREDIT (MANDIRI, BCA, BNI, CIMB NIAGA)";
        payment[3] = "INTERNET BANKING (BCA Clickpay, MANDIRI Clickpay)";
        payment[4] = "MINIMARKET (ALFAMART, INDOMART)";
        System.out.print("Pilih metode pembayaran : (1-5)" + "\n1. "
                + payment[0] + "\n2. " + payment[1] + "\n3. " + payment[2]
                + "\n4. " + payment[3] + "\n5. " + payment[4] + "\n Pilih yang mana dek? = ");
        Scanner obj = new Scanner(System.in);
        pembayaran = obj.nextInt();
        switch (pembayaran) {
            case 1:
                MPembayaran = payment[0];
                break;
            case 2:
                MPembayaran = payment[1];
                break;
            case 3:
                MPembayaran = payment[2];
                break;
            case 4:
                MPembayaran = payment[3];
                break;
            case 5:
                MPembayaran = payment[4];
                break;
        }
        System.out.println("=============================================================");
    }

    public void output() {
        hasil = harga + FSKamar;
        System.out.println("Jenis Kamar : " + JKKamar + "\nNomor kamar Hotel : " + NJKamar + "\nLama Menginap : " + BBHari + " Hari " + 
                "\nFasilitas yang anda pilih : " + FasilitasKm + "\nMetode Pembayaran : " 
                + MPembayaran + "\nBiaya Pembayaran : Rp " +
                hasil+ ",00");
    }
}

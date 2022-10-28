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
public class main {
    public static void main(String[] args) {
        String nama;
        Scanner obj = new Scanner(System.in);
        System.out.print("Nama loe = ");
        nama = obj.nextLine();
        System.out.println("=============================================================");
        obj call = new obj();
        call.setNama(nama);
        call.inputJKH();
        call.getNomorKamar();
        call.Fasilitas();
        call.Pembayaran();
        System.out.println("Nama Anda :" + call.getNama());
        call.output();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.tokoserbaada;

/**
 *
 * @author Marsy
 */
import java.util.Scanner;

public class SystemToko extends TokoSerbaAda {
    Scanner input = new Scanner(System.in);
    private int[] inputanJumBeli;
    private String[] inputanKode;
    private int jumlahBayar;
    private int x;
    
    private String[][] barang = getBarang();
    private int[] hargaBrg = getHargaBarang();
    
    static void headline(){
        System.out.println("TOKO SERBA ADA");
        System.out.println("");
    }
    
    public void input(){
        headline();
        // untuk menenntukan berapa jenis barang yang akan dibeli pelanggan
        System.out.print("Masukkan Item Barang   : "); 
        this.x = input.nextInt();
        
        this.inputanKode = new String[this.x];
        this.inputanJumBeli = new int[this.x];
        
        for(int i = 0; i < this.x; i++){
            System.out.println("Data ke " + (i + 1));
            //kode barang yang akan dibeli
            System.out.print("Masukkan kode        : "); 
            this.inputanKode[i] = input.next();
            //total barang tersebut
            System.out.print("Masukkan jumlah Beli : "); 
            this.inputanJumBeli[i] = input.nextInt();
        }
    }
    
    private int hitungTotal(int index, int jumBeli){
        int jumlah = jumBeli * this.hargaBrg[index];
        
        return jumlah;
    }
    
    public void checkInputan(){
        for (int i = 0; i < this.x; i++) {
            if (this.inputanKode[i].equals("a001")) {
                System.out.println((i + 1) + "\t" + this.barang[0][0] + "   \t" + this.barang[1][0] + "    \t" + this.hargaBrg[0] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(0, this.inputanJumBeli[i]));
                this.jumlahBayar += this.hitungTotal(0, this.inputanJumBeli[i]);
            } else if (this.inputanKode[i].equals("a002")) {
                System.out.println((i + 1) + "\t" + this.barang[0][1] + "   \t" + this.barang[1][1] + "    \t" + this.hargaBrg[1] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(1, this.inputanJumBeli[i]));
                this.jumlahBayar += this.hitungTotal(1, this.inputanJumBeli[i]);
            } else if (this.inputanKode[i].equals("a003")) {
                System.out.println((i + 1) + "\t" + this.barang[0][2] + "   \t" + this.barang[1][2] + "    \t" + this.hargaBrg[2] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(2, this.inputanJumBeli[i]));
                this.jumlahBayar += this.hitungTotal(2, this.inputanJumBeli[i]);
            } else if (this.inputanKode[i].equals("a004")) {
                System.out.println((i + 1) + "\t" + this.barang[0][3] + "   \t" + this.barang[1][3] + "    \t" + this.hargaBrg[3] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(3, this.inputanJumBeli[i]));
                this.jumlahBayar += this.hitungTotal(3, this.inputanJumBeli[i]);
            } else if (this.inputanKode[i].equals("a005")) {
                System.out.println((i + 1) + "\t" + this.barang[0][4] + "   \t" + this.barang[1][4] + "    \t" + this.hargaBrg[4] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(4, this.inputanJumBeli[i]));
                this.jumlahBayar += this.hitungTotal(4, this.inputanJumBeli[i]);
            }
        }
    }
    
    public void getStruk(){
        System.out.println("");
        headline();
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        checkInputan();
        System.out.println("==============================================================");
        System.out.println("Total Bayar                                             " + this.jumlahBayar);
        System.out.println("==============================================================");
        
        }
    }    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.tokoserbaada;

/**
 *
 * @author Marsy
 */
public class TokoSerbaAda {
        private String[][] barang = {
            {
                "a001", "a002", "a003", "a004", "a005"
            },
            {
                "Pensil", "Pulpen", "Buku", "Penggaris", "Tas"
            }
        };
        
        private int[] hargaBarang = {2000, 3000, 5000, 6000, 150000};
        
        public String[][] getBarang(){
            return this.barang;
        }
        
        public int[] getHargaBarang(){
            return this.hargaBarang;
        }
    
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        List<Siswa> daftarSiswa = new ArrayList<>();

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jmlSiswa=input.nextInt();



        for (int i = 0; i < jmlSiswa; i++) {
            Siswa siswa = new Siswa();
    
             System.out.println("Mahasiswa Ke : "+(i+1));
            System.out.print("Nama : ");
            siswa.setNama(input.next());
    
            System.out.print("Nim : ");
            siswa.setNim(input.nextInt());

            System.out.print("Fakultas : ");
            siswa.setFakultas(input.next());

            System.out.print("Nilai: ");
            siswa.setNilai(input.nextInt());
            
            if (siswa.nilai<=70) {
                siswa.status="Tidak Lulus";
            } else {
                siswa.status="Lulus";
            }
            daftarSiswa.add(siswa);
        
        }
       
        int no = 1;
        System.out.println("=================== Daftar Siswa ================");
        for (Siswa data : daftarSiswa) {
            System.out.println("Data siswa " + no);
            System.out.println("Nama : " + data.getNama());
            System.out.println("Nim : " + data.getNim());
            System.out.println("Fakultas : " + data.getFakultas());
            System.out.println("Nilai : " + data.getNilai());
            System.out.println("Status: " + data.getStatus());
            System.out.println("------------------------------------------------");
            no++;
            }
            System.out.println("====================================================");
        

    }
}

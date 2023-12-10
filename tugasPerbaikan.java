import java.util.ArrayList;
import java.util.Scanner;

public class tugasPerbaikan {
    String namaMah;
    String semester;
    static String matkul;
    static double nilai;
    
    
    public tugasPerbaikan(String namaMah, String semester, String matkul, double nilai) {
        this.namaMah = namaMah;
        this.semester = semester;
        this.matkul = matkul;
        this.nilai = 0;
    }

    public static void main(String[] args) {
        ArrayList<tugasPerbaikan> Mahasiswa = new ArrayList<tugasPerbaikan>();
        int menu = 1;
        int tmbh = 1;
        Scanner masukan = new Scanner(System.in);

        do{
            showMenu();
            System.out.println("Pilih Menu: ");
            menu = masukan.nextInt();

            if (menu == 1){
                System.out.print("Nama Mahasiswa:");
                String namaMah = masukan.nextLine();
                System.out.println("Semester: ");
                String semester = masukan.nextLine();
                
                do{
                    listMatkul();
                    tmbh = masukan.nextInt();

                    if( tmbh ==1){
                        System.out.print("Mata Kuliah: ");
                        String matkul = masukan.nextLine();
                        System.out.println("Nilai: ");
                        double nilai = masukan.nextDouble();
                    }
                }while(tmbh !=2);
                Mahasiswa.add(new tugasPerbaikan(namaMah,semester, matkul, nilai));

            }else if(menu == 2){
                display Mahasiswa
            }

        }while(menu !=3);
    }

    public static void showMenu() {
        System.out.println("=============================================================================");
        System.out.print("1) Tambah ");
        System.out.print("2) Tampilkan Nilai ");
        System.out.print("3) Keluar");
        System.out.println();
    }

    public static void listMatkul() {
        System.out.println("Mata Kuliah dan Nilai");
        System.out.print("1) Tambah ");
        System.out.print("2) Selesai");
        System.out.println();
    }
    
}



//maaf pak, saya buntu disini. kodenya saya edit lagi nanti.
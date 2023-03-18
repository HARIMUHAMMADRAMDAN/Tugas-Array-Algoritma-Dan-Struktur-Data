import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        double totalNilai = 0;
        String[][] data = new String[jumlah][3];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("Nilai: ");
            double nilai = input.nextDouble();

            totalNilai += nilai;

            String status;
            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            data[i][0] = Integer.toString(i+1);
            data[i][1] = nama;
            data[i][2] = Double.toString(nilai) + " " + status;

            System.out.println("________________________________");
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }

        double rataRata = totalNilai / jumlah;

        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}

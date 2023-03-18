import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        ArrayList<String[]> buah = new ArrayList<>();
        buah.add(new String[] {"apel", "35000"});
        buah.add(new String[] {"jeruk", "50000"});
        buah.add(new String[] {"mangga", "25000"});
        buah.add(new String[] {"duku", "15000"});
        buah.add(new String[] {"semangka", "20000"});

        ArrayList<String[]> belanja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume new line

            switch (pilihan) {
                case 1:
                    System.out.print("Pilih Buah (0-4): ");
                    int indexBuah = scanner.nextInt();
                    scanner.nextLine(); // consume new line

                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); // consume new line

                    String[] buahTerpilih = buah.get(indexBuah);
                    String namaBuah = buahTerpilih[0];
                    int hargaSatuan = Integer.parseInt(buahTerpilih[1]);

                    belanja.add(new String[] {
                            namaBuah,
                            Integer.toString(jumlah),
                            Integer.toString(hargaSatuan),
                            Integer.toString(jumlah * hargaSatuan)
                    });

                    char inputLagi;
                    do {
                        System.out.print("Input lagi? (y/n): ");
                        inputLagi = scanner.nextLine().charAt(0);
                        if (inputLagi != 'y' && inputLagi != 'n') {
                            System.out.println("Masukkan input yang benar (y/n)!");
                        }
                    } while (inputLagi != 'y' && inputLagi != 'n');
                    break;
                case 2:
                    System.out.println("Daftar Belanja:");
                    System.out.println("========================================");
                    System.out.println("No. Nama Buah Jumlah Harga Subtotal");
                    int no = 1;
                    int total = 0;
                    for (String[] belanjaan : belanja) {
                        System.out.printf("%d %s %s %s %s%n", no, belanjaan[0], belanjaan[1], belanjaan[2], belanjaan[3]);
                        total += Integer.parseInt(belanjaan[3]);
                        no++;
                    }
                    System.out.println("========================================");
                    System.out.println("Total: " + total);
                    int discount = (int) (total * 0.15);
                    System.out.println("Discount(15%): " + discount);
                    System.out.println("Total bayar: " + (total - discount));
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Masukkan pilihan yang benar!");
                    break;
            }
        } while (pilihan != 3);
    }
}

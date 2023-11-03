import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int choice;
        
        do {
            System.out.println("Pilih operasi konversi bilangan:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner1 = sc.next();
                    int desimal1 = Integer.parseInt(biner1, 2);
                    System.out.println("Hasil konversi: " + desimal1);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal2 = sc.nextInt();
                    String biner2 = Integer.toBinaryString(desimal2);
                    System.out.println("Hasil konversi: " + biner2);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner3 = sc.next();
                    int desimal3 = Integer.parseInt(biner3, 2);
                    String hexa3 = Integer.toHexString(desimal3);
                    System.out.println("Hasil konversi: " + hexa3);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan hexadesimal: ");
                    String hexa4 = sc.next();
                    int desimal4 = Integer.parseInt(hexa4, 16);
                    String biner4 = Integer.toBinaryString(desimal4);
                    System.out.println("Hasil konversi: " + biner4);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal5 = sc.nextInt();
                    String hexa5 = Integer.toHexString(desimal5);
                    System.out.println("Hasil konversi: " + hexa5);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan hexadesimal: ");
                    String hexa6 = sc.next();
                    int desimal6 = Integer.parseInt(hexa6, 16);
                    System.out.println("Hasil konversi: " + desimal6);
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }
}
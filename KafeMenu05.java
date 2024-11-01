import java.util.Scanner;

public class KafeMenu {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = linearSearch(menu, makananDicari);

        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak ada di menu.");
        }

    }

    public static boolean linearSearch(String[] array, String target) {
        for (String makanan : array) {
            if (makanan.equalsIgnoreCase(target)) {
                return true; 
            }
        }
        return false; 
    }
}

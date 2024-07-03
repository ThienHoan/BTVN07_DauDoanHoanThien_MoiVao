package ManagementApp;

import java.util.Scanner;

import model.Phone;
import model.PhoneBook;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneBook p = new PhoneBook("", "", "");
        int choice;
        do {
            System.out.println("*****Menu*****");
            System.out.println("1. Insert Phone.");
            System.out.println("2. Remove Phone.");
            System.out.println("3. Update Phone.");
            System.out.println("4. Search Phone.");
            System.out.println("5. Sort Phone.");
            System.out.println("6. Quit.");
            System.out.println("Moi ban chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    p.insertPhone();

                    break;
                case 2:
                    p.rmPhone();
                    break;

                case 3:
                    p.updatePhone();
                    break;
                case 4:
                    p.searchPhone();
                    break;
                case 5:
                    p.sort();
                    System.out.println("Đã sắp xếp");
                    break;
                case 6:
                    System.out.println("Tạm Biệt");
                default:
                    System.out.println("Moi ban nhap lại từ 1-6: ");
                    break;

            }
        } while (choice != 6);

    }
}

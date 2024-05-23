import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachine vm = new VendingMachine();
        Item it = new Item();
        Payment pm = new Payment();
        People pl = new People();

        ArrayList<String> product = new ArrayList<>();

        while (true) {
            System.out.println("1 -> Add new item, 2 -> Remove Item, 3 -> Display Item, 4 -> Order Item");
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("Enter Item name : price");
                String newItem = sc.nextLine();
                pl.addItem(newItem, product);
                it.addItemNotification(newItem);
            }
            else if(n == 2) {
                System.out.println("Enter the order of the item: ");
                int index = sc.nextInt() - 1;
                pl.removeItem(index, product);
                it.removeItemNotification();
            }
            else if(n == 3) {
                vm.displayProduct(product);
            }
            else if(n == 4) {
                System.out.println("Enter Item name: ");
                String itemName = sc.nextLine();
                pl.orderItem(itemName);
                if(itemName == "candy") it.setCandyAmount(100);
                else if(itemName == "juice")    it.setJuiceAmount(200);
                else    it.setCakeAmount(300);
                System.out.println("Provide amount: ");
                int amount = sc.nextInt();
                if(itemName == "candy") {
                    pm.makePayment(100);
                    if(amount < 100)   pm.payExtra(100 - amount);
                    else if(amount > 100)   pm.provideChange(amount - 100);
                    else System.out.println("Order delivered");
                }
                else if(itemName == "juice") {
                    pm.makePayment(200);
                    if(amount < 200)   pm.payExtra(200 - amount);
                    else if(amount > 200)   pm.provideChange(amount - 200);
                    else System.out.println("Order delivered");
                }
                else {
                    pm.makePayment(300);
                    if(amount < 300)   pm.payExtra(300 - amount);
                    else if(amount > 300)   pm.provideChange(amount - 300);
                    else System.out.println("Order delivered");
                }
            }
            else    break;
        }

    }
}
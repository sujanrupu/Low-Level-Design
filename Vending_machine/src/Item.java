public class Item {
    public void addItemNotification(String item) {
        System.out.println(item + " successfully added");
    }

    public void removeItemNotification() {
        System.out.println("Item successfully removed");
    }

   public void collectItemNotification(String item) {
       System.out.println(item + " delivered");
   }

   public void setCandyAmount(int amount) {
       System.out.println("Candy amount: " + amount);
   }

   public void setJuiceAmount(int amount) {
       System.out.println("Juice amount: " + amount);
   }

   public void setCakeAmount(int amount) {
       System.out.println("Cake amount: " + amount);
   }
}

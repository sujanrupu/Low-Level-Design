public class Client extends Sales_person{
    int n;
    public void select_choice_confirmation(int n) {
        this.n = n;
        System.out.println("Sending your choice to sales team");
    }
    public void car_readiness() {
        Sales_person sp = new Sales_person();
        sp.confirmation();
        if(this.n == 1){
            sp.Scorpio_build();
        }
        else {
            sp.Swift_build();
        }
        System.out.println("Car successfully delivered");
    }
}

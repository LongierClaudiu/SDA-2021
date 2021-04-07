package Teme.EX3;

public class main {
    public static void main (String[] args){
        Adress adress = new Adress("Soarelui" , "Agigea" , 31);
        PaymentMethod paymentMethod = new PaymentMethod("Revolut");
        Customer customer = new Customer(adress, paymentMethod , "Claudiu" , "Longier" , 23);

        System.out.println(customer.getCompleteName());
        System.out.println(customer.getAdress().showFullAdress());
        System.out.println(customer.getPaymentMethod().getType());
        System.out.println(customer.getFirstname() + " are " + customer.getAge()+" ani.");
    }
}

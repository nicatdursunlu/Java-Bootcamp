public class Main {

    public static void main(String[] args) {

        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "123";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78910";

        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "15182";

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(engin);
        customerManager.add(hepsiBurada);
        customerManager.add(abc);
        System.out.println("------------------------------------");

        Customer[] customers = { engin, hepsiBurada, abc };
        customerManager.addMultiple(customers);
    }
}

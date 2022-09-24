public class Main {


    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitsInStack(20);
        product1.setUnitPrice(8500);
        product1.setImageUrl("image1.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(5);
        product2.setUnitsInStack(2);
        product2.setUnitPrice(7500);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Delongi Kahve Makinesi");
        product3.setUnitPrice(10000);
        product3.setDiscount(10);
        product3.setUnitsInStack(5);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1, product2, product3};
       for(Product product : products){
           System.out.println(product.getName());
           System.out.println("Product unit price: "+product.getUnitPrice());
           System.out.println("Discount: "+product.getDiscount());
           System.out.println("Units in Stack: "+product.getUnitsInStack());
           System.out.println("______________");
       }

       System.out.println("____________________________");
       //Another Example....

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setFirstName("Jamshid");
        individualCustomer.setLastName("Sadiqi");
        individualCustomer.setCustomerNumber("556622");
        individualCustomer.setPhone("05001252222");
        individualCustomer.setId(0112);


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("VakifBank");
        corporateCustomer.setTaxNumber("0124541");
        corporateCustomer.setId(0214);
        corporateCustomer.setPhone("05050000000");
        corporateCustomer.setCustomerNumber("02445");

        Customer[] customers = {corporateCustomer,individualCustomer};





    }
}

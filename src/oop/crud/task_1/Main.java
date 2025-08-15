package oop.crud.task_1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main (String[] args ){

        Customer customer = new Customer();

        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFullName("Abduvali bakytbakov");
        customer1.setEmail("ali@gamil.com");
        customer1.setDateOfBirth(LocalDate.of(2004,3,2));
        customer1.setPhoneNumber("220709183");

        Customer customer2 = new Customer();
        customer1.setId(2L);
        customer1.setFullName("Alhani bakytbakov");
        customer1.setEmail("ali34ssf@gamil.com");
        customer1.setDateOfBirth(LocalDate.of(2014,4,7));
        customer1.setPhoneNumber("220709183");

        System.out.println("~~~~~~~~~~~~CREATE~~~~~~~~");
        customer.createCustomer(customer1);
        customer.createCustomer(customer2);

        System.out.println("~~~~~~~~~~~~GET ALL~~~~~~~~");
        System.out.println(Arrays.toString(customer.getCustomers()));

        System.out.println("~~~~~~~~~~~~~GET BY~~~~~~~~~~~");
        System.out.println(customer.getByIdCustomer(2));

        Customer updateCustomer = new Customer();
        updateCustomer.setFullName("ALisher");
        updateCustomer.setEmail("alisher@gamil.com");
        customer.updateCustomerByID(2L,updateCustomer);



    }
}

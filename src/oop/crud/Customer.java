package oop.crud;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Customer() {
    }
    public Customer(Long id, String fullName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    Customer[] customers = new Customer[10];
    int count = 0;

    public void createCustomer (Customer customer){
        customers[count++] = customer;
        System.out.println("Save");
    }

    public  Customer [] getCustomers (){
        return customers;

    }

    public Customer getByIdCustomer(long id){
        for (Customer customer : customers){
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;

    }

    public void updateCustomerByID(long id,Customer newCustomer){
        Customer oldCustomer = getByIdCustomer(id);
        oldCustomer.setFullName(newCustomer.getFullName());
        oldCustomer.setEmail(newCustomer.getEmail());
        System.out.println("Success");
//        for (Customer customer : customers){
//            if (customer.getId() == id) {
//                customer.setFullName(newCustomer.getFullName());
//                customer.setEmail(newCustomer.getEmail());
//
//            }else {
//                System.out.println("Customer with id: "+id +"not found");
//            }
//        }

    }

    public void deleteCustomerByID(long id){
        int index = -1;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = i;
                break;
            }
        }


        Customer[] newCustomers = new Customer[customers.length-1];

        for (int i = 0; i < index; i++) {
            newCustomers[i]=customers[i];
        }


        for (int i = 0; i < newCustomers.length; i++) {

            if (customers[i] == customers[index]) {
                continue;
            }else {

            }
            newCustomers[i] = customers[i+1];
        }
        customers = newCustomers;
    }


    @Override
    public String toString() {
        return
                "\nid = " + id + '\n'+
                "fullName = " + fullName + '\n' +
                "email = " + email + '\n' +
                "dateOfBirth = " + dateOfBirth + '\n'+
                "phoneNumber = " + phoneNumber;
    }
}

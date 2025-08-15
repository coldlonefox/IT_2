package oop.crud.task_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Product product = new Product();

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("\nЗаполните товар 1");
        Product product0 = new Product();
        System.out.print("ID product: ");
        product0.setId(scannerInt.nextLong());
        System.out.print("Name product - имя: ");
        product0.setNameProduct(scannerString.nextLine());
        System.out.print("Price product - цена: ");
        product0.setPriceProduct(scannerInt.nextLong());

        System.out.println("\nЗаполните товар 2");
        Product product1 = new Product();
        System.out.print("ID product: ");
        product1.setId(scannerInt.nextLong());
        System.out.print("Name product - имя: ");
        product1.setNameProduct(scannerString.nextLine());
        System.out.print("Price product - цена: ");
        product1.setPriceProduct(scannerInt.nextLong());

        System.out.println("\nЗаполните товар 3");
        Product product2 = new Product();
        System.out.print("ID product: ");
        product2.setId(scannerInt.nextLong());
        System.out.print("Name product - имя: ");
        product2.setNameProduct(scannerString.nextLine());
        System.out.print("Price product - цена: ");
        product2.setPriceProduct(scannerInt.nextLong());

        System.out.println("\n~~~~~~~~~~~~CREATE - УСПЕШЕА СОЗДАН~~~~~~~~");
        product.createProducts(product0);
        product.createProducts(product1);
        product.createProducts(product2);

        System.out.println("\n~~~~~~~~~~~~GET ALL - ВСЕ ПРОДУКТЫ~~~~~~~~");
        System.out.println(Arrays.toString(product.getProducts()));

        System.out.println("\n~~~~~~~~~~~~~GET BY~~~~~~~~~~~");
        System.out.println("Ишите по ID: ");
        System.out.print(product.getByIDProduct(scannerInt.nextLong()));

        System.out.println("\n~~~~~~~~~~~~~UPDATE - ИЗМЕНИТ~~~~~~~~~~~");

        Product updateProduct = new Product();
        System.out.print("Name - Имя продукта: ");
        updateProduct.setNameProduct(scannerString.nextLine());
        System.out.print("Price - Цена продукта: ");
        updateProduct.setPriceProduct(scannerInt.nextLong());
        System.out.print("Ишите по ID. для замены: ");
        product.updateProductByID(scannerInt.nextLong(),updateProduct);

        System.out.println("~~~~~~~~~~~~~DELETE~~~~~~~~~~~");
        System.out.print("Удалит продукт: ");
        product.deleteProductByID(scannerInt.nextLong());

    }
}

package oop.tasks.CRUD_TASK;

import java.util.Arrays;

public class Product {
    private Long id;
    private String nameProduct;
    private Long priceProduct;

    public Product() {
    }
    public Product( Long id, String nameProduct,Long priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public Long getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(Long priceProduct) {
        this.priceProduct = priceProduct;
    }

    //todo CRUD
    //todo Create
    Product[] products = new Product[10];
    int number= 0;

    public void createProducts (Product product){
        products[number++] = product;
        System.out.println("Success");
    }

    public Product[] getProducts (){
        return products;
    }

    public Product getByIDProduct(long id){
        for (Product product : products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public void updateProductByID (long id,Product newProduct){
        Product oldProduct = getByIDProduct(id);
        oldProduct.setNameProduct(newProduct.getNameProduct());
        oldProduct.setPriceProduct(newProduct.getPriceProduct());
    }

    public void deleteProductByID (long id){
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                index = i;
                break;
            }
        }
        Product[] newProduct = new Product[products.length-1];
        for (int i = 0; i < index; i++) {
            newProduct[i] = products[i];
        }
        products = newProduct;
        System.out.println(Arrays.toString(newProduct));
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~Product~~~~~~~~~~" +'\n' +
                "id: " + id +'\n' +
                "nameProduct: " + nameProduct + '\n' +
                "priceProduct: " + priceProduct  + '\n' ;
    }
}

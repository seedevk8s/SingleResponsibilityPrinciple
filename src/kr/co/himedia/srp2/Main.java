package kr.co.himedia.srp2;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("SmartPhoneA", 3000);
        Product product2 = new Product("SmartPhoneB", 3000);

        System.out.println("product1 : " + product1);

        ProductManager productManager = new ProductManager();
        productManager.update(product1, 900);




    }
}

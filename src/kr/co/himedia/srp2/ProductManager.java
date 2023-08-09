package kr.co.himedia.srp2;

public class ProductManager {

    public void update(Product product, int price) {
        // validate price
        validatePrice(price);

        // update price
        product.updatePrice(price);
    }

    private void validatePrice(int price) {
        if (price < 1000) {
            throw new IllegalArgumentException("the price is too low");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_system;

/**
 *
 * @author Joe
 */
public class FakeDatabase implements DataStorageStrategy {
     

	// Properties
    private Product[] products
            = {new Product("234567", "Brewers Shirt ", 14.95, new PercentageDiscount(.15)),
                new Product("135792", "Watch\t", 121.99, new NoDiscount())};

    // Methods
    @Override
    public Product findProduct(String itemId) {
        Product product = null;

        for (Product p : products) {
            if(itemId.equals(p.getItemId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}

package seminars.first.Shop;

import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 10));
        products.add(new Product("Product 2", 19));
        products.add(new Product("Product 3", 5));
        products.add(new Product("Product 4", 14));

        List<Product> emptyCart = new ArrayList<>();

        Shop shop = new Shop();
        shop.setProducts(products);

        Shop emptyShop = new Shop();
        emptyShop.setProducts(emptyCart);

        assertThat(shop.getProducts())
                .hasSize(4)
                .containsExactlyElementsOf(products);

        assertThat(emptyShop.getMostExpensiveProduct()).isEqualTo(null);
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(products.get(1));

        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(Comparator.comparing(Product::getCost));

        assertThat(shop.sortProductsByPrice()).isEqualTo(sortedProducts);
        assertThat(emptyShop.sortProductsByPrice()).isEqualTo(emptyCart);

    }



    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

}
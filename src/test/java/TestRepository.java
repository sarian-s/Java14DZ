import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRepository {
    @Test
    public void remove(){
        Product product1 = new Product(1, "яблоко", 5);
        Product product2 = new Product(2 ,"груша",10);
        Product product3 = new Product(3, "помидор", 15);
        ShopRepository repository = new ShopRepository();
        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        repository.remove(2);
        Product[] expected ={product1, product3} ;
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void remove1(){
        Product product1 = new Product(1, "яблоко", 5);
        Product product2 = new Product(2 ,"груша",10);
        Product product3 = new Product(3, "помидор", 15);
        ShopRepository repository = new ShopRepository();
        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        Assertions.assertThrows(NotFoundException.class, () -> repository.remove(10));

    }
}

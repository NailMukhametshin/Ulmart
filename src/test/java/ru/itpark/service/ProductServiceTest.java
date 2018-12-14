package ru.itpark.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Pot;
import ru.itpark.domain.Product;
import ru.itpark.domain.Smartphone;
import ru.itpark.repository.ProductRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private ProductService service;

    @BeforeEach
    void setUp() {
        ProductRepository repository = new ProductRepository();
        repository.add(new Smartphone(1, "Galaxy", 50_000, "Smartphone", "Samsung S7", 5));
        repository.add(new Smartphone(2, "Galaxy", 60_000, "Smartphone", "Samsung S8", 6));
        repository.add(new Smartphone(3, "Galaxy", 60_000, "Smartphone", "Samsung S9", 6));
        repository.add(new Computer(4, "Work", 40_000, "Computer", "Integrated", "AMD"));
        repository.add(new Pot(5, "Baby", 500, "Pot", "pink", 2));
        repository.add(new Pot(6, "Kid", 600, "Pot", "green", 3));

        service = new ProductService(repository);
    }

    @Test
    public void findByNameWithZeroResult() {

        List<Product> result = service.findAllByName("iPhone");
        assertEquals(0, result.size());
    }

    @Test
    public void findByNameWithOneResult() {
        {
            List<Product> result = service.findAllByName("Baby");
            assertEquals(1, result.size());
        }
    }

    @Test
    public void findByNameWithMultipleResult() {
        {
            List<Product> result = service.findAllByName("Galaxy");
            assertEquals(3, result.size());
        }
    }

    @Test
    public void findByCategoryWithZeroResult() {

        List<Product> result = service.findByCategory("T-Shirt");
        assertEquals(0, result.size());
    }

    @Test
    public void findByCategoryWithOneResult() {
        {
            List<Product> result = service.findByCategory("Computer");
            assertEquals(1, result.size());
        }
    }

    @Test
    public void findByCategoryWithMultipleResult() {
        {
            List<Product> result = service.findByCategory("Smartphone");
            assertEquals(3, result.size());
        }
    }
}
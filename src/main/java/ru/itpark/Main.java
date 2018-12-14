package ru.itpark;

import ru.itpark.comparator.NameComparator;
import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Pot;
import ru.itpark.domain.Product;
import ru.itpark.domain.Smartphone;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new ProductRepository());
        service.add(new Smartphone(1, "Note", 50_000, "Smartphone", "Samsung", 5));
        service.add(new Smartphone(2, "NCage", 3_000, "Smartphone", "Nokia", 3));
        service.add(new Computer(3, "Game", 80_000, "Computer", "NVidia", "Intel"));
        service.add(new Computer(4, "Work", 40_000, "Computer","Integrated", "AMD"));
        service.add(new Pot(5, "Baby", 500, "Pot", "pink", 2));
        service.add(new Pot(6, "Kid", 600, "Pot", "green", 3));

        System.out.println(service.getSorted(new PriceComparator()));

        List<Product> findByName = service.findAllByName("Baby");
        findByName.sort(new NameComparator());
        System.out.println(findByName);

        List<Product> findByCategory = service.findByCategory("Smartphone");
        findByCategory.sort(new NameComparator());
        System.out.println(findByCategory);

    }
}

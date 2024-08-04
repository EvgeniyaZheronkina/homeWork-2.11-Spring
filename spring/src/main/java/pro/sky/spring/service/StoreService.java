package pro.sky.spring.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Long> items) {
        basket.add(items);
    }

    public Set<Long> getAll(){
        return basket.getAll();
    }

}

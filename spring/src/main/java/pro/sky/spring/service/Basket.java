package pro.sky.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Long> items = new HashSet<>();

    public void add(List<Long> items) {
        this.items.addAll(items);
    }

    public Set<Long> getAll(){
        return Collections.unmodifiableSet(items);
    }

}

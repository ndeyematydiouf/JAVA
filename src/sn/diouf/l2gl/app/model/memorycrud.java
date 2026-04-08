package sn.diouf.l2gl.app.model;


import java.util.*;

public class InMemoryCrud<T extends Identifiable> implements Crud<T> {
    private final Map<Long, T> storage = new HashMap<>();

    @Override
    public void create(T entity) {
        if (storage.containsKey(entity.getId())) {
            throw new IllegalStateException("L'ID " + entity.getId() + " est déjà utilisé.");
        }
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<T> read(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }
    // ... implémentez update et delete sur le même modèle
}

package sn.diouf.l2gl.app.model;


import java.util.List;
import java.util.Optional;

public interface Crud<T extends Identifiable> {
    void create(T entity);
    Optional<T> read(Long id); // Usage de Optional pour éviter les retours null
    void update(T entity);
    void delete(Long id);
    List<T> findAll();
}
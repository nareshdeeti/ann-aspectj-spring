package io.deeti.annaspectjspring.respository;

import io.deeti.annaspectjspring.entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepository extends JpaRepository<Pen, Integer> {
}
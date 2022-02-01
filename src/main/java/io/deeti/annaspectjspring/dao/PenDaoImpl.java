package io.deeti.annaspectjspring.dao;

import io.deeti.annaspectjspring.entity.Pen;
import io.deeti.annaspectjspring.respository.PenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class PenDaoImpl implements PenDao{

    @Autowired
    private PenRepository penRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Pen createPen(Pen pen) {
        return penRepository.save(pen);
    }

    @Override
    @Transactional
    public Pen updatePen(Pen updatePen) {
        return entityManager.merge(updatePen);
    }
}

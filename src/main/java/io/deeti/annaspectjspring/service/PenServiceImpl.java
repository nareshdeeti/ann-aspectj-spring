package io.deeti.annaspectjspring.service;

import io.deeti.annaspectjspring.dao.PenDaoImpl;
import io.deeti.annaspectjspring.dto.PenDto;
import io.deeti.annaspectjspring.entity.Pen;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenServiceImpl implements PenService {

    @Autowired
    private PenDaoImpl penDao;

    @Override
    public PenDto newPen(PenDto pen) {

        Pen newPen = new Pen();
        BeanUtils.copyProperties(pen, newPen);

        penDao.createPen(newPen);

        return pen;
    }

    @Override
    public PenDto updatePen(PenDto updatePen) {

        Pen updated = new Pen();
        BeanUtils.copyProperties(updatePen, updated);

        penDao.updatePen(updated);

        return updatePen;
    }
}

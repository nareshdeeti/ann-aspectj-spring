package io.deeti.annaspectjspring.service;

import io.deeti.annaspectjspring.dto.PenDto;


public interface PenService {

    PenDto newPen(PenDto pen);

    PenDto updatePen(PenDto updatePen);


}

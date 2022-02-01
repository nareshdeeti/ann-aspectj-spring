package io.deeti.annaspectjspring.controller;

import io.deeti.annaspectjspring.dto.PenDto;
import io.deeti.annaspectjspring.service.PenServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pen")
public class PenController {

    private static final Logger logger = LoggerFactory.getLogger(PenController.class);

    @Autowired
    private PenServiceImpl penService;

    @PostMapping(value = "/newPen")
    public PenDto newPen(@RequestBody PenDto pen) {

        return penService.newPen(pen);
    }

    @PutMapping(value = "/updatePen")
    public PenDto updatePen(@RequestBody PenDto pen) {
        logger.info("" + pen);
        return penService.updatePen(pen);
    }

}

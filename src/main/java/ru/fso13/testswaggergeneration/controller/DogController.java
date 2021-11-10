package ru.fso13.testswaggergeneration.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fso13.testswaggergeneration.dto.DogDto;

import java.util.Collections;
import java.util.List;

@Api(tags = {"API собак"})
@RestController
@RequestMapping(value = "/dogs", produces = MediaType.APPLICATION_JSON_VALUE)
public class DogController {

    @ApiOperation(value = "Позвать собаку по имени")
    @GetMapping("/{name}")
    public DogDto get(@ApiParam(value = "Имя собаки") @PathVariable("name") String name) {
        return DogDto.builder()
                .name(name)
                .breed("Лайка")
                .build();
    }

    @ApiOperation(value = "Позвать всех собак")
    @GetMapping
    public List<DogDto> getAll() {
        return Collections.singletonList(DogDto.builder()
                .name("Шарик")
                .breed("Пекинес")
                .build());
    }

    @ApiOperation(value = "Принести новую собаку")
    @PostMapping
    public void create(@RequestBody DogDto dogDto) {

    }

}

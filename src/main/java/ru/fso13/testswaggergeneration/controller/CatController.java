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
import ru.fso13.testswaggergeneration.dto.CatDto;

import java.util.Collections;
import java.util.List;

@Api(tags = {"API кошек"})
@RestController
@RequestMapping(value = "/cats", produces = MediaType.APPLICATION_JSON_VALUE)
public class CatController {

    @ApiOperation(value = "Позвать кошку по имени")
    @GetMapping("/{name}")
    public CatDto get(@ApiParam(value = "Имя кошки") @PathVariable("name") String name) {
        return CatDto.builder()
                .name(name)
                .breed("Персидская")
                .build();
    }

    @ApiOperation(value = "Позвать всех кошек")
    @GetMapping
    public List<CatDto> getAll() {
        return Collections.singletonList(CatDto.builder()
                .name("Муся")
                .breed("Персидская")
                .build());
    }

    @ApiOperation(value = "Принести новую кошку")
    @PostMapping
    public void create(@RequestBody CatDto catDto) {

    }

}

package ru.fso13.testswaggergeneration.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ApiModel(description = "Данные о кошке")
public class CatDto {
    @ApiModelProperty(notes = "Имя", example = "Буська")
    private String name;
    @ApiModelProperty(notes = "Порода", example = "Сибирская")
    private String breed;
}

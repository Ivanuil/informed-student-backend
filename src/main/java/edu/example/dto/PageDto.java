package edu.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PageDto {
    /**
     * Текущая страница
     */
    @NotNull
    @Min(value = 0, message = "'pageNumber' должно быть больше или равно 0")
    @Schema(description = "Current page number")
    protected Integer pageNumber = 0;

    /**
     * Максимальное кол-во элементов на странице
     */
    @NotNull
    @Min(value = 1, message = "'pageSize' должно быть больше или равно 1")
    @Max(value = 500, message = "'pageSize' должно быть меньше или равно 5000")
    @Schema(description = "Page max size")
    protected Integer pageSize = 50;
}

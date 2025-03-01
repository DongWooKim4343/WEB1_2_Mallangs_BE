package com.mallangs.domain.pet.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@NoArgsConstructor
public class PageRequest {

    @Min(1)
    private int page = 1;

    @Min(10)
    @Max(100)
    private int size = 20;

    public Pageable getPageable(Sort sort) {
        return org.springframework.data.domain.PageRequest.of(page - 1, size, sort);
    }
}

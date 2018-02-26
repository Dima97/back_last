package com.craut.project.craut.service.dto;

import com.craut.project.craut.model.UserEntity;
import lombok.*;
import java.util.ArrayList;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InstructionAndTagsRequestDto implements Dto {
    private ArrayList<Object> tags;
    private ArrayList<Object> steps;
    private SectionDto section;
    private Integer userId;
    private Integer rating;
    private String title;
    private Long id;
}
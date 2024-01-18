package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Gender;
import com.example.java_thirdtermproject_pjatk.dtos.GenderDto;
import org.springframework.stereotype.Component;
import com.example.java_thirdtermproject_pjatk.resource.CreateGender;

@Component
public class GenderMapper {

    public GenderDto toDto(Gender gender){
        return new GenderDto(
                gender.getMalId(),
                gender.getType(),
                gender.getName(),
                gender.getUrl());
    }

    public Gender toEntity(CreateGender createGender){
        return new Gender(
                createGender.getMalId(),
                createGender.getName(),
                createGender.getType(),
                createGender.getUrl());
    }
}

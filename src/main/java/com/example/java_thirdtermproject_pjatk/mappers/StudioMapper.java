package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Studio;
import com.example.java_thirdtermproject_pjatk.dtos.StudioDto;
import org.springframework.stereotype.Component;
import com.example.java_thirdtermproject_pjatk.resource.CreateStudio;

@Component
public class StudioMapper {
    public StudioDto toDto(Studio studio){
        return new StudioDto(
                studio.getMalId(),
                studio.getType(),
                studio.getName(),
                studio.getUrl());
    }

    public Studio toEntity(CreateStudio createStudio){
        return new Studio(
                createStudio.getMalId(),
                createStudio.getName(),
                createStudio.getType(),
                createStudio.getUrl()
        );
    }
}

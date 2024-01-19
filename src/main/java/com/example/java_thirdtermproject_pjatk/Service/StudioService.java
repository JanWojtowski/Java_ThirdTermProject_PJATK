package com.example.java_thirdtermproject_pjatk.Service;

import com.example.java_thirdtermproject_pjatk.dtos.StudioDto;
import com.example.java_thirdtermproject_pjatk.exception.StudioNotFoundException;
import com.example.java_thirdtermproject_pjatk.mappers.StudioMapper;
import com.example.java_thirdtermproject_pjatk.repository.StudioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudioService {

    private final StudioRepository studioRepository;
    private final StudioMapper studioMapper;

    public StudioDto getStudioByName(String name){
        return studioRepository.findStudioByName(name).map(studioMapper::toDto)
                .orElseThrow(() -> new StudioNotFoundException("Studio with name " + name + " not found."));
    }

    public StudioDto getGenreByType(String type){
        return studioRepository.findStudioByType(type).map(studioMapper::toDto)
                .orElseThrow(() -> new StudioNotFoundException("Studio with type " + type + " not found."));
    }

    public List<StudioDto> getGenresByMalId(Integer malId){
        return studioRepository.findStudiosByMalId(malId).stream().map(studioMapper::toDto).toList();
    }
}

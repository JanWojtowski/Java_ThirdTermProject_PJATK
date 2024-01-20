package com.example.java_thirdtermproject_pjatk.mappers;

public interface IMapEntities<TDto, TEntity> {
    TEntity map(TDto dto);
    TEntity map(TDto dto, TEntity entity);
}

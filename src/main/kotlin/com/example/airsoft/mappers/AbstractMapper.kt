package com.example.gestao.mappers

abstract class AbstractMapper<E: Any, D: Any> {
    abstract fun toDto(entity: E): D
    abstract fun toEntity(dto: D): E
    fun toDtoList(entityList: List<E?>): List<D> = entityList.filterNotNull().map { toDto(it) }
    fun toEntityList(dtoList: List<D?>): List<E> = dtoList.filterNotNull().map { toEntity(it) }
}
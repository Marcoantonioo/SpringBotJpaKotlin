package com.example.gestao.mappers.centralAtendimento

import com.example.gestao.dtos.centralAtendimento.UserDTO
import com.example.gestao.entities.User
import com.example.gestao.mappers.AbstractMapper
import org.springframework.stereotype.Component

@Component
class UsuarioMapper(
) : AbstractMapper<User, UserDTO>() {
    override fun toDto(entity: User): UserDTO {
        return UserDTO(
                id = entity.id,
                nickName = entity.nickName,
                firstName = entity.firstName,
                lastName = entity.lastName,
                email = entity.email
                )
    }

    override fun toEntity(dto: UserDTO): User {
        return User(
                id = dto.id,
                nickName = dto.nickName,
                firstName = dto.firstName,
                lastName = dto.lastName,
                email = dto.email,
                password = null
        )
    }
}
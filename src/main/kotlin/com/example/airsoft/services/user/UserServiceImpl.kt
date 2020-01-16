package com.example.gestao.services.user

import com.example.gestao.dtos.centralAtendimento.UserDTO
import com.example.gestao.mappers.centralAtendimento.UsuarioMapper
import com.example.gestao.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
        @Autowired private val repository: UserRepository,
        @Autowired private val mapper: UsuarioMapper
) : UserService {
    override fun findAll(): List<UserDTO> {
        return mapper.toDtoList(repository.findAll())
    }


}
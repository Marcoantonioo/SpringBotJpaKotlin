package com.example.gestao.services.user

import com.example.gestao.dtos.centralAtendimento.UserDTO
import org.springframework.stereotype.Service

interface UserService {
    fun findAll(): List<UserDTO>
}
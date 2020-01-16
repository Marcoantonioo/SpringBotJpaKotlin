package com.example.gestao.controller

import com.example.gestao.dtos.centralAtendimento.UserDTO
import com.example.gestao.response.Response
import com.example.gestao.services.user.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
        @Autowired private val service: UserService
) {
    @GetMapping
    fun findAll(): Response<List<UserDTO>> =
            Response(params = service.findAll())


}
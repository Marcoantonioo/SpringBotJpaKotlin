package com.example.gestao.repositories

import com.example.gestao.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository : JpaRepository<User, Int> {
    @Query(value = "SELECT DISTINCT u " +
            "FROM User u ")
    override fun findAll(): List<User>


}
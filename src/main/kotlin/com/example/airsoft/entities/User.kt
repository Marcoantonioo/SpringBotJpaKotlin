package com.example.gestao.entities

import org.hibernate.annotations.IndexColumn
import javax.persistence.*

@Entity
@Table(name = "users")
class User (
        @Id
        @GeneratedValue
        val id: Int,
        val firstName: String,
        val lastName: String,
        val nickName: String,
        val email: String,
        val password: String?
)
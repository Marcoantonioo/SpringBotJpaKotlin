package com.example.gestao.response

import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
class Response<T> {
    var status: String? = null
    var params: T? = null
    var message: String? = null

    constructor(params: T?) {
        this.params = params
        if(params != null) {
            this.status = Status.SUCCESS.getStatus()
        } else {
            this.status = Status.FAILURE.getStatus()
            this.message = Message.NOT_FOUND.getMessage()
        }
    }

    constructor() {}
}

enum class Status(private val message: String) {

    SUCCESS("success"),
    FAILURE("failure");

    fun getStatus(): String {
        return message
    }
}

enum class Message(private val message: String) {

    NOT_FOUND("not found");

    fun getMessage(): String {
        return message
    }
}
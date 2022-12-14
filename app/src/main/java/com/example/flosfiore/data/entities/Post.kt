package com.example.flosfiore.data.entities

import java.io.Serializable
import java.sql.Time

data class Post(
    var img: Int?,
    var title: String = "",
    var content: String?,
    var writer: String = "",
    var time : Long?,
    var like: Int = 0,
    var comment : Int = 0
): Serializable

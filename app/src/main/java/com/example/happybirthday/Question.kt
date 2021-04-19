package com.example.happybirthday

data class Question (
        val id: Int,
        val question: String,
        val optionOne: String,
        val optionTwo: String,
        val optionThree: String,
        val optionFour: String,
        val correctAnswer40: Int,
        val correctAnswer30: Int,
        val correctAnswer20: Int,
        val correctAnswer10: Int
)

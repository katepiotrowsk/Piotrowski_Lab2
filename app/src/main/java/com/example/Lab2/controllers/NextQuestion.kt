package com.example.Lab2.controllers

import com.example.Lab2.model.AllQuestions

class NextQuestion {

    private val allQuestion: AllQuestions = AllQuestions()

    private var question: Int = 0
    private val total_qs: Int = allQuestion.allQuestions.size

    public fun getIndex (): Int {
           return (question) % total_qs
    }

    public fun linearNextQuestion(): Int {
        question = (question + 1) % total_qs
        return allQuestion.allQuestions[question].index
    }

    public fun pseudoRandomNextQuestion(): Int {
        question = (question + 1) % total_qs
        return allQuestion.allQuestions[question].index
    }

}
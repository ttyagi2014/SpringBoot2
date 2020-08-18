package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.questions.Question;

public interface QuestionRepository extends CrudRepository<Question,Integer> {

}

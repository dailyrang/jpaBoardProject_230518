package com.dailyrang.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailyrang.board.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}

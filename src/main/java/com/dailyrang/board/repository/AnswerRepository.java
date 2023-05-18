package com.dailyrang.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailyrang.board.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}

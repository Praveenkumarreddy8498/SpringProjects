package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Question;

@Repository
public interface IQuizRepository extends JpaRepository<Question, Integer> {

	List<Question> findByTopic(String topic);
	

}

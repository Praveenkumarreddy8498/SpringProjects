package com.quiz.service;

import java.util.List;

import com.quiz.model.Question;

public interface IQuizService {

	void addQuestion(Question question);

	void updateQuestion(Question question);

	void deleteQuestion(Integer questionId);

	Question getById(Integer questionId);

	List<Question> getAll();

	List<Question> getByTopic(String topic);

}

package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Question;
import com.quiz.repository.IQuizRepository;

@Service
public class QuizServiceImpl implements IQuizService {
	private IQuizRepository quizRepository;

	@Autowired
	public void setQuizrepository(IQuizRepository quizrepository) {
		this.quizRepository = quizrepository;
	}

	@Override
	public void addQuestion(Question question) {
		quizRepository.save(question);
	}

	@Override
	public void updateQuestion(Question question) {
		quizRepository.save(question);

	}

	@Override
	public void deleteQuestion(Integer questionId) {
		quizRepository.deleteById(questionId);

	}

	@Override
	public Question getById(Integer questionId) {

		return quizRepository.findById(questionId).get();

	}

	@Override
	public List<Question> getAll() {
		return quizRepository.findAll();
	}

	@Override
	public List<Question> getByTopic(String topic) {
		return quizRepository.findByTopic(topic);
	}

}

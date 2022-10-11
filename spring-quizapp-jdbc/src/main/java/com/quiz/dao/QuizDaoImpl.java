package com.quiz.dao;

import java.sql.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quiz.model.*;
import com.quiz.util.Queries;
import com.quiz.util.QuestionMapper;

@Repository
public class QuizDaoImpl implements IQuizDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * This method adds the question into database
	 * 
	 * @param question
	 * 
	 */
	@Override
	public void addQuestion(Question question) {
		Object[] answerArray = { question.getAnswer().getAnswerId(), question.getAnswer().getAnswerValue() };
		jdbcTemplate.update(Queries.INSERTANSWERQUERY, answerArray);
		Object[] questionArray = { question.getQuestionId(), question.getTopic(), question.getQuestion(),
				question.getOptionOne(), question.getOptionTwo(), question.getOptionThree(), question.getOptionFour(),
				question.getAnswer().getAnswerId(),question.getAnswer().getAnswerValue() };

		jdbcTemplate.update(Queries.INSERTQUESTIONQUERY, questionArray);

	}

	@Override
	public int updateQuestion(int questionId, String answerValue) {
		return jdbcTemplate.update(Queries.UPDATEANSWERQUERY, answerValue,questionId);
	}

	@Override
	public int deleteQuestion(int questionId) {
		return jdbcTemplate.update(Queries.DELETEBYQUESTIONID, questionId);
	}

	@Override
	public Question findById(int questionId) {
		RowMapper<Question> questionMapper = new QuestionMapper();
	
		return jdbcTemplate.queryForObject(Queries.FINDQUESTIONBYID, questionMapper, questionId);
	}

	@Override
	public List<Question> findByTopic(String topic) {
		return jdbcTemplate.query(Queries.FINDBYTOPICQUERY, new QuestionMapper(),topic);
		
	}

	@Override
	public List<Question> findAllQuestions() {
		return jdbcTemplate.query(Queries.FINDALLQUESTIONS, new QuestionMapper());
	}

}

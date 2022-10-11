package com.quiz.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import com.quiz.model.Answer;
import com.quiz.model.Question;

public class QuestionMapper implements RowMapper<Question> {

	@Override
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		Question question = new Question();
		Answer answer = new Answer();
		question.setQuestionId(rs.getInt(1));
		question.setTopic(rs.getString(2));
		question.setQuestion(rs.getString(3));
		question.setOptionOne(rs.getString(4));
		question.setOptionTwo(rs.getString(5));
		question.setOptionThree(rs.getString(6));
		question.setOptionFour(rs.getString(7));
		answer.setAnswerId(rs.getInt(8));
		answer.setAnswerValue(rs.getString(9));
		question.setAnswer(answer);

		return question;

	}

}

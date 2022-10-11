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
		question.setQuestionId(rs.getInt("questionId"));
		question.setTopic(rs.getString("topic"));
		question.setQuestion(rs.getString("question"));
		question.setOptionOne(rs.getString("optionOne"));
		question.setOptionTwo(rs.getString("optionTwo"));
		question.setOptionThree(rs.getString("optionThree"));
		question.setOptionFour(rs.getString("optionFour"));
		answer.setAnswerId(rs.getInt("answerId"));
		answer.setAnswerValue(rs.getString("answervalue"));
		question.setAnswer(answer);

		return question;

	}

}

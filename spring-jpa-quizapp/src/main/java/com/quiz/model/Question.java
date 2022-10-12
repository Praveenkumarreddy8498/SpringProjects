package com.quiz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author PraveenKumarReddy
 *
 */
@Entity
public class Question {
	@Id
	private Integer questionId;
	private String topic;
	private String question;
	private String optionOne;
	private String optionTwo;
	private String optionThree;
	private String optionFour;
	private String answer;

	public Question() {
		super();
	}

	public Question(Integer questionId, String topic, String question, String optionOne, String optionTwo,
			String optionThree, String optionFour, String answerValue) {
		super();
		this.questionId = questionId;
		this.topic = topic;
		this.question = question;
		this.optionOne = optionOne;
		this.optionTwo = optionTwo;
		this.optionThree = optionThree;
		this.optionFour = optionFour;
		this.answer = answerValue;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionOne() {
		return optionOne;
	}

	public void setOptionOne(String optionOne) {
		this.optionOne = optionOne;
	}

	public String getOptionTwo() {
		return optionTwo;
	}

	public void setOptionTwo(String optionTwo) {
		this.optionTwo = optionTwo;
	}

	public String getOptionThree() {
		return optionThree;
	}

	public void setOptionThree(String optionThree) {
		this.optionThree = optionThree;
	}

	public String getOptionFour() {
		return optionFour;
	}

	public void setOptionFour(String optionFour) {
		this.optionFour = optionFour;
	}

	public String getAnswerValue() {
		return answer;
	}

	public void setAnswerValue(String answerValue) {
		this.answer = answerValue;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", topic=" + topic + ", question=" + question + ", optionOne="
				+ optionOne + ", optionTwo=" + optionTwo + ", optionThree=" + optionThree + ", optionFour=" + optionFour
				+ ", answerValue=" + answer + "]";
	}

}
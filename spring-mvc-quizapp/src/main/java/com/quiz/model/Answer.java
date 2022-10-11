package com.quiz.model;

public class Answer {
	private Integer answerId;
	private String answerValue;

	public Answer() {
		super();
	}

	public Answer(Integer answerId, String answerValue) {
		super();
		this.answerId = answerId;
		this.answerValue = answerValue;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getAnswerValue() {
		return answerValue;
	}

	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answerValue + "]";
	}

}

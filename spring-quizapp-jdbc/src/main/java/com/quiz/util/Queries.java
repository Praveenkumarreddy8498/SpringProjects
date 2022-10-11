package com.quiz.util;

public class Queries {
	// for Question and Answers
	public static final String INSERTQUESTIONQUERY = "insert into question(questionId,topic,question,optionOne,optionTwo,optionThree,optionFour,answerId) values(?,?,?,?,?,?,?,?)";
	public static final String INSERTANSWERQUERY = "insert into answer values(?,?)";
	public static final String FINDBYTOPICQUERY = "select q.questionId,q.question,q.optionOne,q.optionTwo,q.optionThree,q.optionFour,a.answerId,a.answerValue from question q inner join answer a on q.answerId=a.answerId where q.topic=?";
	public static final String DELETEBYQUESTIONID = "delete q,a from question q inner join answer a on q.answerId=a.answerId where questionId =?";
	public static final String UPDATEANSWERQUERY = "update answer a  inner join question q on q.answerId=a.answerId set a.answerValue=? where q.questionId =?";
	public static final String FINDQUESTIONBYID = "select q.questionId,q.topic,q.question,q.optionOne,q.optionTwo,q.optionThree,q.optionFour,a.answerId,a.answerValue from question q inner join answer a on q.answerId=a.answerId where q.questionId=? ";
	public static final String FINDALLQUESTIONS = "select q.questionId,q.topic,q.question,q.optionOne,q.optionTwo,q.optionThree,q.optionFour,a.answerId,a.answerValue from question q inner join answer a on q.answerId=a.answerId";

}

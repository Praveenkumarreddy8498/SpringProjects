package com.quiz.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.quiz.model.Answer;
import com.quiz.model.Question;
import com.quiz.service.IQuizService;

@Controller
public class QuizController {
	private IQuizService quizService;

	public QuizController(IQuizService quizService) {
		super();
		this.quizService = quizService;
	}

	@RequestMapping("/")
	public String getAll(Model model) {
		/*
		 * List<Question> questions = quizService.getAllQuestions();
		 * model.addAttribute("questions", questions);
		 */
		return "home";

	}

	/*
	 * @RequestMapping("add-question")
	 * 
	 * public String addQuestion(Question question) {
	 * quizService.addQuestion(question); System.out.println(question); return
	 * "success";
	 * 
	 * }
	 */

	@RequestMapping("search-topic")
	public String getByTopic(@RequestParam("topic") String topic, Model model) {
		List<Question> questions = quizService.getByTopic(topic);
		model.addAttribute("questionsBySearch", questions);
		return "success";
	}

	@RequestMapping("add-question")
	public String addQuestion(@RequestParam("questionId") Integer questionId, @RequestParam("topic") String topic,
			@RequestParam("question") String question,

			@RequestParam("optionOne") String optionOne, @RequestParam("optionTwo") String optionTwo,
			@RequestParam("optionThree") String optionThree, @RequestParam("optionFour") String optionFour,

			@RequestParam("answerId") Integer answerid, @RequestParam("answerValue") String answerValue, Model model) {

		Answer answer = new Answer();
		answer.setAnswerId(answerid);
		answer.setAnswerValue(answerValue);
		Question questionObj = new Question();
		questionObj.setQuestionId(questionId);
		questionObj.setQuestion(question);
		questionObj.setTopic(topic);
		questionObj.setOptionOne(optionOne);
		questionObj.setOptionTwo(optionTwo);
		questionObj.setOptionThree(optionThree);
		questionObj.setOptionFour(optionFour);
		questionObj.setAnswer(answer);
		quizService.addQuestion(questionObj);
		System.out.println(questionObj);
		model.addAttribute("question", questionObj);

		return "success";

	}

}

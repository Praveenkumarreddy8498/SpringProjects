package com.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.model.Question;
import com.quiz.model.Topic;
import com.quiz.service.IQuizService;

@SpringBootApplication
public class SpringJpaQuizappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQuizappApplication.class, args);
	}
	private IQuizService quizService;
	
	@Autowired
	public void setQuizService(IQuizService quizService) {
		this.quizService = quizService;
	}

	@Override
	public void run(String... args) throws Exception {
		Question question=new Question(1, Topic.GK.topic, "What is the capital of Australia", "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
		quizService.addQuestion(question);
		Question questionOne=new Question(2, Topic.HTML.topic, "What is the smallest header in HTML by default?", "h1", "h2", "h6", "h4", "h6");
		quizService.addQuestion(questionOne);
		Question questionTwo=new Question(3, Topic.JAVA.topic, "Who Invented Java?", "Dennis Ritchie", "James Gosling", "Paul Walker", "Alex Robert", "Dennis Ritchie");
		quizService.addQuestion(questionTwo);

		/*
		 * Question questionOne=new Question(1, Topic.GK.topic,
		 * "What is the capital of Australia", "Sydney", "Melbourne", "Canberra",
		 * "Hobart", "Canberra"); quizService.updateQuestion(questionOne);
		 */
		System.out.println(quizService.getById(1));
		quizService.getAll().forEach(System.out::println);
		quizService.getByTopic(Topic.HTML.topic).forEach(System.out::println);
		
		
	}

}

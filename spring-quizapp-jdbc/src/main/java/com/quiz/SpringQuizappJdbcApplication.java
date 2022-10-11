package com.quiz;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.model.Answer;
import com.quiz.model.Question;
import com.quiz.model.Topic;
import com.quiz.service.IQuizService;

@SpringBootApplication
public class SpringQuizappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuizappJdbcApplication.class, args);
	}

	IQuizService quizservice;

	public SpringQuizappJdbcApplication(IQuizService quizservice) {
		super();
		this.quizservice = quizservice;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter Your Choice\n" + "1.Add Question\n" + "2.Delete Question\n" + "3.Update Question\n"
				+ "4.Get Question By id\n" + "5.Get Questions By Topic\n" + "6.Get all Questions");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			Answer answer = new Answer(16, "New Delhi");
			Question question = new Question(16, Topic.GK.topic, "what is the Capital of India", "Mumbai", "New Delhi",
					"Chennai", "Hyderabad", answer);
			quizservice.addQuestion(question);
			break;
		case 2: {
			System.out.println("Enter question id");
			int questionId = sc.nextInt();
			quizservice.deleteQuestion(questionId);
			break;
		}
		case 3: {
			System.out.println("Enter question id");
			int questionId = sc.nextInt();
			System.out.println("Enter Answer value");
			String answerValue = sc.nextLine();
			quizservice.updateQuestion(questionId, answerValue);
			break;
		}
		case 4:
			System.out.println("Enter question id");
			int questionId = sc.nextInt();
			System.out.println(quizservice.getQuestionById(questionId));
			break;
		case 5:
			System.out.println("Enter Topic\n" + "0.JAVA\n" + "1.HTML\n" + "2.General Knowledge\n");
			int choose = sc.nextInt();
			sc.nextLine();
			String topic = Topic.values()[choose].topic;
			quizservice.getByTopic(topic).forEach(System.out::println);
			break;
		case 6:
			quizservice.getAllQuestions().forEach(System.out::println);
			break;

		default:
			break;
		}

	}

}

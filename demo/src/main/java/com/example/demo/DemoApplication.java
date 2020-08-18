package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.BusinnessLogic;
import com.example.demo.questions.Question;
import com.example.demo.questions.ans.Answer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		Question q1=ctx.getBean("quest", Question.class);
		q1.setQuestionName("what is java");
		List<Answer> alist1=q1.getAnswer();
		Answer a1=alist1.get(0);
		
		Answer a2=ctx.getBean("answ",Answer.class);
		a1.setAnswerName("JAVA IS A PROGRAMMING LANGUAGE");
		a1.setPostedBy("tanuj");
		a2.setAnswerName("JAVA IS A PLATFORM");
		a2.setPostedBy("tanuj");
		
		Question q2=ctx.getBean("quest", Question.class);
		q2.setQuestionName("HIBERNATE FEATURES");
		List<Answer> alist2=q2.getAnswer();
		Answer a3=ctx.getBean("answ",Answer.class);
		Answer a4=ctx.getBean("answ",Answer.class);
		Answer a5=ctx.getBean("answ",Answer.class);
		a3.setAnswerName("ORM");
		a4.setAnswerName("CACHE MEMORY");
		a5.setAnswerName("AUTO DDL");
		
		
		if(alist1!=null & alist2!=null) {
		alist1.add(a1);
		alist1.add(a2);
		alist2.add(a3);
		alist2.add(a4);
		alist2.add(a5);
	    q1.setAnswer(alist1);
	    q2.setAnswer(alist2);
	     
		
		BusinnessLogic bl=ctx.getBean("businnessLogic",BusinnessLogic.class);
		
		bl.insert(q1);
		bl.insert(q2);
		}
		
		
	}

}

package com.example.demo.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.questions.Question;

@Component
public class BusinnessLogic {
	@Autowired
	private QuestionRepository qr;
	
	public void insert(Question q1) {
		
		
		qr.save(q1);
		
		
		
		
	}

}

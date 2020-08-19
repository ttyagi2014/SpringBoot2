package com.example.demo.dao;



import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.questions.Question;
import com.example.demo.questions.ans.Answer;

@Component
public class BusinnessLogic {
	@Autowired
	private QuestionRepository qr;
	
	public void insert(Question q1) {
		
		
		qr.save(q1);
		
		
		
		
	}
	
public void find() {
		
		
	Iterable<Question> it=	qr.findAll();
		Iterator<Question> itr=it.iterator();
		while(itr.hasNext()) {
			int i=0;
			i++;
			Question q=itr.next();
			List<Answer> alist=q.getAnswer();
			System.out.println(i+"."+"ID:"+q.getId()+"question name:"+q.getQuestionName());
			System.out.println("LIST"+alist);
			for(Answer ans:alist) {
				System.out.println("ID:"+ans.getId()+"Answer NAme:"+ans.getAnswerName()+"Posted By:"+ans.getPostedBy());
			}
			
		}
		
		
		
	}

}

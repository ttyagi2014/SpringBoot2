package com.example.demo.questions.ans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name="answer")
@Component(value="answ")
@Scope(value="prototype")

public class Answer {
	
	@Id
	@Column(name="answerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable=true)
	private String answerName;
	

	private String postedBy;
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	public Answer() {
		System.out.println("answer created"+this);
	}
	

}

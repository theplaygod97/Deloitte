package com;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Email implements Serializable{
	@Autowired
	private To to;
	@Autowired
	private From from;
	@Autowired
	private Subject subject;
	@Autowired
	private Body body;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}
	public Email(To to, From from, Subject subject, Body body) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	public To getTo() {
		return to;
	}
	public void setTo(To to) {
		this.to = to;
	}
	public From getFrom() {
		return from;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Email \n[" + to + "\n" + from + "\n" + subject + "\n" + body + "]";
	}
	
	
	
}
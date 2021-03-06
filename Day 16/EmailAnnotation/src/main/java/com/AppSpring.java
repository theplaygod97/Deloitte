package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;

public class AppSpring {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Email email = context.getBean(Email.class);

		To to = context.getBean(To.class);
		to.setToEmail("@deloitte.com");
		to.setToName("Deloitte HR");

		From from = context.getBean(From.class);
		from.setFromName("Satya");
		from.setFromEmail("@gmail.com");

		Subject subject = context.getBean(Subject.class);
		subject.setCaption("Leave Application");

		Body body = context.getBean(Body.class);
		body.setMessage("Need leave from March 2 to March 6");

		System.out.println(email);
	}
}
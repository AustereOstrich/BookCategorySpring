package com.matthewharrop.part1assignment1;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Part1assignment1Application {

	public void displayCategory(Category category) {

	}

//	private static Logger logger = LoggerFactory.getLogger(
//			Part1assignment1Application.class);

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("appContext.xml");
		context.refresh();

		Category category1 = (Category) context.getBean("category1");
		Category category2 = (Category) context.getBean("category2");
		Category category3 = (Category) context.getBean("category3");

		System.out.println("Context loaded.");

//		System.out.println(category1.toString(category1.getbookList(), "Books List"));
//		System.out.println(category2.toString(category2.getBookSet(), "Books Set"));
//		System.out.println(category3.toString(category3.getBookMap(), "Books Map"));

		System.out.println(category1.toString());
		System.out.println(category2.toString());
		System.out.println(category3.toString());

	}

}

package com.techlab.test;

import java.io.File;
import java.io.FileWriter;

import com.techlab.model.*;

public class DomTest 
{

	public static void main(String[] args) throws Exception 
	{
		// Tags creation

		HtmlTag html = new HtmlTag();
		HeadTag head = new HeadTag();
		ParagraphTag paragraph = new ParagraphTag("This is paragraph.");
		BodyTag body = new BodyTag();
		DivTag div = new DivTag();
		FormTag form = new FormTag();
		InputTag inputText = new InputTag(new InputTypeText());
		InputTag inputEmail = new InputTag(new InputTypeEmail());
		InputTag inpInutPassword = new InputTag(new InputTypePassword());
		InputTag inputButton = new InputTag(new InputTypeButton());
		
		// adding children elements to their parent elements
		
		form.addChildrenTag(inputText);
		form.addChildrenTag(inputEmail);
		form.addChildrenTag(inpInutPassword);
		form.addChildrenTag(inputButton);
		div.addChildrenTag(form);
		body.addChildrenTag(paragraph);
		body.addChildrenTag(div);
		html.addChildrenTag(head);
		html.addChildrenTag(body);
		
		// produce HTML file
		File htmlFile = new File("index.html");
		FileWriter fw = new FileWriter(htmlFile);
		html.render(fw);
	}

}

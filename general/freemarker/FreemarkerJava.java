package com.smartwcm.poc.freemarker;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
* Sample Maven Java application which shows the usage of freemarker 

* template stored in java String variable to generate final text output applying the data model.
*
*/
public class FreemarkerTemplateInJavaString 
{
	public static void main(String[] args)
	{
		User user = new User ("Geo", "Thomas");
		Template template = null;
		try 
		{
			String templateStr = "Hello ${user.firstName}, this is the body of the email message. Message from ${company}";
			template = new Template("messageBody", new StringReader(templateStr), new Configuration());
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		Map rootMap = new HashMap();
		rootMap.put("user", user);
		rootMap.put("company", "www.sitepm");
		Writer out = new StringWriter();
		try
		{
			template.process(rootMap, out);
			System.out.println(out.toString());
		} 
		catch (TemplateException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
package test.dirmonitor;

import java.io.File;

import org.springframework.beans.DirectFieldAccessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlFileMonitor.xml");
		System.out.println("main...");
		
		File inDir = (File) new DirectFieldAccessor(context.getBean(FileReadingMessageSource.class)).getPropertyValue("directory");
		LiteralExpression expression = (LiteralExpression) new DirectFieldAccessor(context.getBean(FileWritingMessageHandler.class)).getPropertyValue("destinationDirectoryExpression");
		File outDir = new File(expression.getValue());
		System.out.println("Input directory is: " + inDir.getAbsolutePath());
		
//		XStream xstream = new XStream();
//		xstream.alias("row", Row.class);
//		Row row = (Row)xstream.fromXML("<row><ID>1</ID><Name>Kabul</Name><CountryCode>AFG</CountryCode><District>Kabol</District><Population>1780000</Population></row>");
//		System.out.println(row);
	}
}

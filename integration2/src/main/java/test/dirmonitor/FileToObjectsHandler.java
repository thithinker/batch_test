package test.dirmonitor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import com.thoughtworks.xstream.XStream;

public class FileToObjectsHandler {
	public List<Row> handler(File xmlFile) throws IOException{
		String content = FileUtils.readFileToString(xmlFile);
		String regex = "<row>.*?</row>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		XStream xstream = new XStream();
		xstream.alias("row", Row.class);
		List<Row> result = new ArrayList<Row>();
		while(matcher.find()){
			Row row = (Row)xstream.fromXML(matcher.group());
			result.add(row);
		}
		System.out.println("Find objects: " + result.size());
		return result;
	}
}

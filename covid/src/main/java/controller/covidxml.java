package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import vo.CovidVo;

public class covidxml {

	public static void main(String[] args) {
		String rate;
		CovidVo vo=new CovidVo();
		
		
		try {
			DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=builderfactory.newDocumentBuilder();
			//xml파일 url경로
			String url="http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=ow7b%2B%2FQpQVf5nEFUnodaFs1O8e9nrUDCHUXTazoPcesbYudku4fj%2B7s7SMWarXMdEwU9Inkelulxsx%2FCKB6j3Q%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20211129&endCreateDt=20211201";
				
			Document doc=builder.parse(url);
				Element root=doc.getDocumentElement();
				NodeList childs=doc.getElementsByTagName("item");
				doc.getDocumentElement().normalize();
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				
				System.out.println(childs.getLength());
				
		
				
				Node child=childs.item(0);
				Node childvalue=child.getFirstChild().getFirstChild();
				rate=childvalue.getNodeValue();
				vo.setUpdate();
				
				System.out.println("rate"+rate);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	
}

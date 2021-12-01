package controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class test {
	public static void main(String[] args){ 
	String url="http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=ow7b%2B%2FQpQVf5nEFUnodaFs1O8e9nrUDCHUXTazoPcesbYudku4fj%2B7s7SMWarXMdEwU9Inkelulxsx%2FCKB6j3Q%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20211129&endCreateDt=20211201";
	
	try {
			DocumentBuilderFactory bf=DocumentBuilderFactory.newInstance();
			DocumentBuilder b=bf.newDocumentBuilder();
			Document doc=b.parse(url);
			doc.getDocumentElement().normalize();
			System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
			NodeList list = doc.getElementsByTagName("item"); 
			System.out.println("list"+list.getLength());
			System.out.println("--------------------------------------");
			for(int i=0; i<list.getLength(); i++) {
				Node node=list.item(i);
				System.out.println("nodename :" + node.getNodeName());
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement=(Element) node;
                    System.out.println("업데이트 시간 : " + eElement.getElementsByTagName("updateDt").item(0).getTextContent());
                    System.out.println("확진자 수 : " + eElement.getElementsByTagName("decideCnt").item(0).getTextContent());
                    System.out.println("사망자 수 : " + eElement.getElementsByTagName("deathCnt").item(0).getTextContent());
                    
                    
				}
			}
	}catch(Exception e) {
		e.printStackTrace();
	}
    }
	
}	// class end
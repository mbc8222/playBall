package controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import vo.CovidVo;

@Controller
public class CovidController {

	@RequestMapping(value="covid.co", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView covid() {
		ModelAndView mv=new ModelAndView();
		CovidVo vo=new CovidVo();
		String rate;
		String rate2;
		//DOCUMENT객체
		try {
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		//xml파일 url경로
		String url="http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=ow7b%2B%2FQpQVf5nEFUnodaFs1O8e9nrUDCHUXTazoPcesbYudku4fj%2B7s7SMWarXMdEwU9Inkelulxsx%2FCKB6j3Q%3D%3D&pageNo=1&numOfRows=10&startCreateDt=20200310&endCreateDt=20200315";
			Document doc=builder.parse(url);
			Element root=doc.getDocumentElement();
			NodeList childs=doc.getElementsByTagName("item");
			Node child=childs.item(0);
			Node childvalue=child.getFirstChild().getFirstChild();
			rate=childvalue.getNodeValue();
			vo.setAcc_def_rate(rate);
			System.out.println(childvalue.getNodeValue());
			mv.addObject("covid", vo);
			mv.setViewName("Main");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
}

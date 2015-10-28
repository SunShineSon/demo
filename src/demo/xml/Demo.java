package demo.xml;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo {
	public static void main(String args[]) {
		Element element = null;
		File file = new File("E:/AndroidManifest.xml");
		DocumentBuilder db = null;
		DocumentBuilderFactory dbf = null;
		try {
			dbf = DocumentBuilderFactory.newInstance();
			db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			element = document.getDocumentElement();
			System.out.println("根元素：" + element.getNodeName());
			NodeList childNodes = element.getChildNodes();
			
			// 遍历这些子节点
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node node = childNodes.item(i);
				Object obj = node.getClass();
				
				/*if ("Account".equals(node.getNodeName())) {
					// 如果节点的名称为"Account"，则输出Account元素属性type
					System.out.println("找到一篇账号. 所属区域: "+ node.getAttributes().getNamedItem("type").getNodeValue() + ". ");
					// 获得<Accounts>下的节点
					NodeList nodeDetail = node.getChildNodes();
					// 遍历<Accounts>下的节点
					for (int j = 0; j < nodeDetail.getLength(); j++) {
						// 获得<Accounts>元素每一个节点
						Node detail = nodeDetail.item(j);
						if ("code".equals(detail.getNodeName())) // 输出code
							System.out.println("卡号: " + detail.getTextContent());
						else if ("pass".equals(detail.getNodeName())) // 输出pass
							System.out.println("密码: " + detail.getTextContent());
						else if ("name".equals(detail.getNodeName())) // 输出name
							System.out.println("姓名: " + detail.getTextContent());
						else if ("money".equals(detail.getNodeName())) // 输出money
							System.out.println("余额: " + detail.getTextContent());
					}
				}*/
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package asu.builder;

// Director
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class DocReader {

	private NodeConverter nodeconverter;
	private String fileName;

	public DocReader(NodeConverter nodeconverter, String fileName) {
		this.nodeconverter=nodeconverter;
		this.fileName=fileName;
	}

	public ArrayList<Project> build() {
		ArrayList<Project> projectArrayList = new ArrayList<>();
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			Document document = documentBuilder.parse(fileName);
			DOMNodes projectNodes = new DOMNodes(document.getElementsByTagName("project"));
			for (Node node : projectNodes) {
				nodeconverter.ReadProject(getNodeAttribute(node, "title"));
				nodeconverter.ReadEmail(getNodeAttribute(node,"tutormail"));
				nodeconverter.ReadSupervisor(getNodeAttribute(node, "tutorname"));
				nodeconverter.ReadDescription(node.getFirstChild().getNodeValue());
				nodeconverter.ReadDepartment(getNodeAttribute(node, "dept"));
				nodeconverter.ReadGroup(getNodeAttribute(node, "group"));
				projectArrayList.add(nodeconverter.printProject());
			}


			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projectArrayList;
	}

	private String getNodeAttribute(Node node, String attributeName) {
		return node.getAttributes().getNamedItem(attributeName).getNodeValue();
	}
	
}

package asu.configreader.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import asu.configreader.domain.ConfigRealization;
import asu.configreader.domain.Project;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
// Factory method - concrete product 2
public class XMLBuildConfigurationReader implements ConfigRealization {


	public XMLBuildConfigurationReader() {

	}

	private final class NodeIterator implements Iterator<Node> {
		private final NodeList childNodes;
		int i = 0;

		private NodeIterator(NodeList childNodes) {
			this.childNodes = childNodes;
		}

		@Override
		public boolean hasNext() {
			return i < childNodes.getLength();
		}

		@Override
		public Node next() {
			Node n = childNodes.item(i);
			i++;
			return n;
		}
	}

	private Element docElement;

	
	public XMLBuildConfigurationReader(String fileName) {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = f.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(fileName));
			docElement = doc.getDocumentElement();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	private String getAttributeValue(Element elt, String attributeName) {
		return elt.getAttributes().getNamedItem(attributeName).getNodeValue();
	}
	
	public Project getProject() {
		Project project = new Project();
		project.setName(getAttributeValue(docElement,"name"));
		project.setBasedir(getAttributeValue(docElement,"basedir"));
		return project;
	}
}

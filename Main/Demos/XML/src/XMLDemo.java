import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLDemo {
    public static void main(String[] args) {
        try {
            File input = new File("people.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList personList = doc.getElementsByTagName("person");
            for (int i = 0; i < personList.getLength(); i++) {
                Node node = personList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First Name: " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package lesson_15.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI;

public class DomXMLReader {
    public static String bookXmlPath = "books.xml";
    public static String bookXsdPath = "booksSchema.xsd";

    public static ArrayList<Book> parseXMLFile() {
        if (validateXMLSchema(bookXsdPath, bookXmlPath)) {
            File xmlFile = new File(bookXmlPath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            ArrayList<Book> bookList = new ArrayList<>();
            try {
                builder = factory.newDocumentBuilder();
                Document document = builder.parse(xmlFile);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("book");
                for (int i = 0; i < nodeList.getLength(); i++) {
                    bookList.add(getBook(nodeList.item(i)));
                }
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            return bookList;
        } else {
            System.out.println("XML файл не соответствует XSD cхеме");
            return null;
        }
    }

    private static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception occured: " + e.getMessage());
            return false;
        }
        return true;
    }

    private static Book getBook(Node node) {
        Book book = new Book();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            book.title = getTagValue("title", element);
            book.author = getTagValue("author", element);
            book.genre = getTagValue("genre", element);
            book.canBeReadAtHome = Boolean.parseBoolean(getTagValue("canBeReadAtHome", element));
        }
        return book;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}

package com.xsakon.xmlpractice;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DomParser {
    public static void main(String[] args) {

        try{
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            File file = new File("src\\main\\java\\com\\xsakon\\xmlpractice\\books.xml");
            Document document = dBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("book");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(nodeList.item(i));
                System.out.println(node.getNodeName());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

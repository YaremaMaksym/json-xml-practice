package com.xsakon.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser {
    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;

                @Override
                public void startElement(String uri,
                                         String localName,
                                         String qName,
                                         Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("name")){
                        name = true;
                    }
                }

                @Override
                public void characters(char[] ch,
                                       int start,
                                       int length) throws SAXException {
                    if (name) {
                        System.out.printf("Name: %s\n", new String(ch, start, length));
                        name = false;
                    }
                }
            };

            saxParser.parse("src/main/java/com/xsakon/xmlpractice/student.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
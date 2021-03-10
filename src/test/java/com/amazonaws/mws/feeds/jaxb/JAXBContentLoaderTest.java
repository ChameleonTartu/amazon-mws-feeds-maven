package com.amazonaws.mws.feeds.jaxb;

import com.amazonaws.mws.feeds.MarketplaceWebService;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBContentLoaderTest {

    @Test
    public void loadModels() {
            final JAXBContext jaxbContext;
            try {
                jaxbContext = JAXBContext.newInstance("com.amazonaws.mws.feeds.model", MarketplaceWebService.class.getClassLoader());
            } catch (JAXBException ex) {
                throw new ExceptionInInitializerError(ex);
            }
            ThreadLocal<Unmarshaller> unmarshaller = new ThreadLocal<Unmarshaller>() {
                protected synchronized Unmarshaller initialValue() {
                    try {
                        return jaxbContext.createUnmarshaller();
                    } catch (JAXBException e) {
                        throw new ExceptionInInitializerError(e);
                    }
                }
            };
    }
}

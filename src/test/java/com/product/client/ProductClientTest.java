package com.product.client;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ProductClientTest {

    private JAXBClient jaxbClient = new JAXBClient();
    private ProductInterface productInterface = jaxbClient.client;

    @Test
    public void productTest () {
        Product product = productInterface.getProduct();
        assertEquals (product.getProductName(), "Sony");
    }
}

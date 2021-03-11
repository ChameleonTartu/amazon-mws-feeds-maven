package com.amazonaws.mws.feeds;

import org.junit.Test;

public class MarketplaceWebServiceClientTest {

    @Test
    public void loadWebClientCorrectly() {
        String awsAccessKeyId = "";
        String awsSecretAccessKey = "";
        String applicationName = "";
        String applicationVersion = "";
        new MarketplaceWebServiceClient(awsAccessKeyId, awsSecretAccessKey, applicationName, applicationVersion);
    }

}
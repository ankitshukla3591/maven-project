package com.mulesoft.training;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

    @Rule
    public DynamicPort myPort = new DynamicPort("my.http.port");
	@Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
		System.out.println("\n\n Test Case #1 the value of Dynamic port is"+ myPort.getNumber() +"\n\n");
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}

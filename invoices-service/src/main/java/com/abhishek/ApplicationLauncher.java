package com.abhishek;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class ApplicationLauncher {

  public static void main(String[] args) throws LifecycleException {

    Tomcat tomcat = new Tomcat();
    tomcat.setPort(8080);

    //this is used to get a connector for HTTP1 calls and attaches it to the tomcat server.
    Connector connector = tomcat.getConnector();
    connector.setProperty("maxThreads", "200"); //Tells the number of concurrent requests my server can serve.

    Context ctx = tomcat.addContext("", null);
    Wrapper servlet = Tomcat.addServlet(ctx, "myFirstServlet", new MyFirstServlet());
    servlet.setLoadOnStartup(1);
    servlet.addMapping("/*");

    tomcat.start();

  }
}

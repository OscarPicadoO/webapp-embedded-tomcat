package io.github.benas;

import org.apache.catalina.startup.Tomcat;

public class Webapp {

    public static void main(String[] args) throws Exception {
        String contextPath = args[0];
        String appBase = args[1]; // absolute path to target/${project.artifactId}-${project.version}
        int port = Integer.parseInt(args[2]);

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();

        System.out.println("Waiting for requests on http://localhost:" + port);
        tomcat.getServer().await();
    }
}

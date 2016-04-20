This is a skeleton project to run a web.xml-free web application in an embedded Tomcat.

Ok, there is a wonderful thing called spring boot. But I do prefer boilerplate (that I understand and control) than magic (that I don't understand and don't control). no offense.

3 lines of vanilla bash:

```bash
$>git clone https://github.com/benas/webapp-embedded-tomcat.git
$>cd webapp-embedded-tomcat && mvn package && cd target
$>java -cp "classes:dependency/*" io.github.benas.Webapp `pwd`/webapp-embedded-tomcat-1.0.0-SNAPSHOT
```

and you should see:

```bash
Waiting for requests on http://localhost:8080/
```
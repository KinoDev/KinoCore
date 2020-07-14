package cn.kinomc.core.database;

import cn.kinomc.core.encrypt.*;

public enum DatabaseType {
    MYSQL("MySQL","https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.21/mysql-connector-java-8.0.21.jar"),
    SQLITE("SQLITE","https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.32.3/sqlite-jdbc-3.32.3.jar"),
    H2("H2","https://repo1.maven.org/maven2/com/h2database/h2/1.4.200/h2-1.4.200.jar");
    private final String name;
    private final String url;
    DatabaseType(String name,String url){
        this.name = name;
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public String getUrl(){
        return url;
    }
}

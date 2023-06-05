package com.pedantic.service;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@DataSourceDefinition(
       name = "java:app/jtaDataSource/MyDS", // See persistence.xml <jta-data-source>java:app/jtaDataSource/MyDS</jta-data-source>
       className = "com.mysql.cj.jdbc.MysqlDataSource",
              url = "jdbc:mysql://localhost:3306/YourDataBaseName?useSSL=false&allowPublicKeyRetrieval=true",
       user = "YourMysqlUser",
       password = "YourMysqlPassword")
@Stateless
public class PersistenceService {

    @Inject
    EntityManager entityManager;
}

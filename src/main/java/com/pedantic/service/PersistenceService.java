package com.pedantic.service;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@DataSourceDefinition(
       name = "java:app/PayrollJPA/MyDS",
       className = "com.mysql.cj.jdbc.MysqlDataSource",
       url = "jdbc:mysql://localhost:3306/payrolljpa?useSSL=false",
       user = "root",
       password = "pippo")
@Stateless
public class PersistenceService {

    @Inject
    EntityManager entityManager;
}

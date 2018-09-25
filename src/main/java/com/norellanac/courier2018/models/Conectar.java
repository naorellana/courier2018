
package com.norellanac.courier2018.models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conectar {
 
    public DriverManagerDataSource conectar()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@172.17.0.1:1521:XE"); //ip del bridge de docker ya que oracle corre en docker
        dataSource.setUsername("analisis2018");
        dataSource.setPassword("oracle");
        return dataSource;
        
    }
}

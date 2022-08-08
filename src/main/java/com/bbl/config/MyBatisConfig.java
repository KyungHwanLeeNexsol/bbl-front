package com.bbl.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
// 패키지명
@PropertySource("classpath:/application.properties")
public class MyBatisConfig {

  final ApplicationContext applicationContext;

  @Value("${mybatis.mapper-locations}")
  String mPath;

  public MyBatisConfig(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource.hikari")
  public HikariConfig HikariConfig() {
    return new HikariConfig();
  }

  @Bean
  public DataSource dataSource() {
    return new HikariDataSource(HikariConfig());
  }

  @Bean
  public SqlSessionFactory SqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setMapperLocations(applicationContext.getResources(mPath));
    bean.setTypeAliasesPackage("com.bbl.domain");
    return bean.getObject();
  }

  @Bean
  public SqlSessionTemplate SqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    return new SqlSessionTemplate(sqlSessionFactory);
  }



}

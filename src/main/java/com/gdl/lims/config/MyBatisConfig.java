package com.gdl.lims.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@MapperScan(basePackages = "com.gdl.lims.", sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext)
			throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		factory.setMapperLocations(applicationContext.getResources("classpath*:패키지경로/mapper/*.xml"));
		factory.setTypeAliasesPackage("alias VO 패키지 경로");
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		configuration.setMapUnderscoreToCamelCase(true);
		configuration.setJdbcTypeForNull(null);
		factory.setConfiguration(configuration);
		return factory.getObject();
	}
}

//@Configuration
//// 패키지명 
//@MapperScan(value = "com.gdl.lims", sqlSessionFactoryRef = "SqlSessionFactory")
//public class MyBatisConfig {
//
////	@Value("${mybatis.mapper-locations}")
//	@Value("${spring.datasource.mapper-locations}")
//	String mPath;
//
//	@Bean(name = "dataSource")
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource DataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name = "SqlSessionFactory")
//	public SqlSessionFactory SqlSessionFactory(@Qualifier("dataSource") DataSource DataSource,
//			ApplicationContext applicationContext) throws Exception {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(DataSource);
//		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(mPath));
//		return sqlSessionFactoryBean.getObject();
//	}
//
//	@Bean(name = "SessionTemplate")
//	public SqlSessionTemplate SqlSessionTemplate(
//			@Qualifier("SqlSessionFactory") SqlSessionFactory firstSqlSessionFactory) {
//		return new SqlSessionTemplate(firstSqlSessionFactory);
//	}
//
//}

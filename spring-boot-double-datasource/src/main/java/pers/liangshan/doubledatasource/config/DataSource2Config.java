package pers.liangshan.doubledatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "pers.liangshan.doubledatasource.dao.ds2", sqlSessionTemplateRef  = "ds2SqlSessionTemplate")
public class DataSource2Config extends DataSourceAutoConfiguration{
	
	@Bean(name = "ds2")
	@ConfigurationProperties(prefix = "spring.datasource.ds2")
	public DataSource dataSource(DataSourceProperties properties) {
		return DataSourceBuilder.create().build();
	}

    @Bean(name = "ds2SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("ds2") DataSource dataSource) throws Exception {
    	 SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
         bean.setDataSource(dataSource);
         bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/ds2/*.xml"));
         return bean.getObject();
    }

    @Bean(name = "ds2TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("ds2") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds2SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ds2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
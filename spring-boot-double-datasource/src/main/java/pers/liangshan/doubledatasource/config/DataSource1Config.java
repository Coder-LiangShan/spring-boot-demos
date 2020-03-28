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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
/**
 * 功能描述: 数据源1的配置类
 * 
 * @auther: LiangShan
 * @date: 2020/3/28 12:23
 */
@Configuration
@MapperScan(basePackages = "pers.liangshan.doubledatasource.dao.ds1", sqlSessionTemplateRef  = "ds1SqlSessionTemplate")
public class DataSource1Config extends DataSourceAutoConfiguration{
	
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource.ds1")
	@Primary
	public DataSource dataSource(DataSourceProperties properties) {
		return DataSourceBuilder.create().build();
	}

    @Bean(name = "ds1SqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/ds1/*.xml"));
        return bean.getObject();
        
    }

    @Bean(name = "ds1TransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ds1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
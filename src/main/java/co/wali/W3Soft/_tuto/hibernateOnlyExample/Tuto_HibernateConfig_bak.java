package co.wali.W3Soft._tuto.hibernateOnlyExample;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import javax.sql.DataSource;

@Configuration
public class Tuto_HibernateConfig_bak {
    @Autowired
    private DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("com.yourpackage.model");
        return sessionFactory;
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return sessionFactory().getObject();
    }
}

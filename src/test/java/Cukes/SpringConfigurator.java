package Cukes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by OzorakM on 14.2.2018.
 */

@Configuration
@ComponentScan(basePackages = "Cukes")
@PropertySource("classpath:configuration.properties")
public class SpringConfigurator {

    /*
    @Value("${cibs.server.connection_unix.host}")
    private String dbServerHost;

    @Value("${cibs.server.connection_unix.user}")
    private String dbServerUser;

    @Value("${cibs.server.connection_unix.password}")
    private String dbServerPassword;

    @Value("${cibs.server.connection_unix.driver}")
    private String dbDriver;
    */


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("configuration.properties"));
        return propertySourcesPlaceholderConfigurer;
    }

    /*
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbServerHost);
        dataSource.setUsername(dbServerUser);
        dataSource.setPassword(dbServerPassword);
        return dataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
    */
}

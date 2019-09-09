package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.ResourceBundle;

public class JdbcConfiguration {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${dbusername}")
    private String username;
    @Value("${password}")
    private String password;
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner() {
        return new QueryRunner();
    }

    @Bean(name = "datasoruce")
    @Scope(value = "prototype")
    public DataSource createQueryDataSource() {
        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(username);
            ds.setPassword(password);
            return ds;
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.ResourceBundle;

/**
 * 该类是一个配置类，他的作用像当与bean.xml
 *  <bean id="propertyConfigure" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
 *         <property name="locations">
 *             <list>
 *                 <value>/jdbc.properties</value>
 *             </list>
 *         </property>
 *     </bean>
 *     <bean id = "runner" class="org.apache.commons.dbutils.QueryRunner" scope="prototype">
 *         <constructor-arg name="ds" ref="dataSource"></constructor-arg>
 *     </bean>
 *     <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
 *          <property name="driverClass" value="${driver}"></property>
 *          <property name="jdbcUrl" value="${url}"></property>
 *          <property name="user" value="${username}"></property>
 *          <property name="password" value="${password}"></property>
 *     </bean>
 */
@Configuration
@Import(JdbcConfiguration.class)
@ComponentScan(basePackages = {"com.wwt","config","utils"})
@PropertySource("jdbc.properties")
public class SpringConfiguration {

}

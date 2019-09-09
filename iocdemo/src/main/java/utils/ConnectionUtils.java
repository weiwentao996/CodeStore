package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接的工具类，它用于从数据源中获取一个链接，并且实现和 线程的绑定
 */

@Component
public class ConnectionUtils {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection() {
        Connection conn = tl.get();

        try {
            if (conn == null) {
                conn = dataSource.getConnection();
                tl.set(conn);
                System.out.println(conn + "6666666666666666");
            }
            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 把链接和线程解绑
     */
    public void removeConnection() {
        tl.remove();
    }
}

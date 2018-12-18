package Cukes;

import Cukes.Clients.Database.db;
import Cukes.Clients.Logging.connection_unix;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by OzorakM on 13.2.2018.
 */
@ContextConfiguration(classes = SpringConfigurator.class)
public class Test {
    @Autowired
    connection_unix conn;
    @Autowired
    db dbase;
    @Value("${db.vomsmaster1}")
    String dbUser1;
    @Value("${db.vomsmaster1.pass}")
    String dbPass1;
    @Value("${db.vomsmaster2.user}")
    String dbUser2;
    @Value("${db.vomsmaster2.pass}")
    String dbPass2;
    @Value("${db.zts_schmea.user}")
    String dbUser3;
    @Value("${db.zts_schmea.user}")
    String dbPass3;


    @Given("^All connections to server are established$")
    public void all_connections_to_server_are_established() throws Throwable {
        conn.connectIt();
        conn.isConnected();

    }

    @Given("^\"([^\"]*)\" database is connected$")
    public void database_is_connected(String arg1) throws Throwable {
        switch (arg1) {
            case "vomsmaster1":
                dbase.setUser(dbUser1);
                dbase.setPassword(dbPass1);
                break;
            case "vomsmaster2":
                dbase.setUser(dbUser2);
                dbase.setPassword(dbPass2);
                break;
            case "zts_schema":
                dbase.setUser(dbUser3);
                dbase.setPassword(dbPass3);
                break;
        }
        dbase.connectIt();
    }

}

package Cukes.Clients.Logging;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by OzorakM on 27.6.2018.
 */
@Service
public class connection_unix {

    @Value("${unix.connection.user}")
    String user;
    @Value("${unix.connection.host}")
    String host;
    @Value("${unix.connection.pass}")
    String password;

    Session session;
    public void connectIt() {
        try {
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            session = jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disconnectIt(){
        session.disconnect();
    }

    public boolean isConnected(){
        if(session.isConnected())return true;
        else return false;
    }
}

package dbUtil;

import java.sql.DriverManager;

public class dbConnection {
    private static final String sqconn = "jdbc:sqlite:school sqlit";

    public static dbConnection getconnection(){
        try {
            class.forname("org.sqlite.JDBC");
            return DriverManager.getConnection()
        }


    }










}

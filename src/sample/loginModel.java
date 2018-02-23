package sample;

import java.sql.Connection;
import java.sql.SQLDataException;

public class loginModel {

    Connection connection;

    public loginModel() {
        try {
            this.connection=dbconnection.getconnection();
        }catch (SQLDataException);z
    }
}

package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginModel {

    Connection connection;

    public loginModel() {
        try {
            this.connection=dbconnection.getconnection();
        }catch (SQLDataException);z
    }
}

package com.indra.actions;

import com.indra.models.DataExcelModels;
import oracle.jdbc.datasource.impl.OracleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabasePortInActions extends DataExcelModels {

    public void cleanLinesMsisdn(String msisdn) throws SQLException {
        cleanLineMsisdn(getUrlDBE(), getPort(), getServiceE(), getUserE(), getPasswordE()
                , msisdn);
    }

    public void cleanLinesMsi(String msi) throws SQLException {
        cleanLineMsi(getUrlDBS(), getPort(), getServiceS(), getUserS(), getPasswordS()
                , msi);
    }

    public String executePortabilityTransactionStatus(String msisdn) throws SQLException {
        //msisdn= getMSISDN();-- se tomaria desde el excel datamodel se debe crear
        return portabilityTransactionStatus(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,msisdn);
    }

    public void executePortabilityNip(String msisdn) throws SQLException {

        portabilityNip(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,msisdn);
    }

    public String executeSelectNip(String nip) throws SQLException {
        String data= selectNip(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,nip);
        return data;
    }

    public void executePortabilityRecept(String msisdn) throws SQLException {
        portabilityRecept(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,msisdn);
    }

    public void executeUpdatePortId(String portId, String msisdn) throws SQLException {
        updatePortId(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,portId,msisdn);
    }

    public void executePortId(String portId) throws SQLException {
        portId(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,portId);
    }

    public List<String> executePortabilityTransaction(String msisdn) throws SQLException {
        return portabilityTransaction(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,msisdn);
    }

    public void executeWindowPortability(String msisdn) throws SQLException {
        windowPortability(getUrlDBA(),getPort(),getServiceA(),getUserA(),getPasswordA()
                ,msisdn);
    }

//---------------------------------PortIn clean lines-------------------------------------

    public void cleanLineMsisdn(String url, String port, String service, String user, String password,
                                             String msisdn) throws SQLException {
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "delete from siebel.CX_DEVICE_MSISDN where device='"+msisdn+"'";
            stmt.executeUpdate(query);// realiza la ejecución de query
            stmt.execute("COMMIT");
            System.out.println("Delete siebel.CX_DEVICE_MSISDN - Exitoso");
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public void cleanLineMsi(String url, String port, String service, String user, String password,
                              String msi) throws SQLException {
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "delete from SIEBEL.cx_device_chip where IMSI='"+msi+"'";
            stmt.executeUpdate(query);// realiza la ejecución de query
            stmt.execute("COMMIT");
            System.out.println("Delete SIEBEL.cx_device_chip - Exitoso");
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }
//---------------------------------PortIn-------------------------------------

    public String portabilityTransactionStatus(String url, String port, String service, String user, String password,
                                               String msisdn) throws SQLException {
        String response="";
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "SELECT ps.*, TO_CHAR(ps.create_date, 'DD-MM-YYYY HH24:MI:SS' )\n" +
                    "FROM portability_transactions pt,\n" +
                    "     portability_status_audit ps\n" +
                    "WHERE pt.id = ps.id_portability\n" +
                    "AND pt.msisdn= '"+msisdn+"'\n" +
                    "ORDER BY ps.create_date ASC";
            resultSet = stmt.executeQuery(query);// realiza la ejecución de query
            while (resultSet.next()) {
                response=resultSet.getString(3);

                //System.out.println(resultSet.getString(3));
            }
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
        return response;
    }

    public void portabilityNip(String url, String port, String service, String user, String password,
                                             String msisdn) throws SQLException {
        System.out.println(msisdn);
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "update activator.portability_transactions set STATUS = 'PIN_REQUEST_ACEPTADO', NIP=null where msisdn in ('"+msisdn+"','','')";
            //System.out.println(query);
            stmt.execute(query);
            stmt.execute("COMMIT");
            System.out.println("Update PIN_REQUEST_ACEPTADO - Exitoso");

        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public String selectNip(String url, String port, String service, String user, String password,
                            String nip) throws SQLException {
        String data="";
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "select * from activator.portability_transactions where NIP IN ('"+nip+"')";
            resultSet = stmt.executeQuery(query);// realiza la ejecución de query
            while (resultSet.next()) {
                data=resultSet.getString(3);
                //System.out.println(resultSet.getString(3));
            }

        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }

        return data;
    }

    public void portabilityRecept(String url, String port, String service, String user, String password,
                               String msisdn) throws SQLException {
        System.out.println("aca esta el msisdn *****"+msisdn);
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "update activator.portability_transactions set STATUS = 'PORT_IN_ACK_RECIBIDO' where msisdn in ('"+msisdn+"','','')";
            stmt.execute(query);// realiza la ejecución de query
            stmt.execute("COMMIT");
            System.out.println("Update PORT_IN_ACK_RECIBIDO - Exitoso");
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public void portId(String url, String port, String service, String user, String password,
                                  String portId) throws SQLException {
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "select * from  activator.portability_transactions where PORT_ID ='"+portId+"'";
            resultSet = stmt.executeQuery(query);// realiza la ejecución de query
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3));
            }
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public void updatePortId(String url, String port, String service, String user, String password,
                       String portId, String msisdn) throws SQLException {
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "update activator.portability_transactions set PORT_ID ='"+portId+"' where msisdn ='"+msisdn+"'";
            stmt.execute(query);// realiza la ejecución de query
            stmt.execute("COMMIT");
            System.out.println("Update PORT_ID - Exitoso");
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public void windowPortability(String url, String port, String service, String user, String password,
                             String msisdn) throws SQLException {
        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "select * from ACTIVATOR.PORTABILITY_WINDOW_PROCESS where MSISDN in ('"+msisdn+"')";
            resultSet = stmt.executeQuery(query);// realiza la ejecución de query
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3));
            }
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
    }

    public List<String> portabilityTransaction(String url, String port, String service, String user, String password,
                                               String msisdn) throws SQLException {
        List<String> response = new ArrayList<>();

        OracleDataSource ods = null;
        Connection conn= null;
        ResultSet resultSet = null;
        // Create DataSource and connect to the local database
        ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//"+url+":"+port+"/"+service);
        ods.setUser(user);
        ods.setPassword(password);
        conn = ods.getConnection();
        Statement stmt=conn.createStatement();
        try {
            String query = "select * from  activator.portability_transactions where msisdn ='"+msisdn+"'";
            resultSet = stmt.executeQuery(query);// realiza la ejecución de query
            while (resultSet.next()) {
                //System.out.println(resultSet.getString(2)+resultSet.getString(4)+resultSet.getString(5)+resultSet.getString(9)+resultSet.getString(10));
                response.add(resultSet.getString(2));
                response.add(resultSet.getString(4));
                response.add(resultSet.getString(5));
                response.add(resultSet.getString(9));
                response.add(resultSet.getString(10));
            }
        }
        //Close the result set, statement, and the connection
        finally{
            if(conn!=null) conn.close();
        }
        //System.out.println(response);
        return response;
    }
}
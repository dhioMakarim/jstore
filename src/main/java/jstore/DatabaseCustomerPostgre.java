package jstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseCustomerPostgre {

    private int id;
    private String nama;
    private String email;
    private String username;
    private String tanggal;
    private String bulan;
    private String tahun;
    private String password;

    private Connection connection = null;
    private Statement statement = null;
    private String sql = null;

    public DatabaseCustomerPostgre(String nama, String email, String username, String password, String tahun, String bulan, String tanggal) {
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.password = password;
        this.tahun = tahun;
        this.bulan = bulan;
        this.tanggal = tanggal;
    }

    public void insertCustomer()
    {
        try {
            connection = DatabaseConnection.connection();
            statement = connection.createStatement();

            sql = "INSERT INTO CUSTOMER (NAMA, EMAIL, TANGGAL, BULAN, TAHUN, PASSWORD)"
                    + "VALUES (" + nama + "," + email + "," + tanggal + "," + bulan + "," +
                    "" + tahun + "," + password + ");";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }

    public int getLastCustomerId()
    {
        try {
            connection = DatabaseConnection.connection();
            statement = connection.createStatement();

            sql = "SELECT MAX(ID) FROM CUSTOMER;";

            ResultSet resultSet = statement.executeQuery(sql);
            while ( resultSet.next() ) {
                int id = resultSet.getInt("id");
                System.out.println( "ID = " + id );
                System.out.println();

                this.id = id;
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return this.id;
    }

    public Customer getCustomer(int id)
    {
        Customer customer = null;
        try {
            connection = DatabaseConnection.connection();
            statement = connection.createStatement();

            sql = "SELECT * FROM CUSTOMER;";

            ResultSet resultSet = statement.executeQuery(sql);
            while ( resultSet.next() ) {
                int idData = resultSet.getInt("id");
                if(idData == id){
                    String  nama = resultSet.getString("nama");
                    String  email = resultSet.getString("email");
                    String  username = resultSet.getString("username");
                    String  password = resultSet.getString("password");

                    int  tahun = resultSet.getInt("tahun");
                    int  bulan = resultSet.getInt("bulan");
                    int tanggal = resultSet.getInt("tanggal");

                    System.out.println( "ID = " + id );
                    System.out.println( "ID = " + nama );
                    System.out.println( "ID = " + email );
                    System.out.println( "ID = " + email );
                    System.out.println( "ID = " + tanggal );
                    System.out.println( "ID = " + bulan );
                    System.out.println( "ID = " + tahun);
                    System.out.println( "ID = " + password);
                    System.out.println();

                    customer = new Customer(nama, email, username, password, tahun, bulan, tanggal);
                }

            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return customer;
    }

    public void removeCustomer(int id) {
        try {
            connection = DatabaseConnection.connection();
            statement = connection.createStatement();

            sql = "DELETE from CUSTOMER where ID = " + id + ";";

            statement.executeUpdate(sql);
            connection.commit();

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}

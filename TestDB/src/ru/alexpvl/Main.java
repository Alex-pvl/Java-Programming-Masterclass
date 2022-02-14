package ru.alexpvl;

import java.sql.*;

public class Main {
    public static final String TABLE_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/alex/Java/Java-Programming-Masterclass/TestDB/" + TABLE_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                              " (" + COLUMN_NAME + " text, " +
                                     COLUMN_PHONE + " integer, " +
                                     COLUMN_EMAIL + " text" +
                              ")"
            );

            insertContact(statement, "Sasha", 3862930, "sasha@gmail.com");
            insertContact(statement, "Tim", 6462345, "tim@email.eu");
            insertContact(statement, "Joe", 3951230, "joe@inbox.ru");
            insertContact(statement, "Jack", 392310, "jack@yandex.com.ua");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                                COLUMN_PHONE + "=123456 WHERE " +
                                COLUMN_NAME + "='Joe'"
            );

            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " +
                                COLUMN_NAME + "='Tim'"
            );

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + "|" +
                                   results.getInt(COLUMN_PHONE) + "|" +
                                   results.getString(COLUMN_EMAIL));
            }
            results.close();

            statement.close();
            conn.close();

//            Class.forName("org.sql.JDBC");
        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "VALUES ('"+name+"',"+phone+", '"+email+"')"
        );
    }
}

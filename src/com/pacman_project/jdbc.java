package com.pacman_project;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class jdbc {

    public static int score = 0;

    public jdbc(int score) throws ClassNotFoundException, SQLException {
        System.out.println("2222222");
        jdbc.score = score;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(dtf);

        String url = "jdbc:mysql://localhost:3307/java-lab";

        String username = "root";

        String password = "rajendran";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established successfully");



        Statement statement = con.createStatement();

        //statement.execute("CREATE TABLE JAVA(ID INTEGER , NAME VARCHAR(255))");
        System.out.println("insert");
        String query = "INSERT INTO leaderboard (Score , date) values("+score+" , '"+time+"')";
        System.out.println("insert");
        statement.executeUpdate(query);
    }



        //ResultSet rs = statement.executeQuery("SELECT * FROM JAVA");

        // while(rs.next()){
//
//                System.out.println("ID : " + rs.getInt("ID") + " NAME : " + rs.getString("NAME"));
//
//            }

//    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//        try {
//
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//            LocalDateTime now = LocalDateTime.now();
//            String time = now.format(dtf);
//
//            String url = "jdbc:mysql://localhost:3307/java-lab";
//
//            String username = "root";
//
//            String password = "rajendran";
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection con = DriverManager.getConnection(url, username, password);
//
//            System.out.println("Connection Established successfully");
//
//
//
//            Statement statement = con.createStatement();
//
//            //statement.execute("CREATE TABLE JAVA(ID INTEGER , NAME VARCHAR(255))");
//            System.out.println("insert");
//            String query = "INSERT INTO leaderboard (Score , date) values("+score+" , '"+time+"')";
//            System.out.println("insert");
//            statement.executeUpdate(query);
//
//            //ResultSet rs = statement.executeQuery("SELECT * FROM JAVA");
//
//           // while(rs.next()){
////
////                System.out.println("ID : " + rs.getInt("ID") + " NAME : " + rs.getString("NAME"));
////
////            }
//
//        }
//
//        catch(Exception e){
//
//            System.out.println(e);
//
//        }

//    }

}
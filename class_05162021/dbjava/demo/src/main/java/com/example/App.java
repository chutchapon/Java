package com.example;

public class App {

    public static void main(String args[]) {
        // Connection c = null;
        // Statement stmt = null;

        // try {
        // Class.forName("org.sqlite.JDBC");
        // c = DriverManager.getConnection("jdbc:sqlite:company.db");
        // System.out.println("Opened database successfully");

        // stmt = c.createStatement();
        CompanyDB cmDB = new CompanyDB();
        // cmDB.insertData(1, "Paul", 32, "California", 20000.00f);
        // cmDB.insertData(2, "Allen", 25, "Texas", 15000.00f);
        cmDB.UpdateData(1, "Paul", 32, "California", 20000.00f);
        cmDB.UpdateData(2, "Allen", 25, "Texas", 15000.00f);


        /* Create Table */

        // String sql = "CREATE TABLE COMPANY " + "(ID INT PRIMARY KEY NOT NULL," + "
        // NAME TEXT NOT NULL, "
        // + " AGE INT NOT NULL, " + " ADDRESS CHAR(50), " + " SALARY REAL)";

        /* Insert data to Database */

        // String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
        // + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
        // stmt.executeUpdate(sql);

        // sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (2,
        // 'Allen', 25, 'Texas', 15000.00 );";
        // stmt.executeUpdate(sql);

        // sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (3,
        // 'Teddy', 23, 'Norway', 20000.00 );";
        // stmt.executeUpdate(sql);

        // sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
        // + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";

        /* insert data with while loop */
        // ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY;");

        // while (rs.next()) {
        // int id = rs.getInt("id");
        // String name = rs.getString("name");
        // int age = rs.getInt("age");
        // String address = rs.getString("address");
        // float salary = rs.getFloat("salary");

        // System.out.println("ID = " + id);
        // System.out.println("NAME = " + name);
        // System.out.println("AGE = " + age);
        // System.out.println("ADDRESS = " + address);
        // System.out.println("SALARY = " + salary);
        // System.out.println();
        // }
        // rs.close();
        // stmt.executeUpdate(sql);
        // stmt.close();
        // c.close();
        cmDB.selectAll();
        // } catch (Exception e) {
        // System.err.println(e.getClass().getName() + ": " + e.getMessage());
        // System.exit(0);
        // }
        System.out.println("End Program");
    }
}
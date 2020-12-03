/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.util.Date;

/**
 *
 * @author Matthieu Petit
 */
public class Bookings {
    
   
    public int id;
    public String ride;
    public Date date;
    public String name;
    public String firstName;
    public int tickets;
    public double price;
   
   /* public Connection conn;
    public String DataBaseURL = "jdbc:mysql://mysql-abcdefedcba.alwaysdata.net:3306/abcdefedcba_kidsland?zeroDateTimeBehavior=convertToNull";
   */
   
    public void setName(String n)
    {
        name = n;
    }
    public void setId(int d)
    {
        id = d;
    }
    public void setFirstName(String n)
    {
        firstName = n;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public void setRide(String f)
    {
        ride = f;
    }
    public void setTickets(int t)
    {
        tickets = t;
    }
    public void setDate(Date d)
    {
        date = d;
    }
   
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public double getPrice()
    {
        return price;
    }
    public String getRide()
    {
        return ride;
    }
    public int getTickets()
    {
        return tickets;
    }
    public Date getDate()
    {
        return date;
    }
   
   /* public void getDataBaseConnection()
   {
      try
      {
         
         Class.forName("com.mysql.jdbc.Driver");
         // Create a connection to the database.
         conn = DriverManager.getConnection(DataBaseURL, "219241", "Data219241123456");
      }
      catch (ClassNotFoundException | SQLException ex)
      {
         System.exit(0);
         System.out.println("Problème de connexion avec la base de donnée");
      }
   }*/
   
   /* public void addB() throws SQLException
    {  
        Statement stmt = conn.createStatement();
        String sqlStatement = "INSERT INTO bookings" +
                       "(id, name, firstName, date, rideBooked, tickets, price)" +
                       "VALUES " +
                       "('"+id+"','"+name+"','"+firstName+"','2020-11-26','"+ride+"','"+tickets+"','"+price+"')";
        int rows = stmt.executeUpdate(sqlStatement);
       
    }*/
   
    public void display()
    {
        System.out.println( id+ " - "+name+" - " +firstName+ " - "+date+ " - "+ride+ " - "+tickets+ " - "+price  );
    }
   
}


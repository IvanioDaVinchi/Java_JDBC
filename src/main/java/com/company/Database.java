package com.company;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Database
{
    String url = "jdbc:mysql://localhost:3306/CarDealerShip";
    String login = "root";
    String password = "root";
    static Scanner in = new Scanner(System.in);
    public void Client_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Clients");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "FirstName"+":" + rs.getString(2)+"\n" +
                            "SecondName" + ":" + rs.getString(3)+"\n" +
                            "Patronymic"+":" + rs.getString(4)+"\n" +
                            "PhoneNumber" + ":" + rs.getString(5);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void EngineTypes_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM EngineTypes");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "NameEngine"+":" + rs.getString(2)+"\n" +
                            "EngineCapacity" + ":" + rs.getString(3)+"\n" +
                            "EnginePower"+":" + rs.getString(4);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void TransmissionTypes_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM TransmissionTypes");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "NameTransmission"+":" + rs.getString(2)+"\n" +
                            "NumberOfGears" + ":" + rs.getString(3);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Cars_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cars");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "CarBrand"+":" + rs.getString(2)+"\n" +
                            "CarModel"+":" + rs.getString(3)+"\n" +
                            "Speed"+":" + rs.getString(4)+"\n" +
                            "Racing"+":" + rs.getString(5)+"\n" +
                            "EngineType"+":" + rs.getString(6)+"\n" +
                            "TransmissionType"+":" + rs.getString(7)+"\n" +
                            "CarColor"+":" + rs.getString(8)+"\n" +
                            "Price" + ":" + rs.getString(9);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Employeers_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Employeers");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "FirstName"+":" + rs.getString(2)+"\n" +
                            "SecondName"+":" + rs.getString(3)+"\n" +
                            "Patronymic"+":" + rs.getString(4)+"\n" +
                            "PhoneNumber"+":" + rs.getString(5)+"\n" +
                            "Position"+":" + rs.getString(6);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Suppliers_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Suppliers");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                            "nameSupplier"+":" + rs.getString(5);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Sales_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Sales");
                while (rs.next())
                {
                    String str = "ID" + ":" + rs.getString(1)+"\n" +
                    "IDClient" + ":" + rs.getString(2)+"\n" +
                    "IDCar" + ":" + rs.getString(3)+"\n" +
                    "IDEmployee" + ":" + rs.getString(4)+"\n" +
                     "DateSale"+":" + rs.getString(5);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Cars_Suppliers_Information()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try
            {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Car_Supplier");
                while (rs.next())
                {
                    String str = "IDCar" + ":" + rs.getString(1)+"\n" +
                            "IDSupplier" + ":" + rs.getString(2);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            }
            finally
            {
                con.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void AddInCarsTable()
    {
        try
        {
            PreparedStatement preparedStatement = null;
            Connection con = DriverManager.getConnection(url, login, password);
            String sql = "INSERT INTO Cars VALUE (DEFAULT,?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            System.out.println("Введите марку новой машины:\n");
            String brand = in.next();
            System.out.println("Введите модель новой машины:\n");
            String model = in.next();
            System.out.println("Введите максимальную скорость:");
            String speed = in.next();
            System.out.println("Введите разгон до 100:\n");
            String racing = in.next();
            System.out.println("Введите тип двигателя:\n");
            String engineType = in.next();
            System.out.println("Введите тип трансмиссии:");
            String transmisType = in.next();
            System.out.println("Введите цвет авто:");
            String carColor = in.next();
            System.out.println("Введите стоимость авто");
            String price = in.next();
            preparedStatement.setString(1, brand);
            preparedStatement.setString(2, model);
            preparedStatement.setString(3, speed);
            preparedStatement.setString(4, racing);
            preparedStatement.setString(5, engineType);
            preparedStatement.setString(6, transmisType);
            preparedStatement.setString(7, carColor);
            preparedStatement.setString(8, price);
            preparedStatement.execute();
            System.out.println("Новая запись добавлена!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void AddNewSupplier()
    {
        try
        {
            PreparedStatement preparedStatement = null;
            Connection con = DriverManager.getConnection(url, login, password);
            String sql = "INSERT INTO Suppliers VALUE (DEFAULT,?)";
            preparedStatement = con.prepareStatement(sql);
            System.out.println("Введите наименовнаие нового поставщика:\n");
            String name = in.next();

            preparedStatement.setString(1, name);
            preparedStatement.execute();
            System.out.println("Новая запись добавлена!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void DeleteFromDB()
    {
        PreparedStatement preparedStatement = null;
        Connection con = null;
        try
        {
            con = DriverManager.getConnection(url, login, password);
            System.out.println("Введите номер машины, которую хотите удалить");
            String id = in.next();
            String sql = "DELETE FROM Cars WHERE ID ="+id;
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void UpdatePriceFromDB()
    {
        System.out.println("Введите номер машины, которую хотите изменить:");
        String id = in.next();
        System.out.println("Введите значение новой стоимости:");
        String paramValue = in.next();
        PreparedStatement preparedStatement = null;
        Connection con = null;
        try
        {
            con = DriverManager.getConnection(url, login, password);
            String sql = "UPDATE Cars SET Price =? WHERE ID = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,paramValue);
            preparedStatement.setString(2,id);
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

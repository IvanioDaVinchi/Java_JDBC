package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int sw;
        while(true)
        {
            System.out.println("Введите номер пункта");
            System.out.println("1) вывод таблиц");
            System.out.println("2) Добавление новой записи ");
            System.out.println("3) Удаление записи");
            System.out.println("4) Отредактировать запись");
            sw = in.nextInt();
            switch(sw)
            {
                case 1:
                {
                    PrintTableFromDB();
                    break;
                }
                case 2:
                {
                    AddInDB();
                    break;
                }
                case 3:
                {
                    DeleteFromDB();
                    break;
                }
                case 4:
                {
                    UpdateFromDB();
                    break;
                }
            }
        }
    }
    public static void PrintTableFromDB()
    {
        Database db = new Database();
        System.out.println("Введите номер пункта");
        System.out.println("1) Cars");
        System.out.println("2) Clients ");
        System.out.println("3) EngineTypes");
        System.out.println("4) TransmissionTypes");
        System.out.println("5) Employeers");
        System.out.println("6) Suppliers");
        System.out.println("7) Sales");
        System.out.println("8) Car_Supplier");
        int sww = in.nextInt();
        switch (sww)
        {
            case 1:
            {
                db.Cars_Information();
                break;
            }
            case 2:
            {
                db.Client_Information();
                break;
            }
            case 3:
            {
                db.EngineTypes_Information();
                break;
            }
            case 4:
            {
                db.TransmissionTypes_Information();
                break;
            }
            case 5:
            {
                db.Employeers_Information();
                break;
            }
            case 6:
            {
                db.Suppliers_Information();
                break;
            }
            case 7:
            {
                db.Sales_Information();
                break;
            }
            case 8:
            {
                db.Cars_Suppliers_Information();
                break;
            }
        }
    }
    static void AddInDB()
    {
       Database db = new Database();
       db.AddInCarsTable();
    }
    static void DeleteFromDB()
    {
        Database db = new Database();
        db.DeleteFromDB();
    }
    static void UpdateFromDB()
    {
        Database db = new Database();
        db.UpdatePriceFromDB();
    }
}

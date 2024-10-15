/*
Author : Vaibhav Talekar
Roll No. 53
Start Date:16/07/2024
Modified Date:23/07/2024
Title: Implementation of Indian Parliament
Description: This is a menu driven program implementing the indian parliament using the concepts of OOPs. It has classes as mention below to add president, rajyasabha member, lok sabha member and displaying them as an output based on different choices selected by user.

Classes:
  class President
  class Rajyasabha(extends President)
  class Loksabha(extends Rajyasabha)
  main class IndianParliament(extends Loksabha)
*/

using System;
using System.Collections.Generic;

class President
{
    public string Pname;
    public string Pparty;

    public void AddPres(string pname, string pparty)
    {
        Pname = pname;
        Pparty = pparty;
    }

    public string DisplayPres()
    {
        return $"President: {Pname}, Party: {Pparty}";
    }
}

class RajyaSabha : President
{
    public string Rname;
    public string Rposition;
    public string Rparty;

    public void AddRsm(string rname, string rposition, string rparty)
    {
        Rname = rname;
        Rposition = rposition;
        Rparty = rparty;
    }

    public string DisplayRsm()
    {
        return $"Name: {Rname}, Position: {Rposition}, Party: {Rparty}";
    }
}

class LokSabha : RajyaSabha
{
    public string Lname;
    public string Lposition;
    public string Lparty;

    public void AddLsm(string lname, string lposition, string lparty)
    {
        Lname = lname;
        Lposition = lposition;
        Lparty = lparty;
    }

    public string DisplayLsm()
    {
        return $"Name: {Lname}, Position: {Lposition}, Party: {Lparty}";
    }
}

class IndianParliament : LokSabha
{
    public static void Main(string[] args)
    {
        President p1 = new President();
        List<RajyaSabha> rs = new List<RajyaSabha>();
        List<LokSabha> ls = new List<LokSabha>();
        int choice;

        do
        {
            Console.WriteLine("\nIndian Parliament:");
            Console.WriteLine("1. Add President");
            Console.WriteLine("2. Display President");
            Console.WriteLine("3. Add Rajya Sabha Member");
            Console.WriteLine("4. Add Lok Sabha Member");
            Console.WriteLine("5. List Rajya Sabha Members");
            Console.WriteLine("6. List Lok Sabha Members");
            Console.WriteLine("7. Indian Parliament");
            Console.WriteLine("0. Exit");

            Console.WriteLine("\nEnter your choice:");
            choice = int.Parse(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    Console.WriteLine("\nPlease Enter President Name and Party");
                    string pname = Console.ReadLine();
                    string pparty = Console.ReadLine();
                    p1.AddPres(pname, pparty);
                    break;

                case 2:
                    Console.WriteLine(p1.DisplayPres());
                    break;

                case 3:
                    Console.WriteLine("\nPlease Enter Name, Position, Party");
                    string rname = Console.ReadLine();
                    string rposition = Console.ReadLine();
                    string rparty = Console.ReadLine();
                    RajyaSabha newRs = new RajyaSabha();
                    newRs.AddRsm(rname, rposition, rparty);
                    rs.Add(newRs);
                    break;

                case 4:
                    Console.WriteLine("\nPlease Enter Name, Position, Party");
                    string lname = Console.ReadLine();
                    string lposition = Console.ReadLine();
                    string lparty = Console.ReadLine();
                    LokSabha newLs = new LokSabha();
                    newLs.AddLsm(lname, lposition, lparty);
                    ls.Add(newLs);
                    break;

                case 5:
                    Console.WriteLine("\nRajya Sabha Members:");
                    for (int i = 0; i < rs.Count; i++)
                    {
                        Console.WriteLine($"{i + 1}. {rs[i].DisplayRsm()}");
                    }
                    break;

                case 6:
                    Console.WriteLine("\nLok Sabha Members:");
                    for (int i = 0; i < ls.Count; i++)
                    {
                        Console.WriteLine($"{i + 1}. {ls[i].DisplayLsm()}");
                    }
                    break;

                case 7:
                    Console.WriteLine("\nIndian Parliament:");
                    Console.WriteLine(p1.DisplayPres());
                    Console.WriteLine("\nRajya Sabha Members:");
                    for (int i = 0; i < rs.Count; i++)
                    {
                        Console.WriteLine($"{i + 1}. {rs[i].DisplayRsm()}");
                    }
                    Console.WriteLine("\nLok Sabha Members:");
                    for (int i = 0; i < ls.Count; i++)
                    {
                        Console.WriteLine($"{i + 1}. {ls[i].DisplayLsm()}");
                    }
                    break;

                case 0:
                    break;
            }
        } while (choice != 0);
    }
}

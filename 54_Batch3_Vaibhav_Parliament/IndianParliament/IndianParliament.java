
/*
@author : Vaibhav Talekar
Roll No. 54
Start Date:16/07/2024
Modified Date:30/07/2024
Title: Implementation of Indian Parliament
Description: This is a menu driven program implementing the indian parliament using the concepts of OOPs. It has classes as mention below to add president, rajyasabha member, lok sabha member and displaying them as an output based on different choices selected by user.

Classes:
  class president
  class rajyasabha(extends president)
  class loksabha(extends rajyasabha)
  main class IndianParliament(extends loksabha)
*/
import java.util.*;

class president{
    String pname;
    String pparty;
    public void addpres(String pname,String pparty){
        this.pname=pname;
        this.pparty=pparty;

    }
    public String displaypres(){
        String president="President: "+pname+", Party: "+pparty;
        return president;
       // System.out.println("\nPresident: "+pname);
    }
}

class rajyasabha extends president{
    String rname;
    String rposition;
    String rparty;

    public void addrsm(String rname,String rposition,String rparty){
        this.rname=rname;
        this.rposition=rposition;
        this.rparty=rparty;
    }
    public String displayrsm(){
        String raj = "Name: " + rname + ", Position: " + rposition + ", Party: " + rparty;
        return raj;
    }
}

class loksabha extends rajyasabha{
    String lname;
    String lposition;
    String lparty;

    public void addlsm(String lname,String lposition,String lparty){
        this.lname=lname;
        this.lposition=lposition;
        this.lparty=lparty;
    }
    public String displaylsm(){
        String lok = "Name: " + lname + ", Position: " + lposition + ", Party: " + lparty;
        return lok;
    }
}

public class IndianParliament extends loksabha{
    public static void main(String[] args){
        president p1=new president();

        rajyasabha []rs =new rajyasabha[250];
        int r=-1;
        loksabha []ls =new loksabha[543];
        int l=-1;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\nIndian Parliament:");
            System.out.println("1. Add President");
            System.out.println("2. Display President");
            System.out.println("3. Add Rajya Sabha Member");
            System.out.println("4. Add lok Sabha Member");
            System.out.println("5. list Rajya Sabha Member");
            System.out.println("6. List Lok Sabha Member");
            System.out.println("7. Indian Parliament");
            System.out.println("0. Exit");


            System.out.println("\nEnter your choice:");
            choice = scanner.nextInt();
            switch(choice){
                case 1 :

                    System.out.println("\nPlease Enter President Name and Party");
                    scanner.nextLine();
                    String pname = scanner.nextLine();
                    String pparty = scanner.nextLine();
                    p1.addpres(pname,pparty);
                    break;

                case 2 :
                    System.out.println(p1.displaypres());
                    break;

                case 3 :
                    r++;
                    System.out.println("\nPLease Enter Name, Position, Party");
                    scanner.nextLine();
                    String rname= scanner.nextLine();
                    String rposition= scanner.nextLine();
                    String rparty= scanner.nextLine();

                    rs[r]=new rajyasabha();
                    rs[r].addrsm(rname,rposition,rparty);

                    break;

                case 4:
                    l++;
                    System.out.println("\nPLease Enter Name, Position, Party");
                    scanner.nextLine();
                    String lname= scanner.nextLine();
                    String lposition= scanner.nextLine();
                    String lparty= scanner.nextLine();

                    ls[l]=new loksabha();
                    ls[l].addlsm(lname,lposition,lparty);

                    break;

                case 5:
                    System.out.println("\nRajya Sabha Members :");
                    for(int i=0;i<rs.length;i++){
                        if(rs[i]== null){
                            break;
                        }
                        else {
                            System.out.println((i+1)+". "+rs[i].displayrsm());
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nLok Sabha Members :");
                    for(int i=0;i<ls.length;i++){
                        if(ls[i]== null){
                            break;
                        }
                        else {
                            System.out.println((i+1)+". "+ls[i].displaylsm());
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nIndian Parliament :");
                    System.out.println(p1.displaypres());
                    System.out.println("\nRajya Sabha Members:");
                    for(int i=0;i<rs.length;i++){
                        if(rs[i]== null){
                            break;
                        }
                        else {
                            System.out.println((i+1)+". "+rs[i].displayrsm());
                        }
                    }
                    System.out.println("\nLok Sabha Members:");
                    for(int i=0;i<ls.length;i++){
                        if(ls[i]== null){
                            break;
                        }
                        else {
                            System.out.println((i+1)+". "+ls[i].displaylsm());
                        }
                    }
                    break;




                case 0:
                    break;



            }
        }while(choice!=0);
    }
}

"""
Author : Vaibhav Talekar
Roll No. 53
Start Date:24/07/2024
Modified Date:25/07/2024
Title: Implementation of Indian Parliament
Description: This is a menu driven program implementing the indian parliament using the concepts of OOPs. It has classes as mention below to add president, rajyasabha member, lok sabha member and displaying them as an output based on different choices selected by user.


Classes:
  class President
  class Rajyasabha(extends President)
  class Loksabha(extends Rajyasabha)
"""

class President:
    def __init__(self):
        self.pname = None
        self.pparty = None

    def add_pres(self, pname, pparty):
        self.pname = pname
        self.pparty = pparty

    def display_pres(self):
        return f"President: {self.pname}, Party: {self.pparty}"


class RajyaSabha:
    def __init__(self):
        self.rname = None
        self.rposition = None
        self.rparty = None

    def add_rsm(self, rname, rposition, rparty):
        self.rname = rname
        self.rposition = rposition
        self.rparty = rparty

    def display_rsm(self):
        return f"Name: {self.rname}, Position: {self.rposition}, Party: {self.rparty}"


class LokSabha(RajyaSabha):
    def __init__(self):
        super().__init__()
        self.lname = None
        self.lposition = None
        self.lparty = None

    def add_lsm(self, lname, lposition, lparty):
        self.lname = lname
        self.lposition = lposition
        self.lparty = lparty

    def display_lsm(self):
        return f"Name: {self.lname}, Position: {self.lposition}, Party: {self.lparty}"


def main():
    p1 = President()
    rs = []
    ls = []

    while True:
        print("\nIndian Parliament:")
        print("1. Add President")
        print("2. Display President")
        print("3. Add Rajya Sabha Member")
        print("4. Add Lok Sabha Member")
        print("5. List Rajya Sabha Members")
        print("6. List Lok Sabha Members")
        print("7. Indian Parliament")
        print("0. Exit")

        choice = int(input("\nEnter your choice: "))

        if choice == 1:
            pname = input("\nPlease Enter President Name: ")
            pparty = input("Please Enter President Party: ")
            p1.add_pres(pname, pparty)

        elif choice == 2:
            print(p1.display_pres())

        elif choice == 3:
            rname = input("\nPlease Enter Name: ")
            rposition = input("Please Enter Position: ")
            rparty = input("Please Enter Party: ")
            new_rsm = RajyaSabha()
            new_rsm.add_rsm(rname, rposition, rparty)
            rs.append(new_rsm)

        elif choice == 4:
            lname = input("\nPlease Enter Name: ")
            lposition = input("Please Enter Position: ")
            lparty = input("Please Enter Party: ")
            new_lsm = LokSabha()
            new_lsm.add_lsm(lname, lposition, lparty)
            ls.append(new_lsm)

        elif choice == 5:
            print("\nRajya Sabha Members:")
            for i, member in enumerate(rs, start=1):
                print(f"{i}. {member.display_rsm()}")

        elif choice == 6:
            print("\nLok Sabha Members:")
            for i, member in enumerate(ls, start=1):
                print(f"{i}. {member.display_lsm()}")

        elif choice == 7:
            print("\nIndian Parliament:")
            print(p1.display_pres())
            print("\nRajya Sabha Members:")
            for i, member in enumerate(rs, start=1):
                print(f"{i}. {member.display_rsm()}")
            print("\nLok Sabha Members:")
            for i, member in enumerate(ls, start=1):
                print(f"{i}. {member.display_lsm()}")

        elif choice == 0:
            break


if __name__ == "__main__":
    main()

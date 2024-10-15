/*
Author : Vaibhav Talekar
Roll No. 53
Start Date:23/07/2024
Modified Date:25/07/2024
Title: Implementation of Indian Parliament
Description: This is a menu driven program implementing the indian parliament using the concepts of OOPs. It has classes as mention below to add president, rajyasabha member, lok sabha member and displaying them as an output based on different choices selected by user.

Classes:
  class President
  class Rajyasabha(extends President)
  class Loksabha(extends Rajyasabha)
*/

#include <iostream>
#include <string>
#include <list>

using namespace std;

class President {
public:
    string pname;
    string pparty;

    void addPres(const string& pname, const string& pparty) {
        this->pname = pname;
        this->pparty = pparty;
    }

    string displayPres() const {
        return "President: " + pname + ", Party: " + pparty;
    }
};

class RajyaSabha : public President {
public:
    string rname;
    string rposition;
    string rparty;

    void addRsm(const string& rname, const string& rposition, const string& rparty) {
        this->rname = rname;
        this->rposition = rposition;
        this->rparty = rparty;
    }

    string displayRsm() const {
        return "Name: " + rname + ", Position: " + rposition + ", Party: " + rparty;
    }
};

class LokSabha : public RajyaSabha {
public:
    string lname;
    string lposition;
    string lparty;

    void addLsm(const string& lname, const string& lposition, const string& lparty) {
        this->lname = lname;
        this->lposition = lposition;
        this->lparty = lparty;
    }

    string displayLsm() const {
        return "Name: " + lname + ", Position: " + lposition + ", Party: " + lparty;
    }
};

int main() {
    President p1;
    list<RajyaSabha> rs;
    list<LokSabha> ls;
    int choice;

    do {
        cout << "\nIndian Parliament:" << endl;
        cout << "1. Add President" << endl;
        cout << "2. Display President" << endl;
        cout << "3. Add Rajya Sabha Member" << endl;
        cout << "4. Add Lok Sabha Member" << endl;
        cout << "5. List Rajya Sabha Members" << endl;
        cout << "6. List Lok Sabha Members" << endl;
        cout << "7. Indian Parliament" << endl;
        cout << "0. Exit" << endl;

        cout << "\nEnter your choice: ";
        cin >> choice;

        cin.ignore(); // Ignore newline character left in the buffer

        switch (choice) {
            case 1: {
                cout << "\nPlease Enter President Name and Party" << endl;
                string pname, pparty;
                getline(cin, pname);
                getline(cin, pparty);
                p1.addPres(pname, pparty);
                break;
            }

            case 2: {
                cout << p1.displayPres() << endl;
                break;
            }

            case 3: {
                cout << "\nPlease Enter Name, Position, Party" << endl;
                string rname, rposition, rparty;
                getline(cin, rname);
                getline(cin, rposition);
                getline(cin, rparty);
                RajyaSabha newRs;
                newRs.addRsm(rname, rposition, rparty);
                rs.push_back(newRs);
                break;
            }

            case 4: {
                cout << "\nPlease Enter Name, Position, Party" << endl;
                string lname, lposition, lparty;
                getline(cin, lname);
                getline(cin, lposition);
                getline(cin, lparty);
                LokSabha newLs;
                newLs.addLsm(lname, lposition, lparty);
                ls.push_back(newLs);
                break;
            }

            case 5: {
                cout << "\nRajya Sabha Members:" << endl;
                int i = 1;
                for (const auto& member : rs) {
                    cout << i++ << ". " << member.displayRsm() << endl;
                }
                break;
            }

            case 6: {
                cout << "\nLok Sabha Members:" << endl;
                int i = 1;
                for (const auto& member : ls) {
                    cout << i++ << ". " << member.displayLsm() << endl;
                }
                break;
            }

            case 7: {
                cout << "\nIndian Parliament:" << endl;
                cout << p1.displayPres() << endl;
                cout << "\nRajya Sabha Members:" << endl;
                int i = 1;
                for (const auto& member : rs) {
                    cout << i++ << ". " << member.displayRsm() << endl;
                }
                cout << "\nLok Sabha Members:" << endl;
                i = 1;
                for (const auto& member : ls) {
                    cout << i++ << ". " << member.displayLsm() << endl;
                }
                break;
            }

            case 0:
                break;
        }
    } while (choice != 0);

    return 0;
}

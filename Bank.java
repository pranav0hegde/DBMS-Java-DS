import java.util.Scanner;
class Account {
  String name;
  int acc_no;
  double balance;
  char c;
  Account(String name, int acc_no, char c) {
    this.c = c;
    this.name = name;
    this.acc_no = acc_no;
    balance = 0.0;
  }
  void deposit(double amt) {
    balance += amt;
  }
  void withdraw(double amt) {
    if (balance > amt) {
      balance -= amt;
    } else {
      System.out.println("Insufficiant funds");
    }
  }
  void display() {
    System.out.println("Balance is " + balance);
  }
  void interest() {
    System.out.println("Interest not calculated for Current account;");
  }
}

class Cur_acc extends Account {
  int min_bal = 500;
  int penalty = 50;
  Cur_acc(String name, int acc_no) {
    super(name, acc_no, 'c');
  }
  void withdraw(double amt) {
    if (balance < min_bal) {
      System.out.println("Penalty applied");
      balance -= penalty;
    }
    if (balance > amt) {
      balance -= amt;
    } else {
      System.out.println("Insufficiant funds");
    }

  }

}
class Sav_acc extends Account {
  int min_bal = 500;
  int penalty = 50;
  double rate = 5.0;
  double amount;
  Sav_acc(String name, int acc_no) {
    super(name, acc_no, 's');
  }
  void interest() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter time(in years) since conception of account: ");
    double t = sc.nextDouble();
    amount = balance * (Math.pow((1 + rate / 100.0), t));
    System.out.println("Balance is " + amount);
    balance = amount;
  }
 }
}

class Main {
  public static void main(String s[]) {
    Scanner sc = new Scanner(System.in);
    double amt = 0;
    System.out.println("Enter name of account holder: ");
    String name = sc.nextLine();
    System.out.println("Enter account number: ");
    int acc_no = sc.nextInt();
    System.out.println("Enter 's' for Svaings Account \nEnter 'c' for Current Account");
    Account obj;
    char a = sc.next().charAt(0);
    switch (a) {
    case 's':
      obj = new Sav_acc(name, acc_no);

      break;
    case 'c':
      obj = new Cur_acc(name, acc_no);

      break;
    default:
      System.out.println("Invalid input");
      return;
    }
    while (true) {
      System.out.println("Enter\n1. To deposit\n2. To Withdraw\n3. To Display balance\n4. To compute interest\n5. To exit");
      int n = sc.nextInt();
      switch (n) {
      case 1:
        System.out.println("Enter amount to deposit: ");
        amt = sc.nextDouble();
        obj.deposit(amt);
        break;
      case 2:
        System.out.println("Enter amount to withdraw: ");
        amt = sc.nextDouble();
        obj.withdraw(amt);
        break;
      case 3:
        obj.display();
        break;
      case 4:
        obj.interest();
        break;
      case 5:
        return;
      default:
        System.out.println("Invalid input");
      }
    }
  }
}
import java.util.Scanner;
class WrongAge extends Exception {
    public WrongAge() {
        super("Age Error");
    }
    public WrongAge(String message) {
        super(message);
    }
}

class InputScanner {
    Scanner s = new Scanner(System.in);
    public void closeScanner() {
        s.close();
    }
}
class Father extends InputScanner {
    int fatherAge;
    public Father() throws WrongAge {
        System.out.println("Enter the father's age:");
        fatherAge = s.nextInt();
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }
    public void display() {
        System.out.println("The father's age is " + fatherAge);
    }
}
class Son extends Father {
    int sonAge;

    public Son() throws WrongAge {
        System.out.println("Enter the son's age:");
        sonAge = s.nextInt();
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        } else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

     public void display() {
        System.out.println("The son's age is " + sonAge);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Son s = new Son();
            s.display();
            s.closeScanner();
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}

package Chat;

public class NewMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            myClass.ageCheck(16);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Throws // Throw

class MyClass{
    void ageCheck(int age) throws AdultException{
        if (age > 18){
            System.out.println("Age verified");
        }else{
            throw new AdultException("Your are not allowed for your age");
        }
    }
}


class AdultException extends Exception {
    public AdultException() {
        super("You are not allowed for adultException");
    }

    public AdultException(String mssg) {
        super(mssg);
    }
}
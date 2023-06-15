public class Application {
    double age;
    double height;
    String name;

    Application(double age, double height) {
        this.age = age;
        this.height = height;
    }
    public void addName(String name){
        this.name = name;
    }
    public void check() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
        else{
                System.out.println("You have to enter user name.");
            }
        }
        public static void main (String[]args){
        Application verify = new Application( 30.5, 178);
        verify.addName("Adam");
        verify.check();
        }
    }

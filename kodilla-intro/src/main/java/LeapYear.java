public class LeapYear {
    public static void main(String[] args) {
        String przestepny = " to rok przestepny";
        String niePrzestepny = " to rok nieprzestepny";
        int rok = 2001;


        if((rok%4)!=0){
            System.out.println(rok+niePrzestepny);
        }
        else if((rok%100)!=0){
            System.out.println(rok+przestepny);
        }
        else if((rok%400)!=0){
            System.out.println(rok+niePrzestepny);
        }
        else{
            System.out.println(rok+przestepny);
        }
    }
}

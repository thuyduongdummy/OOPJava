package practice.loops;

public class ForLoopsPractice {
    public static void main(String args[]){
        String name = "So you've learnt some Java";
        for(int i=0; i <= name.length()-1; i++){
            System.out.println("char"+i+": "+name.charAt(i));
        }

        //print char but in backward order
        for(int i=name.length()-1; i >= 0; i--){
            System.out.println("char"+i+": "+name.charAt(i));
        }

        //print all the even numbers from 0 to 100, including 100
        int number = 100;
        for(int i = 0; i <= number; i=i+2){
            System.out.println("Even number from 0 to 100 are: "+ i);
        }
    }
}

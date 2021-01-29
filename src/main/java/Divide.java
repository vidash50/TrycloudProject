public class Divide {

    public static void main(String[] args) {


        int num1 = 65;
        int num2 =2;
        int count = 0;

        while (num1>=num2){
            num1-=num2;
            count++;
        }

        System.out.println(count+"remainder"+num1);
    }
}

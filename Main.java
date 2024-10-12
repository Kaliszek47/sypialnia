public class Main {
    public static void main(String[] args) {
        System.out.println("HEJKA") ;

        int number =5;

        System.out.println(number);

        number += 10;

        System.out.println(number);

        int num1=6 , num2=7;
        int sum= num1 + num2;

        System.out.println(sum);

        float num3=6, num4=7;
        float dzielenie;

        dzielenie= num4/num3;

        System.out.println(dzielenie);

        boolean bool1=true;
        boolean bool2=false;

        System.out.println(bool1 && bool2);
        System.out.println(bool1||bool2);
        System.out.println(!(bool1||bool2));

        int n1= 6, n2=10;

            System.out.println(n1 + " " + n2);

        if(n1>n2){
            System.out.println("liczba " + n1 + " jest wieksza od liczby" + n2);
        }
        else if(n1==n2){
            System.out.println("liczby są sobie równe");
        }
        else {
            System.out.println("liczba " + n1 + " /jest mniejsza od liczby " + n2);
        }

            int x=0;

        for(int i=0; i<10; i++){
            x+=1 ;
            System.out.println(x);
        }

        System.out.println("x+1");

        for(int i=0; i<10; i++){
            System.out.println(i+1);
        }

        System.out.println("i+1");

        int i=0;
        while (i<20) {
            System.out.println(i + " ");
            i++;
        }

        Scanner input = new Scanner(System.in);





    }

}

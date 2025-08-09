public class nummberdigitcount {
    public static void main(String[] args) {
        long numm = 5674165474l;
        System.out.println("number you have entered : "+numm);
        int n =(int) Math.log10(numm)+1;
        System.out.println(n);

        int a = 100;
        int b = 200;
                System.out.println("Before swap the a is : "+a+" & b is : "+b);
        swap(a, b);
        swapa(a, b);
        swapb(a, b);


    }
    static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After third variable swap the a is : "+a+" & b is : "+b);

    }

     static void swapa(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        
                System.out.println("After Arithmatic swap the a is : "+a+" & b is : "+b);
    }

     static void swapb(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
                System.out.println("After bitwise swap the a is : "+a+" & b is : "+b);

    }
}

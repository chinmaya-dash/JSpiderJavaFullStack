public class Staticdemo1 {
    // public static void main(String [] args){
    //     System.out.println("Hello, World!");
    //    greet();//here greet methode is used without creating an object of demo2 class because we have used static key word
    // }
 
    // public static void greet(){
    //     System.out.println("this is the greeting method inside demo1 class");
    // }

   public static void main(String [] args){
        System.out.println("Hello, World!");
        Staticdemo1 obj = new Staticdemo1();
       obj.greet();//here greet methode is used with creating an object of demo2 class because we have not used static key word
    }
 
    public  void greet(){
        System.out.println("this is the greeting method inside demo1 class");
    }
}

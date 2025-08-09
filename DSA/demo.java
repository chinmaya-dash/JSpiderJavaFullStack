import java.util.*;
public class demo {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter an integer");
int num = sc.nextInt();//i think the issue here is that after number it takes an empty string
//  after i take the line consumed in sc.nestLine it works 
// sc.nextLine();35

System.out.println("Enter an string");
String str = sc.nextLine();

System.out.println("Entered  string is "+num+" and number is "+str);





// char num = ''; 
// int a = -5;
// System.out.println(Integer.toBinaryString(a));
// int asci = a>>>1;
// System.out.println(asci);
// System.out.println(Integer.toBinaryString(asci));
sc.close();
}
}

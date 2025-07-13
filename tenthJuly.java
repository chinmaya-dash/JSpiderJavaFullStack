public class tenthJuly {
    public static void main(String[] args) {
        int age = 21;
        System.out.println("The name of the coder is : " + age);
        Innernonpublic.greet();
        INInnernonpublic.greet();
    }

}

class Innernonpublic {
    static void greet() {
        System.out.println("inside Innernonpublic");

    }
}
class INInnernonpublic {
    static void greet() {
        System.out.println("inside INInnernonpublic");

    }
}

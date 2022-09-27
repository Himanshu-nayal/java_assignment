 class program {
    static int age;
    static String Fname;
    static String Lname;

    public static void display(){
        age=21;
        Fname="Himanshu";
        Lname="Nayal";
        System.out.println("inside the static method");
        System.out.println("age=" +age  +"frist name="+Fname  +"last name="+Lname);
    }
    static {
        age=22;
        Fname="alean";
        Lname="chef";
        System.out.println("inside the static block");
        System.out.println("age=" +age +"frist name="+Fname +"last name="+Lname);

    }
    public static void main(String args[]) {
        program.age=26;
        program.Fname="Aman";
        program.Lname="josep";
        System.out.println("age="+age+ "Fname="+Fname);
        display();
    }
}

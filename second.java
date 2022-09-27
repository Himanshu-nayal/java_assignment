
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class second {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an string");
        List<String> data=new ArrayList<>();
        while(true){
            String s1=sc.nextLine();
            if(s1.equals("XDONE")){
                break;
            }
            data.add(s1);
        }
        System.out.println(data);
    }
}

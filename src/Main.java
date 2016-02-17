/**
 * Created by Admin on 16.02.2016.
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        PDV pdv = new PDV();

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.next());

        switch(answer) {
            case 1:
                System.out.println("UZD0");
                pdv.UZD0();
                break;
            case 2:
                System.out.println("UZD1");
                pdv.UZD1();
                break;
            case 3:
                System.out.println("UZD2");
                pdv.UZD2();
                break;
            default:
                answer = Integer.parseInt(scanner.next());
        }
    }
public static class PDV{
    public void UZD0 () {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){
            list.add(input.nextInt());
            if(list.contains(0)){
                //list.remove((Integer)0); // Need to remove 0 ?
                break;
            }
        }

        System.out.print(list + ",");
        System.out.println(" Max Value: " + Collections.max(list));
    }
    public void UZD1 () {

    }
    public void UZD2 () {

    }
}

}

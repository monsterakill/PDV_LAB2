/**
 * Created by Admin on 16.02.2016.
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int number;
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //
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

}

/**
 * Created by Admin on 17.02.2016.
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
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
            List<Integer> list = new ArrayList<>();
            Scanner input = new Scanner(System.in);

            while(input.hasNextInt()){
                list.add(input.nextInt());
                if(list.contains(0)){
                    //list.remove((Integer)0); // Need to remove 0 ?
                    break;
                }
            }
            ArrayList<Integer>even = new ArrayList<>();
            ArrayList<Integer>odd = new ArrayList<>();
            Integer listArr[] = new Integer[list.size()];
            listArr = list.toArray(listArr);
            for(int i = 0; i < list.size(); i++){
                if(listArr[i] % 2 == 0){
                    even.add(listArr[i]);
                }else {
                    odd.add(listArr[i]);
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            even.remove((Integer)0); // Need to remove 0 ?
            odd.remove((Integer)0); // Need to remove 0 ?
            System.out.print("Pāra skaitli: " + even + ",");
            System.out.print("Nepāra skaitli: " + odd + ",");
        }
        public void UZD2 () throws IOException {
            Random rand = new Random();
            int max = 100;
            int min = 1;
            int numb = rand.nextInt(max - min + 1) + min;
            System.out.println(numb);// Need to know random number ?
            try {
                while(true){
                    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                    String s = bufferRead.readLine();
                    int n = Integer.parseInt(s);
                    if(n == numb){
                        System.out.println("DAMN SON !");
                        break;
                    }
                    if(n < numb){
                        System.out.println("ievadītais skaitlis ir lielāks");
                    }
                    if(n > numb){
                        System.out.println("ievadītais skaitlis ir mazāks");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

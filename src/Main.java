import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);
        System.out.println("N: ");
        int N = input.nextInt();
        System.out.println(getNthOdd(array,N));
    }
    private static int getNthOdd(int[] array,int N){
        int counter = 1;
        for (int i=0; i<array.length;i++){
            if(array[i]%2==0){
                if(counter==N)
                    return array[i];
                    counter++;

                }
            }
            return -1;
        }
// pt functia getNthOdd mai merge si asa
//private static int getNthOdd(int[] array,int N){
//    int counter = 1;
//    for (int number:array){
//        if(number%2==0){
//            if(counter==N)
//                return number;
//            counter++;
//
//        }
//    }
//    return -1;
//}

    private static int[] getArray(Scanner input){
        System.out.println("Introduceti elementele:");
        String line = input.nextLine();
        String[] elements = line.split(" ");
        int[] array = new int[elements.length];
        for (int i=0; i<elements.length;i++)
            array[i]=Integer.valueOf(elements[i]);
        return array;
    }

}

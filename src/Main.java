import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] massiv2 = inputArray();
        System.out.println("Сумма всех элементов = "+sumArray(massiv2));
        System.out.println("Минимальный = "+minValueArray(massiv2));
        System.out.println("Номер максимального = "+indexOfMaxInArray(massiv2));
        System.out.println("поменяли мин и макс: ");
        swapMinMaxArray(massiv2);
        printFromTo(0,massiv2.length-1, massiv2);
        System.out.println("в обратном порядке:");
        printBackward(massiv2);
        System.out.println("вывести со второго, по предпоследний, например");
        printFromTo(2,massiv2.length-1,massiv2);
        System.out.println("Введите х:");
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        System.out.println("Номер х: "+indexOf(x,massiv2));
        System.out.println("Введите х:");
        x = read.nextInt();
        System.out.println("Номер ближайшего к х: "+indexOfNearestByModule(x,massiv2));

    }
    public static int sumArray(int[] m)
    {
        int sum = 0;
        for(int i=0; i<m.length; i++)
            sum += m[i];
        return sum;
    }
    public static int minValueArray(int[] m){
        int min = m[0];
        for (int i=1; i<m.length; i++){
            if (min>m[i]) min = m[i];
        }
        return min;
    }
    public static int indexOfMaxInArray(int[] m){
        int max = m[0],j=0;
        for (int i =1; i<m.length; i++){
            if (m[i]>max) {
                max = m[i];
                j = i;
            }
        }
        return j;
    }
    public static int indexOfMinInArray(int[] m){
        int min = m[0],j=0;
        for (int i =1; i<m.length; i++){
            if (m[i]<min) {
                min = m[i];
                j = i;
            }
        }
        return j;
    }
    public static int[] swapMinMaxArray(int[] m){
        int minI = indexOfMinInArray(m);
        int maxI = indexOfMaxInArray(m);
        int tmp = m[minI];
        m[minI] = m[maxI];
        m[maxI] = tmp;
        return m;
    }
    public static int indexOf(int x,int[] m){
        for (int i = 0; i<m.length; i++){
            if (m[i]==x) return i;
        }
        return -1;
    }
    public static int indexOfNearestByModule(int x,int[] m){
        int minDif = x-m[0];
        int j = 0;
        for (int i = 1; i<m.length; i++){
            if ((x - m[i])<minDif) minDif = x - m[i];
            j = i;
        }
        return j;
    }
    public static void printBackward(int[] m){
        for (int i = m.length-1; i>=0; i--){
            System.out.print(m[i]+" ");
        }
        System.out.println("");
    }
    public static void printFromTo(int i, int j, int[] m){
        for (; i<=j; i++)
            System.out.print(m[i]+" ");
        System.out.println("");
    }
    public static void readArray(int[] m)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите "+m.length+" элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] massiv2 = inputArray();
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
    }
    public static void printFromTo(int i, int j, int[] m){
        for (; i<=j; i++)
            System.out.println(m[i]+" ");
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
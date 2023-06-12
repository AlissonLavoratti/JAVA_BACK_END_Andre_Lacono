import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        int[] my_array11 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        Arrays.sort(my_array11);

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        String[] my_array22 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        Arrays.sort(my_array22);

        System.out.println(Arrays.toString(my_array1));//original
        System.out.println(Arrays.toString(my_array11));//original

        System.out.println(Arrays.toString(my_array2));//original
        System.out.println(Arrays.toString(my_array22));//ordenada

    }
}
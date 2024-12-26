public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { //Error: accessing index beyond array bounds
            arr[i] = i * 2; 
            System.out.println(arr[i]);
        }
    }
}
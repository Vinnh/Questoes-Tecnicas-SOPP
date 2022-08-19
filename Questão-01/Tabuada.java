import java.io.*;

public class Tabuada {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 1; i <= 10; i++) {
            int mult = N * i;
            System.out.println(N + " x " + i + " = " + mult);
        }

        bufferedReader.close();
    }
}
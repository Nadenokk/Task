import java.util.*;
import java.io.*;

public class Summa {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {

    }

    public void run() {
        try {
            in = new FastScanner(new File("1.in"));
            out = new PrintWriter(new File("1.out"));

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] arg) {
        new Summa().run();
        System.out.println("Hello World!");
    }
}

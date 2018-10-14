import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E3917 {

    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int x = in.nextInt();
        boolean YES = true;
        int sqrt = ((int) Math.sqrt(x)) + 1;
        for (int i = 2; i <= sqrt; i++) {
            if (x % i == 0) {
                YES = false;
                break;
            }
        }
        if (x == 2) {
            YES = true;
        }
        System.out.println(YES ? "True" : "False");
    }

    public void run() {
        try {
            in = new FastScanner(new File("input.txt"));
//            out = new PrintWriter(new File("output.txt"));
            out = new PrintWriter(System.out);

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
//            try {
//                br = new BufferedReader(new FileReader(f));
            br = new BufferedReader(new InputStreamReader(System.in));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
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
        System.out.println("Hello World!");
        new E3917().run();
    }

}

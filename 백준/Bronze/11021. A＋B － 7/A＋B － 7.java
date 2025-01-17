import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder s = new StringBuilder();
        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine()," ");
            s.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())
                            +Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();
        System.out.println(s);
    }
}
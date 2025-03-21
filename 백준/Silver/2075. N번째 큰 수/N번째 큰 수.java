import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


/*
    - 시간복잡도
    제한시간: 1초
    타입: 숫자제한이 -10억~10억 이므로 int 사용 가능
    N의 최댓값이 1500이라서 O(N^2logN)을해도 1억 미만이기때문에 가능
    - 접근
    1. 가장 큰 수는 마지막 줄 가장 큰 숫자
    2. 두 번째 큰 수는

 */
public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                pq.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i = 0; i < n-1; i++){
            pq.poll();
        }
        System.out.println(pq.poll());

    }

}

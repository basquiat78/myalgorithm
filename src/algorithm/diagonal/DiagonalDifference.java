package algorithm.diagonal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * created by basquiat
 * 
 * 
 * hackerrank 단계별로 문제 풀어보기
 * 
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * 
 *
 */
public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        
    	// 왼족에서 오른쪽으로 대각선의 값들을 합한 결과값
        int leftToRightDiagonal = 0;
        
        // 오른쪽에서 왼쪽으로 대각선의 값들을 합한 결과값
        int rigthToLeftDiagonal = 0;
        
        // 1. 일단 배열의 사이즈를 구한다.
        int arraysize = arr.length;
        
        // 2. 첫번째 배열의 사이즈를 구한다.
        int fFlag = arr[0].length;
        
        // 3. 이 문제는 다음과 같이 패턴화해서 풀어야 한다.
        // 예를 들면 0,0의 값, 1,1, 2,2, 3,3...처럼 왼쪽에서 오른쪽으로 대각선의 값을 구해서 전부 더하는 첫 번째 방식
        // 두 번째는 오른쪽에서 왼쪽 예를 들면 0,2, 1,1, 2,0 처럼 일종의 패턴을 유지한다는 것이다.
        
        // 일단 배열의 길이만큼 반복을 해야한다.
        for(int i=0; i<arraysize; i++) {
        	// 그리고 배열의 첫번째의 사이즈만큼 돈다.
            for(int j=0; j<fFlag; j++) {
            	
                // leftToRight find value
                // e.g, 0,0 | 1,1 | 2,2
            	// 첫번째는 i와 j가 같다는 패턴에 의해 심플하게 생각하면 밑에 코드와 같다.
                if(i == j) {
                    leftToRightDiagonal  = leftToRightDiagonal + arr[i][j];
                }

                // rightToLeft find value
                // e.g. 0,2, | 1,1 | 2,0
                // 이넘은  i,j의 패턴으로 본다. i와 j의 합은 전째 배열 사이즈에서 1를 뺀것과 같다
                // 해당 조건에 맞는 값은 다 더해버리자
                if( i + j == arraysize - 1 ) {
                    rigthToLeftDiagonal = rigthToLeftDiagonal + arr[i][j];
                }

            }
        }

        // return leftToRightDiagonal - rigthToLeftDiagonal;
        // 위 코드로 하면 무조건 틀린다. 왜냐하면 원하는 답은 절대값이기 때문이다.
        // 자바에서 지원하는 스펙을 활용해서 다음과 같은 코드를 반환하자.
        return Math.abs(leftToRightDiagonal - rigthToLeftDiagonal);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
}

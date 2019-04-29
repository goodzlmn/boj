package GraphPrograming1;

import java.util.*;

public class boj2667 {
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	private static void dfs(int a[][], int d[][], int x, int y, int cnt, int n) {
		d[x][y] = cnt;
		for(int k=0; k<4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(0<=nx && nx < n && 0<=ny && ny < n) {
				if(a[nx][ny] == 1 && d[nx][ny]==0) {
					dfs(a, d, nx, ny, cnt, n);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int a[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<n; j++) {
				a[i][j] = s.charAt(j) - '0';
			}
		}
		
		int cnt = 0;
		int d[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] == 1 && d[i][j] == 0) {
					dfs(a, d, i, j, ++cnt, n);
				}
			}
		}
		
		int ans[] = new int[cnt];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(d[i][j] != 0) {
					ans[d[i][j] - 1] += 1;
				}
			}
		}
		
		Arrays.sort(ans);
		System.out.println(cnt);
		for(int i=0; i<cnt; i++) {
			System.out.println(ans[i]);
		}
	}
}

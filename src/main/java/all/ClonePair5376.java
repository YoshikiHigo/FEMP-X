package all;

public class ClonePair5376 {

    int method1(String source,String target,int limit){
      int n=source.length();
      int m=target.length();
      final int disarda=limit + 1;
      if (n == 0 || m == 0)   return Math.max(m,n);
      if (Math.abs(m - n) > limit)   return disarda;
      int matrix[][]=new int[n + 1][m + 1];
      int ust;
      ust=Math.min(limit,n);
      for (int i=0; i <= ust; i++)   matrix[i][0]=i;
      ust=Math.min(limit,m);
      for (int j=1; j <= ust; j++)   matrix[0][j]=j;
      for (int i=1; i <= n; i++) {
        char s_i=source.charAt(i - 1);
        boolean devamet=false;
        if (i - limit >= 1) {
          matrix[i][i - limit]=Math.min(matrix[i - 1][i - limit] + 1,matrix[i - 1][i - limit - 1] + ((source.charAt(i - 1) == target.charAt(i - limit - 1)) ? 0 : 1));
          devamet|=matrix[i][i - limit] <= limit;
        }
        int alt=Math.max(i - limit + 1,1);
        ust=Math.min(i + limit - 1,m);
        for (int j=alt; j <= ust; ++j) {
          char t_j=target.charAt(j - 1);
          int cost;
          if (s_i == t_j) {
            cost=0;
          }
     else {
            cost=1;
          }
          int above=matrix[i - 1][j];
          int left=matrix[i][j - 1];
          int diag=matrix[i - 1][j - 1];
          int cell=Math.min(above + 1,Math.min(left + 1,diag + cost));
          if (i > 1 && j > 1) {
            int trans=matrix[i - 2][j - 2] + 1;
            if (source.charAt(i - 2) != t_j)         trans++;
            if (s_i != target.charAt(j - 2))         trans++;
            if (cell > trans)         cell=trans;
          }
          matrix[i][j]=cell;
          devamet|=cell <= limit;
        }
        if (i + limit <= m) {
          matrix[i][i + limit]=Math.min(matrix[i][i + limit - 1] + 1,matrix[i - 1][i + limit - 1] + ((source.charAt(i - 1) == target.charAt(i + limit - 1)) ? 0 : 1));
          devamet|=matrix[i][i + limit] <= limit;
        }
        if (!devamet)     return disarda;
      }
      return matrix[n][m];
    }

    int method2(String s,String t,int limit){
      int n=s.length();
      int m=t.length();
      int[][] d=new int[n + 1][m + 1];
      int cost;
      if (n == 0)   return m;
      if (m == 0)   return n;
      for (int i=0; i <= n; d[i][0]=i++)   ;
      for (int j=0; j <= m; d[0][j]=j++)   ;
      for (int i=1; i <= n; i++) {
        for (int j=1; j <= m; j++) {
          cost=(t.charAt(j - 1) == s.charAt(i - 1) ? 0 : 1);
          d[i][j]=Math.min(Math.min(d[i - 1][j] + 1,d[i][j - 1] + 1),d[i - 1][j - 1] + cost);
          if (i > 1 && j > 1) {
            int trans=d[i - 2][j - 2] + 1;
            if (s.charAt(i - 2) != t.charAt(j - 1))         trans++;
            if (s.charAt(i - 1) != t.charAt(j - 2))         trans++;
            if (d[i][j] > trans)         d[i][j]=trans;
          }
        }
      }
      return d[n][m] > limit ? limit + 1 : d[n][m];
    }
}

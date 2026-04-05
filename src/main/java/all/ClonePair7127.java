package all;

public class ClonePair7127 {

    int method1(int n,int m){
      int[] b=new int[n + 1];
      b[0]=1;
      for (int i=1; i <= n; i++) {
        b[i]=1;
        for (int j=i - 1; j > 0; --j) {
          b[j]+=b[j - 1];
        }
      }
      return b[m];
    }

    int method2(int set,int combinations){
      int[] row=new int[set + 1];
      row[0]=1;
      for (int i=0; i < set; ++i) {
        row[i + 1]=1;
        for (int j=i; j > 0; --j) {
          row[j]+=row[j - 1];
        }
      }
      return row[combinations];
    }
}

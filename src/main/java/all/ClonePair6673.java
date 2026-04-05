package all;

public class ClonePair6673 {

    float[][] method1(float[][] a,float[][] b){
      int ra=a.length;
      int ca=a[0].length;
      int rb=b.length;
      int cb=b[0].length;
      if (ca != rb) {
        System.err.println("Matrix dimensions do not agree");
        return null;
      }
      float[][] m=new float[ra][cb];
      for (int i=0; i < ra; i++)   for (int j=0; j < cb; j++) {
        m[i][j]=0;
        for (int k=0; k < ca; k++)     m[i][j]+=a[i][k] * b[k][j];
      }
      return m;
    }

    float[][] method2(float[][] a,float[][] b){
      int am=a.length;
      int an=a[0].length;
      int bm=b.length;
      int bn=b[0].length;
      int rm=am;
      int rn=bn;
      if (an != bm) {
        return null;
      }
      float[][] r=new float[am][bn];
      int i, j, k;
      float dot;
      for (i=0; i < rm; i++) {
        for (j=0; j < rn; j++) {
          dot=0;
          for (k=0; k < an; k++) {
            dot+=a[i][k] * b[k][j];
          }
          r[i][j]=dot;
        }
      }
      return r;
    }
}

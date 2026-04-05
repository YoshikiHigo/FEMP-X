package all;

public class ClonePair7891 {

    float[][] method1(float[][] o,int kr,boolean zeroFloor){
      int x=o.length;
      int y=o[0].length;
      float[][] eroded=new float[x][y];
      int a1, a2, b1, b2;
      float min;
      for (int a=0; a < x; a++) {
        a1=a - kr;
        if (a1 < 0) {
          a1=0;
        }
        a2=a + kr;
        if (a2 >= x) {
          a2=x - 1;
        }
        for (int b=0; b < y; b++) {
          b1=b - kr;
          if (b1 < 0) {
            b1=0;
          }
          b2=b + kr;
          if (b2 >= y) {
            b2=y - 1;
          }
          min=Float.MAX_VALUE;
          for (int c=a1; c <= a2; c++) {
            for (int d=b1; d <= b2; d++) {
              if (o[c][d] < min) {
                min=o[c][d];
              }
            }
          }
          eroded[a][b]=min;
          if ((zeroFloor) && (min < 0)) {
            eroded[a][b]=0;
          }
        }
      }
      return eroded;
    }

    float[][] method2(float[][] o,int kr,boolean zeroFloor){
      int x=o.length;
      int y=o[0].length;
      float[][] dilation=new float[x][y];
      int a1, a2, b1, b2;
      float max;
      for (int a=0; a < x; a++) {
        a1=a - kr;
        if (a1 < 0) {
          a1=0;
        }
        a2=a + kr;
        if (a2 >= x) {
          a2=x - 1;
        }
        for (int b=0; b < y; b++) {
          b1=b - kr;
          if (b1 < 0) {
            b1=0;
          }
          b2=b + kr;
          if (b2 >= y) {
            b2=y - 1;
          }
          max=Float.NEGATIVE_INFINITY;
          for (int c=a1; c <= a2; c++) {
            for (int d=b1; d <= b2; d++) {
              if (o[c][d] > max) {
                max=o[c][d];
              }
            }
          }
          dilation[a][b]=max;
          if ((zeroFloor) && (max < 0)) {
            dilation[a][b]=0;
          }
        }
      }
      return dilation;
    }
}

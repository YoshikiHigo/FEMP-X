package unverified;

public class ClonePair7904 {

    int method1(int n1,int n2){
      int menos, result;
      menos=Math.abs(n1) - Math.abs(n2);
      result=(int)(Math.random() * menos) + Math.abs(n1);
      if ((n1 < 0 && n2 < 0) || (n1 < 0 && n2 > 0))   result=-1 * result;
      return result;
    }

    int method2(int a,int b){
      while (a != b) {
        if (a > b) {
          a=a - b;
        }
     else {
          b=b - a;
        }
      }
      return a;
    }
}

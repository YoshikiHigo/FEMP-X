package all;

public class ClonePair7678 {

    int method1(int a,int b){
      while (a != b) {
        if (a > b) {
          int na=a % b;
          if (na == 0)       return b;
          a=na;
        }
     else {
          int nb=b % a;
          if (nb == 0)       return a;
          b=nb;
        }
      }
      return a;
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

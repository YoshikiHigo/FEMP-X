package all;

public class ClonePair7347 {

    String method1(long x,int n,int m,String d){
      if (x == 0) {
        return ("0");
      }
      String r="";
      while (x != 0) {
        r=d.charAt((int)(x & m)) + r;
        x=x >>> n;
      }
      return r;
    }

    String method2(long x,int n,int m,String d){
      if (x == 0)   return "0";
      String r="";
      while (x != 0) {
        r=d.charAt((int)(x & m)) + r;
        x=x >>> n;
      }
      return r;
    }
}

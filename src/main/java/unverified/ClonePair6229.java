package unverified;

public class ClonePair6229 {

    int method1(int ofs,int length){
      if ((ofs < 0) || (length <= 0)) {
        return 0;
      }
     else   if (ofs >= length) {
        return length - 1;
      }
     else {
        return ofs;
      }
    }

    int method2(int kids,int quantity){
      int result=0;
      int colors[]=new int[5];
      while (kids > 0) {
        boolean found=false;
        for (int i=0; i < colors.length; i++) {
          if (colors[i] >= quantity) {
            colors[i]-=quantity;
            kids--;
            found=true;
            break;
          }
        }
        if (!found) {
          result++;
          int c=20;
          while (c > 0) {
            for (int i=0; i < colors.length; i++) {
              if (c > 0 && colors[i] == 0) {
                if (c > quantity - 1) {
                  colors[i]+=quantity - 1;
                  c-=quantity - 1;
                }
     else {
                  colors[i]+=c;
                  c=0;
                  break;
                }
              }
            }
            for (int i=0; i < colors.length; i++) {
              if (c > 0 && colors[i] == 0) {
                if (c > quantity - 1) {
                  colors[i]+=quantity - 1;
                  c-=quantity - 1;
                }
     else {
                  colors[i]+=c;
                  c=0;
                  break;
                }
              }
            }
          }
        }
      }
      System.out.println("result = " + result);
      return result;
    }
}

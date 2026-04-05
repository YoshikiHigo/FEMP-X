package unverified;

public class ClonePair7009 {

    int method1(int class_value,int poly_value){
      int return_value=0;
      if (class_value == 1) {
        if (poly_value == 1)     return_value=19;
     else     if (poly_value == 2)     return_value=7;
     else     if (poly_value == 3)     return_value=3;
      }
      return return_value;
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

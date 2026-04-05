package unverified;

public class ClonePair7424 {

    int method1(int kids,int quantity){
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

    int method2(int ang,int sq_size){
    switch (ang) {
    case 90:    return sq_size;
    case 135:  return sq_size;
    case 180:return 0;
    case 225:return -sq_size;
    case 270:return -sq_size;
    case 315:return -sq_size;
    case 0:return 0;
    case 45:return sq_size;
    default:System.err.println("Unknown angle: " + ang);
    return 0;
    }
    }
}

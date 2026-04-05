package all;

public class ClonePair7427 {

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

    int method2(int slinkPort,int cmd){
    switch (slinkPort) {
    case 4:switch (cmd) {
    case 0x1:      return 1;
      }
    break;
    case 6:switch (cmd) {
    case 0x8:return 1;
    }
    break;
    case 7:switch (cmd) {
    case 0xB:return 1;
    case 0xC:return 8;
    case 0xF:return 0;
    }
    break;
    case 0:case 1:case 2:case 3:switch (cmd) {
    case 0x80:return 0;
    case 0x81:return 0;
    }
    break;
    }
    return 0;
    }
}

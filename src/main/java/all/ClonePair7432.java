package all;

public class ClonePair7432 {

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

    int method2(int unfpot,int ing){
      int pot=0;
    switch (unfpot) {
    case 91:    if (ing == 221) {
          pot=121;
        }
      break;
    case 93:if (ing == 235 || ing == 237) {
      pot=175;
    }
    break;
    case 95:if (ing == 225) {
    pot=115;
    }
    break;
    case 97:if (ing == 1975 || ing == 1973) {
    pot=3010;
    }
    break;
    case 99:if (ing == 231) {
    pot=139;
    }
    if (ing == 239) {
    pot=133;
    }
    break;
    case 101:if (ing == 221) {
    pot=145;
    }
    if (ing == 235 || ing == 237) {
    pot=181;
    }
    break;
    case 103:if (ing == 231) {
    pot=151;
    }
    if (ing == 2970) {
    pot=3018;
    }
    break;
    case 105:if (ing == 225) {
    pot=157;
    }
    if (ing == 241 || ing == 243) {
    pot=187;
    }
    break;
    case 107:if (ing == 239) {
    pot=163;
    }
    break;
    case 109:if (ing == 245) {
    pot=169;
    }
    break;
    case 111:if (ing == 247) {
    pot=189;
    }
    break;
    case 2483:if (ing == 241 || ing == 243) {
    pot=2454;
    }
    if (ing == 3138) {
    pot=3042;
    }
    break;
    case 3002:if (ing == 2150 || ing == 2152) {
    pot=3034;
    }
    if (ing == 6049) {
    pot=5954;
    }
    if (ing == 6693) {
    pot=6687;
    }
    break;
    case 3004:if (ing == 223) {
    pot=3026;
    }
    break;
    default:pot=0;
    break;
    }
    return pot;
    }
}

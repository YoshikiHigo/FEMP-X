package all;

public class ClonePair7126 {

    String method1(byte aByte){
      String out="";
      for (int i=0; i < 2; i++) {
        int temp=(int)aByte;
        if (temp < 0) {
          temp+=256;
        }
        if (i == 0) {
          temp=temp / 16;
        }
     else {
          temp=temp % 16;
        }
        if (temp > 9) {
    switch (temp) {
    case 10:        out+="A";
          break;
    case 11:    out+="B";
      break;
    case 12:out+="C";
    break;
    case 13:out+="D";
    break;
    case 14:out+="E";
    break;
    case 15:out+="F";
    break;
    }
    }
     else {
    out+=Integer.toString(temp);
    }
    }
    return out;
    }

    String method2(byte b){
      String result="";
      int hidigit=((b >> 4) & 0x0F);
      if (hidigit > 0x9)   result+=(char)((hidigit - 0xA) + 'A');
     else   result+=(char)(hidigit + '0');
      int lodigit=(b & 0x0F);
      if (lodigit > 0x9)   result+=(char)((lodigit - 0xA) + 'A');
     else   result+=(char)(lodigit + '0');
      return result;
    }
}

package all;

import java.util.*;

public class ClonePair8276 {

    String method1(int i,int target){
      String s=Integer.toString(i);
      int sz=s.length();
      if (target <= sz)   return s;
      if (target == sz + 1)   return "0" + s;
      if (target == sz + 2)   return "00" + s;
     else {
        char[] c=new char[target - sz];
        Arrays.fill(c,'0');
        return new String(c) + s;
      }
    }

    String method2(int number,int zeros){
      if (number < 0 || zeros <= 0) {
        return String.valueOf(number);
      }
     else {
        int baseT=0;
        if (number > 0) {
          baseT=(int)Math.log10(number);
        }
        StringBuffer zString=new StringBuffer();
        for (int i=0; i < (zeros - baseT - 1); i++) {
          zString.append('0');
        }
        zString.append(number);
        return zString.toString();
      }
    }
}

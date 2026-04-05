package all;

import java.util.Random;

public class ClonePair13254 {

    String method1(String charPool,int length){
      final Random rnd=new Random();
      final int charPoolLength=charPool.length();
      char c;
      double r;
      int pos;
      final StringBuilder sb=new StringBuilder(length);
      for (int i=0; i < length; i++) {
        r=rnd.nextDouble();
        pos=(int)Math.abs(r * (charPoolLength - 1));
        c=charPool.charAt(pos);
        sb.append(c);
      }
      return sb.toString();
    }

    String method2(String chars,int length){
      StringBuffer result=new StringBuffer(length);
      int charsLength=chars.length();
      for (int i=0; i < length; i++) {
        result.append(chars.charAt((int)(Math.random() * charsLength)));
      }
      return result.toString();
    }
}

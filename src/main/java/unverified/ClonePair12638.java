package unverified;

public class ClonePair12638 {

    int method1(String string){
      int sex;
      if (string.equals("")) {
        sex=0;
      }
     else {
        sex=Integer.parseInt(string);
      }
      return sex;
    }

    int method2(String str){
      final int[] multipliers={1,60,3600,86400,31536000};
      String[] bits=str.split(":");
      int result=0;
      for (int i=0; i < bits.length; i++) {
        String bit=bits[bits.length - (i + 1)].trim();
        if (bit.length() > 0) {
          result+=multipliers[i] * Integer.parseInt(bit);
        }
      }
      return (result);
    }
}

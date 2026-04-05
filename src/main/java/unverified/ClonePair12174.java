package unverified;

public class ClonePair12174 {

    boolean method1(String p_valor){
      if (p_valor.length() != 9)   return false;
      if ("ABCDEFGHKLMNPQS".indexOf(p_valor.substring(0,1)) == -1)   return false;
      for (int i=1; i < 8; i++) {
        if ("0123456789".indexOf(p_valor.substring(i,i + 1)) == -1)     return false;
      }
      if ("ABCDEFGHIJ0123456789".indexOf(p_valor.substring(8,9)) == -1)   return false;
      int[] l_nums={0,2,4,6,8,1,3,5,7,9};
      char[] l_chars={'J','A','B','C','D','E','F','G','H','I'};
      int temp=0;
      for (int i=2; i <= 6; i+=2) {
        temp=temp + l_nums[Integer.parseInt(p_valor.substring(i - 1,i))];
        temp=temp + Integer.parseInt(p_valor.substring(i,i + 1));
      }
      temp=temp + l_nums[Integer.parseInt(p_valor.substring(7,8))];
      temp=(10 - (temp % 10));
      if (temp == 10)   temp=0;
      if (p_valor.substring(8,9).equals(String.valueOf(temp)) || p_valor.substring(8,9).equalsIgnoreCase(String.valueOf(l_chars[temp])))   return true;
      return false;
    }

    boolean method2(String hostName){
      int portSeparatorIdx=hostName.indexOf(':');
      if (portSeparatorIdx != -1) {
        hostName=hostName.substring(0,portSeparatorIdx);
      }
      char[] data=hostName.toCharArray();
      int hitDots=0;
      for (int i=0; i < data.length; i++) {
        char c=data[i];
        if (c < 48 || c > 57) {
          return false;
        }
        while (c != '.') {
          if (c < 48 || c > 57) {
            return false;
          }
          if (++i >= data.length) {
            break;
          }
          c=data[i];
        }
        hitDots++;
      }
      if (hitDots != 4 || hostName.endsWith(".")) {
        return false;
      }
      return true;
    }
}

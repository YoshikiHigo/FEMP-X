package unverified;

public class ClonePair12160 {

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

    boolean method2(String text){
      if (text.contains("年")) {
        String str[]=text.split("年");
        if (str.length > 2) {
          boolean b=true;
          for (int i=0; i < str.length; i++) {
            String s=str[i];
            if (i < str.length - 1) {
              if (!s.matches(".*([0-9]{2}|[0-9]{4})$")) {
                b=false;
                break;
              }
            }
          }
          if (b) {
            return true;
          }
        }
      }
     else {
        text=text.replaceAll("(([0-9]{2}|[0-9]{4})[-/.][0-9]{1,2}([-/.][0-9]{1,2})?)","#!#");
        int start=text.indexOf("#!#");
        if (start >= 0) {
          int second=text.indexOf("#!#",start + 1);
          if (second > 0) {
            return true;
          }
        }
      }
      return false;
    }
}

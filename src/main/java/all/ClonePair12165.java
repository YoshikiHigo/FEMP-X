package all;

public class ClonePair12165 {

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

    boolean method2(String ipAddress){
      boolean result=false;
      int oct1, oct2, oct3, oct4;
      int begin=0;
      int end=0;
      try {
        if ((end=ipAddress.indexOf(".")) >= 0) {
          oct1=Integer.parseInt(ipAddress.substring(begin,end));
          begin=end + 1;
          if ((end=ipAddress.indexOf(".",begin)) >= 0) {
            oct2=Integer.parseInt(ipAddress.substring(begin,end));
            begin=end + 1;
            if ((end=ipAddress.indexOf(".",begin)) >= 0) {
              oct3=Integer.parseInt(ipAddress.substring(begin,end));
              oct4=Integer.parseInt(ipAddress.substring(end + 1,ipAddress.length()));
              if (oct1 > 0 && oct1 <= 255)           if (oct2 >= 0 && oct2 <= 255)           if (oct3 >= 0 && oct3 <= 255)           if (oct4 >= 0 && oct4 <= 255)           result=true;
            }
          }
        }
      }
     catch (  NumberFormatException e) {
        result=false;
      }
      return result;
    }
}

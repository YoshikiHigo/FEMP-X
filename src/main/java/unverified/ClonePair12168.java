package unverified;

public class ClonePair12168 {

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

    boolean method2(String value){
      int periods=0;
      int i=0;
      int length=value.length();
      if (length > 15)   return false;
      char c=0;
      String word="";
      for (i=0; i < length; i++) {
        c=value.charAt(i);
        if (c == '.') {
          periods++;
          if (periods > 3)       return false;
          if (word == "")       return false;
          if (Integer.parseInt(word) > 255)       return false;
          word="";
        }
     else     if (!(Character.isDigit(c)))     return false;
     else {
          if (word.length() > 2)       return false;
          word+=c;
        }
      }
      if (word == "" || Integer.parseInt(word) > 255)   return false;
      if (periods != 3)   return false;
      return true;
    }
}

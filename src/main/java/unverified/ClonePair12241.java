package unverified;

public class ClonePair12241 {

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

    boolean method2(String str){
      String regEx="[a-z]*[A-Z]*[0-9]*";
      if (str.length() != 17) {
        return false;
      }
      if ((str.substring(2,3).equals(":")) && (str.substring(5,6).equals(":")) && (str.substring(8,9).equals(":"))&& (str.substring(11,12).equals(":"))&& (str.substring(14,15).equals(":"))) {
        if ((str.substring(0,2).replaceAll(regEx,"").length() == 0) && (str.substring(3,5).replaceAll(regEx,"").length() == 0) && (str.substring(6,8).replaceAll(regEx,"").length() == 0)&& (str.substring(9,11).replaceAll(regEx,"").length() == 0)&& (str.substring(12,14).replaceAll(regEx,"").length() == 0)&& (str.substring(15,17).replaceAll(regEx,"").length() == 0)) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        return false;
      }
    }
}

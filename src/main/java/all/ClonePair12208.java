package all;

public class ClonePair12208 {

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

    boolean method2(String id){
    switch (id.length()) {
    case 12:    try {
          Long.parseLong(id);
        }
     catch (    NumberFormatException e) {
          return false;
        }
      break;
    case 15:String[] idParts=id.split("-");
    if (idParts.length != 4) {
    return false;
    }
    for (String s : idParts) {
    if (s.length() != 3) {
    return false;
    }
    try {
    Long.parseLong(s);
    }
     catch (NumberFormatException e) {
    return false;
    }
    }
    break;
    default:return false;
    }
    return true;
    }
}

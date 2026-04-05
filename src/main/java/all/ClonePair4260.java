package all;

public class ClonePair4260 {

    boolean method1(String exStr,String str){
      int i;
      int j;
      for (i=0, j=0; i < exStr.length(); i++) {
        if (exStr.charAt(i) == '*') {
          return true;
        }
        if (j >= str.length()) {
          return false;
        }
        if (exStr.charAt(i) == '?') {
          j++;
          continue;
        }
     else     if (exStr.charAt(i) != str.charAt(j)) {
          return false;
        }
        j++;
      }
      if (j == str.length()) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String filter,String category){
      int index=-1;
      index=filter.indexOf("*");
      if (index == 0) {
        return true;
      }
     else   if (index < 0) {
        if (category.equals(filter)) {
          return true;
        }
      }
     else {
        if ((category.length() >= index) && category.substring(0,index).equals(filter.substring(0,index))) {
          return true;
        }
      }
      return false;
    }
}

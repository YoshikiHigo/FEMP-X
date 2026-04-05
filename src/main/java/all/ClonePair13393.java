package all;

import java.util.ArrayList;

public class ClonePair13393 {

    String[] method1(String s){
      ArrayList<String> r=new ArrayList<String>();
      boolean inStr=false;
      for (int i=0; i < s.length(); i++) {
        if (s.charAt(i) == '"' && (i == 0 || s.charAt(i - 1) != '\\')) {
          inStr=!inStr;
        }
        if (!inStr) {
          if (Character.isSpaceChar(s.charAt(i)) && i + 1 < s.length() && Character.isSpaceChar(s.charAt(i + 1))) {
            s=s.substring(0,i) + s.substring(i + 1);
            i--;
          }
     else       if (s.charAt(i) == ',') {
            r.add(s.substring(0,i).trim());
            s=s.substring(i + 1);
            i=0;
          }
        }
      }
      r.add(s.trim());
      String[] a=new String[0];
      return r.toArray(a);
    }

    String[] method2(String input){
      if (input.length() == 0) {
        return new String[]{""};
      }
      if (input.charAt(input.length() - 1) == ',') {
        String[] results=(input + " ").split(",");
        results[results.length - 1]="";
        return results;
      }
      return input.split(",");
    }
}

package all;

public class ClonePair4051 {

    boolean method1(String pattern,String value){
      boolean valid=true;
      if ((pattern == null) || (pattern.length() == 0)) {
        return true;
      }
      if ((value == null) || (value.length() == 0)) {
        return false;
      }
      if (value.length() != pattern.length()) {
        return false;
      }
      value=value.trim();
      char[] input=value.toCharArray();
      char[] fmtpattern=pattern.toCharArray();
      for (int i=0; i < fmtpattern.length; ++i) {
        if (fmtpattern[i] == 'A') {
          if (!(Character.isLetter(input[i]))) {
            valid=false;
          }
        }
     else     if (fmtpattern[i] == '9') {
          if (!(Character.isDigit(input[i]))) {
            valid=false;
          }
        }
     else     if (fmtpattern[i] == '#') {
          if ((!(Character.isDigit(input[i]))) && (!(Character.isLetter(input[i])))) {
            valid=false;
          }
        }
     else {
          if (!(fmtpattern[i] == input[i])) {
            valid=false;
          }
        }
      }
      return valid;
    }

    boolean method2(String pattern,String value){
      boolean valid=true;
      if (pattern == null || pattern.length() == 0) {
        return true;
      }
      if (value == null || value.length() == 0) {
        return false;
      }
      if (value.length() != pattern.length()) {
        return false;
      }
      value=value.trim();
      char[] input=value.toCharArray();
      char[] fmtpattern=pattern.toCharArray();
      for (int i=0; i < fmtpattern.length; ++i) {
        if (fmtpattern[i] == 'A') {
          if (!(Character.isLetter(input[i]))) {
            valid=false;
          }
        }
     else     if (fmtpattern[i] == '9') {
          if (!(Character.isDigit(input[i]))) {
            valid=false;
          }
        }
     else     if (fmtpattern[i] == '#') {
          if ((!(Character.isDigit(input[i]))) && (!(Character.isLetter(input[i])))) {
            valid=false;
          }
        }
     else {
          if (!(fmtpattern[i] == input[i])) {
            valid=false;
          }
        }
      }
      return valid;
    }
}

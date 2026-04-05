package all;

public class ClonePair6538 {

    boolean method1(String input,int min,int max){
      boolean check=false;
      if (input != null && min <= input.length() && input.length() <= max) {
        check=true;
      }
      return check;
    }

    boolean method2(String t,int min,int max){
      if (t == null) {
        return false;
      }
      int l=t.trim().length();
      return (l >= min && l <= max);
    }
}

package all;

public class ClonePair3682 {

    boolean method1(String _str,String _substr){
      boolean r=((_str != null) && (_substr != null));
      if (r)   r=(_str.indexOf(_substr) >= 0);
      return r;
    }

    boolean method2(String s1,String s2){
      if (s1 != null && s2 != null)   return s1.toLowerCase().indexOf(s2.toLowerCase()) >= 0;
     else   return false;
    }
}

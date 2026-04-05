package all;

public class ClonePair3683 {

    boolean method1(String _str,String _substr){
      boolean r=((_str != null) && (_substr != null));
      if (r)   r=(_str.indexOf(_substr) >= 0);
      return r;
    }

    boolean method2(String str,String segment){
      if ((str == null) || (segment == null))   return false;
      if (segment.length() == 0)   return true;
      return str.indexOf(segment) >= 0;
    }
}

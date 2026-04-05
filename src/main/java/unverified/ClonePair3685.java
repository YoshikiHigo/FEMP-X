package unverified;

public class ClonePair3685 {

    boolean method1(String _str,String _substr){
      boolean r=((_str != null) && (_substr != null));
      if (r)   r=(_str.indexOf(_substr) >= 0);
      return r;
    }

    boolean method2(String str,String searchStr){
      if ((str == null) || (searchStr == null)) {
        return false;
      }
      return str.indexOf(searchStr) >= 0;
    }
}

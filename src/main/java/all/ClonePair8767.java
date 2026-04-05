package all;

public class ClonePair8767 {

    Long method1(Long a,Long b){
      if (a == null || b == null) {
        return null;
      }
     else {
        return new Long(a.longValue() + b.longValue());
      }
    }

    Long method2(Long n1,Long n2){
      if (n1 == null || n2 == null)   return null;
      return n1 + n2;
    }
}

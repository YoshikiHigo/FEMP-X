package all;

public class ClonePair8179 {

    boolean method1(Object o){
      if (o == null) {
        return false;
      }
      return o == this || (this.getClass() == o.getClass() && o.hashCode() == this.hashCode());
    }

    boolean method2(Object object){
      if (object == null || !(this.getClass().isInstance(object))) {
        return false;
      }
     else {
        return this.hashCode() == object.hashCode();
      }
    }
}

package all;

import java.util.*;

public class ClonePair99 {

    boolean method1(List list,Object element){
      if (list != null) {
        if (!list.contains(element)) {
          return list.add(element);
        }
      }
      return false;
    }

    boolean method2(List target_,Object toAdd_){
      boolean addUnique=false;
      if (target_ != null) {
        if (!target_.contains(toAdd_)) {
          addUnique=target_.add(toAdd_);
        }
      }
      return addUnique;
    }
}

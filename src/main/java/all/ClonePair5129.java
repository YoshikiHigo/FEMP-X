package all;

import java.util.*;

public class ClonePair5129 {

    boolean method1(Set setA,Set setB){
      if (setA.size() != setB.size())   return false;
      for (  Object object : setB) {
        if (!setA.contains(object))     return false;
      }
      for (  Object object : setA) {
        if (!setB.contains(object))     return false;
      }
      return true;
    }

    boolean method2(Set first,Set second){
      if (first.size() != second.size()) {
        return false;
      }
      if (second.equals(first)) {
        return true;
      }
      return false;
    }
}

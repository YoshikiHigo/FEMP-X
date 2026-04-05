package all;

import java.util.ArrayList;
import java.util.List;

public class ClonePair4134 {

    List method1(List classSpecifications,List additionalClassSpecifications){
      if (additionalClassSpecifications != null) {
        if (classSpecifications == null) {
          classSpecifications=new ArrayList();
        }
        classSpecifications.addAll(additionalClassSpecifications);
      }
      return classSpecifications;
    }

    List method2(List param1,List param2){
      if (param1 != null) {
        if (param2 != null) {
          param1.addAll(param2);
          return param1;
        }
     else {
          return param1;
        }
      }
     else {
        return param2;
      }
    }
}

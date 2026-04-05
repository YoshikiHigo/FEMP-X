package all;

import java.util.*;

public class ClonePair9177 {

    String method1(List<String> names){
      String name=names.get(0);
      int index=name.indexOf("(");
      if (index != -1)   name=name.substring(0,index).trim();
      return name;
    }

    String method2(List<String> names){
      String name=names.get(0);
      int index=name.indexOf('(');
      if (index != -1)   name=name.substring(0,index).trim();
      return name;
    }
}

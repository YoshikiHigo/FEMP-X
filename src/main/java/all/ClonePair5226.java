package all;

import java.util.*;

public class ClonePair5226 {

    String method1(Properties config,String name,String defaultVal){
      String value=config.getProperty(name);
      if (value == null) {
        return defaultVal;
      }
      return value.trim();
    }

    String method2(Properties config,String name,String defaultVal){
      String value=config.getProperty(name);
      if (value == null) {
        value=defaultVal;
      }
      return value;
    }
}

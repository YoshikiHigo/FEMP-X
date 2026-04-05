package unverified;

public class ClonePair8969 {

    int method1(String port_,int defaultPort){
      int port=defaultPort;
      try {
        port=Integer.parseInt(port_);
      }
     catch (  NumberFormatException e) {
        System.err.println("Invalid port number, using default.");
      }
      if (port < 1 || port > 65535) {
        port=defaultPort;
        System.err.println("Invalid port number, using default.");
      }
      return port;
    }

    int method2(String strData,int defaultValue){
      int i=defaultValue;
      if (strData == null || strData.equals("")) {
        i=defaultValue;
      }
     else {
        try {
          i=Integer.parseInt(strData);
        }
     catch (    NumberFormatException e) {
          return defaultValue;
        }
      }
      return i;
    }
}

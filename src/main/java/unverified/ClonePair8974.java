package unverified;

public class ClonePair8974 {

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

    int method2(String v,int dflt){
      if (v != null) {
        try {
          dflt=Integer.decode(v).intValue();
        }
     catch (    Exception exc) {
        }
      }
      return dflt;
    }
}

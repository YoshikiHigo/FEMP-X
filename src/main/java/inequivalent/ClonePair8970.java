package inequivalent;

public class ClonePair8970 {

    int method1(String port_, int defaultPort) {
        int port = defaultPort;
        try {
            port = Integer.parseInt(port_);
        } catch (NumberFormatException e) {
            System.err.println("Invalid port number, using default.");
        }
        if (port < 1 || port > 65535) {
            port = defaultPort;
            System.err.println("Invalid port number, using default.");
        }
        return port;
    }

    int method2(String Str, int DefaultValue) {
        try {
            if (Str == null) return DefaultValue;
            if (Str.trim().length() == 0) return DefaultValue;
            String sValue = Str.replaceAll(",", "");
            sValue = sValue.trim();
            int dot = sValue.indexOf(".");
            if (dot > 0) sValue = sValue.substring(0, dot);
            return Integer.parseInt(sValue);
        } catch (Exception e) {
            return DefaultValue;
        }
    }
}

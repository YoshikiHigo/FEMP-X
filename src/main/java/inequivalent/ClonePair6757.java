package inequivalent;

public class ClonePair6757 {

    boolean method1(String ip, String ipRange) {
        if (ip == null) {
            System.out.println("ip null");
            return false;
        }
        if (ipRange == null) {
            System.out.println("ipRange null");
            return false;
        }
        String[] ipOctets = ip.split("\\.");
        String[] ipRangeOctets = ipRange.split("\\.");
        int octetIndex = 0;
        if (ipOctets.length != ipRangeOctets.length) {
            return false;
        }
        for (String octet : ipOctets) {
            if (!(ipRangeOctets[octetIndex].equals("*") || ipRangeOctets[octetIndex].equals("x") || ipRangeOctets[octetIndex].equals(octet))) {
                return false;
            }
            octetIndex += 1;
        }
        return true;
    }

    boolean method2(String nodeName, String pattern) {
        if (nodeName == null || pattern == null) return false;
        if (nodeName.equals(pattern)) return true;
        return pattern.equals("*");
    }
}

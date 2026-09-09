public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+ 1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1,logLine.indexOf(":") -1).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = logLine.substring(logLine.indexOf(":") +1).trim();
        String level = logLine.substring(1, logLine.indexOf("]")).trim().toLowerCase();

        return message + " (" + level + ")";
    }
}

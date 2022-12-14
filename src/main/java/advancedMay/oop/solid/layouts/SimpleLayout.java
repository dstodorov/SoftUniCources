package advancedMay.oop.solid.layouts;

import advancedMay.oop.solid.MessageLogger;

public class SimpleLayout implements Layout{


    @Override
    public String format(String timestamp, MessageLogger.ReportLevel reportLevel, String message) {
        return String.format("%s – %s – %s", timestamp, reportLevel, message);
    }
}

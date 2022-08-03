package advancedMay.oop.solid.layouts;

import advancedMay.oop.solid.MessageLogger;

public interface Layout {
    String format(String timestamp, MessageLogger.ReportLevel reportLevel, String message);
}

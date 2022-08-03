package advancedMay.oop.solid.appenders;

import advancedMay.oop.solid.MessageLogger;
import advancedMay.oop.solid.layouts.Layout;

public interface Appender {
    void append(String timestamp, MessageLogger.ReportLevel reportLevel, String message);
    Layout getLayout();
    int getMessagesCount();
}

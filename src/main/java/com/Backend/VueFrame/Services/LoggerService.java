package com.Backend.VueFrame.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class LoggerService {

    private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
    private static final Logger infoLogger = LoggerFactory.getLogger("infoLogger");
    private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");

    public void log(String level, String subject, String details) {
        String logMessage = String.format("Subject: %s, Details: %s", subject, details);

        switch (level.toLowerCase()) {
            case "e":
                errorLogger.error(logMessage);
                break;
            case "i":
                infoLogger.info(logMessage);
                break;
            case "d":
                debugLogger.debug(logMessage);
                break;
            default:
                infoLogger.info(logMessage);
                break;
        }
    }
}

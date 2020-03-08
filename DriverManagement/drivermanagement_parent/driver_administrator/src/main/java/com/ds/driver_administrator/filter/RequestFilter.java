package com.ds.driver_administrator.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class RequestFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}

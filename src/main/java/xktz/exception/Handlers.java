//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package xktz.exception;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Handlers {
    private static final Map<Class<? extends Exception>, ExceptionHandler<? extends Exception>> EXCEPTION_MAP = new ConcurrentHashMap();

    static {
        EXCEPTION_MAP.put(IOException.class, (obj, exception) -> {
            exception.printStackTrace();
        });
        EXCEPTION_MAP.put(Exception.class, (obj, exception) -> {
            exception.printStackTrace();
        });
    }

    public Handlers() {
    }

    public static void handle(ExceptionHandleable obj, Exception exception) {
        getExceptionHandler(exception).handle(obj, exception);
    }

    public static <T extends Exception> ExceptionHandler<? extends Exception> getExceptionHandler(T exception) {
        return EXCEPTION_MAP.containsKey(exception.getClass()) ? EXCEPTION_MAP.get(exception.getClass()) : EXCEPTION_MAP.get(Exception.class);
    }

    public static <T extends Exception, V extends ExceptionHandler<T>> void addExceptionHandler(T exception, V handler) {
        EXCEPTION_MAP.put(exception.getClass(), handler);
    }
}

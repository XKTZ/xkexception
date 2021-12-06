//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package xktz.exception;

public interface ExceptionHandleable {
    default void handle(Exception exception) {
        Handlers.handle(this, exception);
    }
}

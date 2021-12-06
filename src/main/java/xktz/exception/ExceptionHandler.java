//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package xktz.exception;

public interface ExceptionHandler<T extends Exception> {
    void handle(ExceptionHandleable handleable, Exception exception);
}

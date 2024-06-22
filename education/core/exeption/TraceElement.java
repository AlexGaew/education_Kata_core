package exeption;
/*
Получаю имя вызывашего класса и метода
 */
public class TraceElement {

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] s = new Exception().getStackTrace();
        if (s.length < 3) {
            return null;
        }
        return s[2].getClassName() + "#" + s[2].getMethodName();
    }
}

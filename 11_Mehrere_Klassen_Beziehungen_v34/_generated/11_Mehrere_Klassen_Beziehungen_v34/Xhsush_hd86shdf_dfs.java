import java.lang.reflect.Method; 
import java.lang.reflect.InvocationTargetException; 
import java.lang.IllegalAccessException; 
import java.io.PrintStream; 
class Xhsush_hd86shdf_dfs 
{
public static void main(String[] args) throws Throwable
{
try {
// setup print stream to add positions to output
System.setOut(new FiveCodePrintStream(System.out));
System.setErr(new PrintStream(System.err, true, "UTF-8"));
} catch(Exception e) {
System.err.println("Internal 5Code setup error. Please contact support.");
}
Method s = null;
try {
s = FiveCrush.class.getMethod("main", String[].class); 
} catch(Exception findMainException) {
System.err.println("Error: Main method not found in class FiveCrush, please define the main method as:");
System.err.println("   public static void main(String[] args)");
System.err.println("or a JavaFX application class must extend javafx.application.Application");
throw new Exception("Xhsush_hd86shdf_dfs");
} 
if (s != null) { 
try {
s.invoke(new Xhsush_hd86shdf_dfs(), (Object)args); 
} catch(IllegalAccessException illegalAccessException) {
} catch(InvocationTargetException ivocationException) {
throw ivocationException.getCause();
}
}
}
}
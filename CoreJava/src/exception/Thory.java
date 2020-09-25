/* Types of errors:-1.CompileTime(Sysntax Error's)(the compiler not generate .class file). 2.RunTimerError's(logical error's)*/
package exception; // the exceptions are java.lang package.
/*Excption:- is a RunTimeError.
 * Exception is an error which occur during exception of program.
 * exception occuers becoz of wrong input given to the program.
 * when ther is an exception your program excution is terminated.
 * to avoid abnormal termination of program we use exception handlers.
 * **every exception is one type of in java, these types are represented as class.
 * create an object of exception class and giving to jvm is called throwing exception.
 * A method create exception object and gives in to JVM.
 * ***************************************
 * Exception class Hierarchy/Throwable:- throwable's a main class of Error's & Exception's.
 * All excception classes are inherited from Throwable class.
 * Throwable class is having two types of subclasses.
 * 1.Error(the error's can't handle program) 2.Exception(exceptions can handele by program)
 * 1.Error-> likage error out of memory error.
 * 2.Exception-> 1.checked Exception(exception) 2.unchecked Excpetion(Runtime Exception).
 * 1.CheckedeException:-If method is throwing or if program is throwing checked exception it must handled before compiling program.If not handled compiler gives syntax error.
 * >ClassNotFoundException. >IOException. >FileNotFoundException. >EOFException
 * 2.UncheckedException:-Exception which is subtype of runtime exception is called unchecked Exception.
 * RUNTIME:->ArithmeticException(1/0),>ArrayIndexOutOfBound(0-10=11, i give 12),>NullPointerException(no value give end user),>NumberFormatException(give abc),>ArrayStoreException.
 * unchecked is not subject to compiletime checking.
 * if these exceptions are not handled compiler not gives Syntax error.
 * --------------------------------
 * Exception handlers:-1.default Exception handler 2.userdefined Exception handler
 * KEY WORDS BELONGS TO EXCEPTION HANDLING.
 * 1>try(risky code) 2>catch(handel the code)  3>throw(creating) 4>throws(forword/same as try) 5.finally(clean up code & all time excute).
 * 1>try  block:-the stmt which "throws" exception are included with in try block.
 * try block contain bussinessLogic.
 * 2>catch block:-is called exception handeler(or) user defined exception handler.
 * the exception thrown by try vblock is handled by catch block.
 * try block followed by one (or) more than one catch exception.*/public class Thory {

}

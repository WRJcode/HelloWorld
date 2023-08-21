package arvin.java.lang.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try{
            Class<?> personClass = Class.forName("arvin.java.lang.reflect.demo.Person");

            Constructor<?> constructor = personClass.getConstructor(String.class,int.class);

            Object person = constructor.newInstance("John Doe",30);

            Method sayHelloMethod = personClass.getMethod("sayHello");

            sayHelloMethod.invoke(person);
        } catch (ClassNotFoundException e){
            System.out.println("Class not found.");
        } catch (NoSuchMethodException e){
            System.out.println("Method not found.");
        } catch(InstantiationException | IllegalAccessException  | InvocationTargetException e){
            System.out.println("Error creating or invoking method.");
        }
    }
}

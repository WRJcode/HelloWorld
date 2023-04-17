package arvin.java.lang;

import arvin.java.custom.Boy;
import com.sun.javadoc.ParamTag;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@SuppressWarnings("ALL")
class ClassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isAnnotationPresent() {
    }

    @Test
    void getAnnotationsByType() {
    }

    @Test
    void getDeclaredAnnotation() {
    }

    @Test
    void getDeclaredAnnotationsByType() {
    }

    @Test
    void getTypeName() {
    }

    @Test
    void testToString() {
        System.out.println(int.class);
    }

    @Test
    void toGenericString() {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(Integer.class.toGenericString());
        System.out.println(integers.getClass().toGenericString());
        System.out.println(Runnable.class.toGenericString());
        System.out.println(int.class.toGenericString());
    }

    @Test
    void forName() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<ArrayList<Integer>> clazz = (Class<ArrayList<Integer>>) Class.forName("java.util.ArrayList");
        System.out.println(clazz);
        ArrayList<Integer> list = clazz.newInstance();
        list.add(1);
        System.out.println(list.get(0));
    }


    @Test
    void newInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            String s = (String) Class.forName("java.lang.String").newInstance();
            String i = String.class.newInstance();
            Boy boy = Boy.class.newInstance();


    }

    @Test
    void isInstance() {
        Integer i = 5;
        System.out.println(Integer.class.isInstance(i));
    }

    @Test
    void isAssignableFrom() throws ClassNotFoundException {
        Class<Number> numberClass = (Class<Number>) Class.forName("java.lang.Number");
        Class<Integer> integerClass = (Class<Integer>) Class.forName("java.lang.Integer");
        Class<String> clazz = (Class<String>) Class.forName("java.lang.String");
        System.out.println(numberClass.isAssignableFrom(clazz));
        System.out.println(integerClass.isAssignableFrom(numberClass));
        System.out.println(numberClass.isAssignableFrom(integerClass));

        Number number = 1;
        //Integer i = new Number();
    }

    @Test
    void isInterface() throws ClassNotFoundException {
        System.out.println(Class.forName("java.util.List").isInterface());
        System.out.println(Class.forName("java.util.ArrayList").isInterface());
    }

    @Test
    void isArray() {
        int[] ints = new int[5];
        Integer i = 5;
        System.out.println(ints.getClass().isArray());
        System.out.println(i.getClass().isArray());
    }

    @Test
    void isPrimitive() {
        System.out.println(Integer.class.isPrimitive());
        System.out.println(int.class.isPrimitive());
        System.out.println(void.class.isPrimitive());
    }

    @Test
    void isAnnotation() {
        System.out.println(ParamTag.class.isAnnotation());
        System.out.println(Test.class.isAnnotation());
        System.out.println(Test.class.isInterface());
        System.out.println(FunctionalInterface.class.isAnnotation());
        System.out.println(FunctionalInterface.class.isInterface());
    }

    @Test
    void isSynthetic() {
    }

    @Test
    void getName() {
        Integer i = 1;
        System.out.println("the class of " + i + " is " +
                i.getClass().getName());
    }

    @Test
    void getClassLoader() {
        Integer i = 1;
        ClassLoader cl = i.getClass().getClassLoader();
        System.out.println(cl);
    }

    @Test
    void getClassLoader0() {
    }

    @Test
    void getTypeParameters() {
    }

    @Test
    void getSuperclass() {
    }

    @Test
    void getGenericSuperclass() {
    }

    @Test
    void getPackage() {
    }

    @Test
    void getInterfaces() {
    }

    @Test
    void getComponentType() {
    }

    @Test
    void getModifiers() {
        System.out.println(Integer.class.getModifiers());
    }

    @Test
    void getSigners() {
    }

    @Test
    void setSigners() {
    }

    @Test
    void getEnclosingMethod() {
    }

    @Test
    void getEnclosingConstructor() {
    }

    @Test
    void getDeclaringClass() {
    }

    @Test
    void getEnclosingClass() {
    }

    @Test
    void getSimpleName() {
    }

    @Test
    void testGetTypeName() {
    }

    @Test
    void getCanonicalName() {
    }

    @Test
    void isAnonymousClass() {
    }

    @Test
    void isLocalClass() {
    }

    @Test
    void isMemberClass() {
    }

    @Test
    void getClasses() {
    }

    @Test
    void getFields() {
    }

    @Test
    void getMethods() {
    }

    @Test
    void getConstructors() {
    }

    @Test
    void getField() {
    }

    @Test
    void getMethod() {
    }

    @Test
    void getConstructor() {
    }

    @Test
    void getDeclaredClasses() {
    }

    @Test
    void getDeclaredFields() {
    }

    @Test
    void getDeclaredMethods() {
    }

    @Test
    void getDeclaredConstructors() {
    }

    @Test
    void getDeclaredField() {
    }

    @Test
    void getDeclaredMethod() {
    }

    @Test
    void getDeclaredConstructor() {
    }

    @Test
    void getResourceAsStream() {
    }

    @Test
    void getResource() {
    }

    @Test
    void getProtectionDomain() {
    }

    @Test
    void getPrimitiveClass() {
    }

    @Test
    void getRawAnnotations() {
    }

    @Test
    void getRawTypeAnnotations() {
    }

    @Test
    void getExecutableTypeAnnotationBytes() {
    }

    @Test
    void getConstantPool() {
    }

    @Test
    void desiredAssertionStatus() {
    }

    @Test
    void isEnum() {
    }

    @Test
    void getEnumConstants() {
    }

    @Test
    void getEnumConstantsShared() {
    }

    @Test
    void enumConstantDirectory() {
    }

    @Test
    void cast() {
    }

    @Test
    void asSubclass() {
    }

    @Test
    void getAnnotation() {
    }

    @Test
    void testIsAnnotationPresent() {
    }

    @Test
    void testGetAnnotationsByType() {
    }

    @Test
    void getAnnotations() {
    }

    @Test
    void testGetDeclaredAnnotation() {
    }

    @Test
    void testGetDeclaredAnnotationsByType() {
    }

    @Test
    void getDeclaredAnnotations() {
    }

    @Test
    void casAnnotationType() {
    }

    @Test
    void getAnnotationType() {
    }

    @Test
    void getDeclaredAnnotationMap() {
    }

    @Test
    void getAnnotatedSuperclass() {
    }

    @Test
    void getAnnotatedInterfaces() {
    }

    public static void main(String[] args) {
        Integer i = 4;
        Boy boy = new Boy("alvin",18);
        System.out.println(i.getClass().getClassLoader());
    }
}
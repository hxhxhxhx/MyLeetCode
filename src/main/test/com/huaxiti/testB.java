package com.huaxiti;
import com.huaxiti.LeetCode.ss;
import com.huaxiti.LeetCode100.lisi;
import com.huaxiti.login.Login;
import com.huaxiti.login.Student;
import com.huaxiti.login.zhangsan;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class testB {

    @Test
    public void test1(){
        zhangsan z = new zhangsan();
        lisi l = new lisi();
        Student ss = new Student();
        Student s1 = new lisi();
        Student s2 = new zhangsan();
        if(s1 instanceof lisi){

        }
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());

    }

    @Test
    public void test2(){
        TreeSet<Integer> integers = new TreeSet<>();
        HashSet<Integer> integers1 = new HashSet<Integer>();
    }


    @Test
    public void test3() throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);
        s.setId("111");
        zhangsan z = new zhangsan();
        Class<? extends Student> cl = s.getClass();
        String name = cl.getName();
        System.out.println(s);
        System.out.println(cl);
        System.out.println(name);
        Class<?> declaringClass = cl.getDeclaringClass();
        Class<?> componentType = cl.getComponentType();
        Student student = cl.newInstance();
        System.out.println(declaringClass);
        System.out.println(componentType);
        ArrayList<String> ss = new ArrayList<>();
        ss.add("dd");
        ss.add("dd1");
        int[] i = {1,2,3};
        System.out.println(i.getClass().isArray());
        System.out.println(ss.getClass().isArray());
        System.out.println(i.getClass().getDeclaringClass());
        System.out.println(z.getClass().getDeclaringClass());
        System.out.println(ss.getClass().getDeclaringClass());
        System.out.println(i.getClass().getComponentType());
        System.out.println(ss.getClass().getComponentType());
        //属性
        System.out.println("--------属性------------");
        Field[] fields = cl.getFields();
        Field[] declaredFields = cl.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(declaredFields));
        for (Field f : declaredFields){
            System.out.println(f);
            f.setAccessible(true);
            Object o = f.get(s);
            System.out.println(o);
        }
        //方法
        System.out.println("--------方法------------");
        Method[] methods = cl.getMethods();
        Method[] declaredMethods = cl.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(declaredMethods));
        for (Method m : methods){
            Class<?> returnType = m.getReturnType();
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            Class<?>[] parameterTypes = m.getParameterTypes();
            String name1 = m.getName();
            int modifiers = m.getModifiers();
            System.out.println(returnType);
            System.out.println(Arrays.toString(exceptionTypes));
            System.out.println(Arrays.toString(parameterTypes));
            System.out.println(name1);
            System.out.println(modifiers);
            if (m.getName().equals("setName")) {
                Object invoke = m.invoke(s,"lisi");
                System.out.println("invoke---"+invoke);
            }
            System.out.println("-----");
        }

        //构造
        System.out.println("--------构造------------");
        Constructor<?>[] constructors = cl.getConstructors();
        Constructor<?>[] declaredConstructors = cl.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));
        System.out.println(Arrays.toString(declaredConstructors));

    }

    @Test
    public void test4(){
        Student s = new Student();
        lisi l = new lisi();
        List<String> name = new ArrayList<>();
        name.add("aa");
        name.stream().map(Student::new);
        String n = "aaa";
        int i = 0;

    }

    @Test
    public void test5(){
        Stack<Object> objects = new Stack<>();
        char[][] matrix={{'0','1'},{'0','2'}};
        int i = 1,j = 1;
        System.out.println(Math.max(10, '5'));
        matrix[i][j] =
                (char) (Math.min(Math.min((int)matrix[i-1][j],(int)matrix[i][j-1]),(int)matrix[i-1][j-1]) +1);
    }
}

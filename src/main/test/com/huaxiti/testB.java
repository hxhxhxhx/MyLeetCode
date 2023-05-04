package com.huaxiti;
import com.huaxiti.LeetCode.ss;
import com.huaxiti.LeetCode100.lisi;
import com.huaxiti.login.Login;
import com.huaxiti.login.Student;
import com.huaxiti.login.zhangsan;
import org.apache.commons.lang3.StringUtils;
import okhttp3.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

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
        name.add("bb");
        String kString = name.toString();
        String key = kString.substring(1,kString.length()-1);
        System.out.println(key);

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


    @Test
    public void test6() throws IOException {
//        System.out.println(Arrays.toString(new OkHttpClient().getClass().getDeclaredFields()));
        System.out.println(getWorkScore("", "", ""));
    }
    private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public Map<String, Object> getWorkScore(String directions, String keywords, String content) throws IOException {
        Map<String, Object> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("directions", directions);
        map1.put("keywords", keywords);
        map1.put("content", content);
        Request request = new Request.Builder()
                .post(RequestBody.create(JSON, OBJECT_MAPPER.writeValueAsString(map1)))
                .header("authtoken","bingoenglish")
                .url("http://zju.axiaoyuan.com:8090/writing/judge")
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        OkHttpClient build = okHttpClient.newBuilder().build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            if (response.body() != null) {
                String bodyStr = response.body().string();
//                log.info("getWorkScore[{}] response: {}", response.request().url().query(), bodyStr);
                //获取成功
                HashMap<String,Object> hashMap = new ObjectMapper().readValue(bodyStr, HashMap.class);
                HashMap data = (HashMap)hashMap.get("data");
                if(data.get("score") != null && data.get("remark") != null){
                    return data;
                }
            }
//                log.error("getWorkScore request error, path: {}, code: {}, body: {}",
//                        request.url().query(), response.code(), response.body().string());
                return map;

        }
    }
}

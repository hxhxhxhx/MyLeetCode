package test.jichu;

import java.lang.reflect.Field;
import java.util.*;

public class testInstanceOf {
    public static void main(String[] args) throws IllegalAccessException {
        School sc = new School();
        sc.setId("1");
        sc.setName("zz");
        Info info = new Info();
        info.setAddr("sh");
        info.setInfoEnum(InfoEnum.START);
        info.setNum(4);
        Info info1 = new Info();
        info1.setAddr("hz");
        info1.setInfoEnum(InfoEnum.END);
        info1.setNum(3);
        sc.setInfo(info);
        sc.setExamIdList(new ArrayList<String>(){{add("33");add("44");}});
        sc.setInfoList(new ArrayList<Info>(){{add(info);add(info1);}});
//        HashMap<String, Object> stringObjectHashMap = objectToMap(sc);
//        System.out.println(stringObjectHashMap);
        System.out.println(convertObjectToMap(sc));


        isParamEmpty("ss",info,new ArrayList<Integer>(){{add(1);add(2);}},2);
    }

    public static HashMap<String,Object> objectToMap(Object sc) throws IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();
        Field[] fields = sc.getClass().getDeclaredFields();
        for (Field f : fields){
            f.setAccessible(true);
            if (f.get(sc) != null && f.get(sc) instanceof Info){
                map.put(f.getName(), objectToMap(f.get(sc)));
            }else {
                map.put(f.getName(), f.get(sc));
            }
        }
        return map;
    }

    public static Map<String, Object> convertObjectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(obj);
            if (fieldValue == null) {
                map.put(fieldName, null);
            } else if (isPrimitive(field.getType()) || fieldValue instanceof Enum) {
                map.put(fieldName, fieldValue);
            } else if (fieldValue instanceof List) {
                List<Object> list = new ArrayList<>();
                for (Object element : (List<?>) fieldValue) {
                    if (isPrimitive(element.getClass())) {
                        list.add(element);
                    } else {
                        list.add(convertObjectToMap(element));
                    }
                }
                map.put(fieldName, list);
            } else {
                map.put(fieldName, convertObjectToMap(fieldValue));
            }
        }
        return map;
    }

    private static boolean isPrimitive(Class<?> clazz) {
        return clazz.isPrimitive() || clazz == Boolean.class || clazz == Character.class
                || clazz == Byte.class || clazz == Short.class || clazz == Integer.class
                || clazz == Long.class || clazz == Float.class || clazz == Double.class
                || clazz == String.class;
    }

    private static void isParamEmpty(Object... params) throws IllegalAccessException {
        for (Object o : params){
            System.out.println(params.getClass());
            for (Field declaredField : params.getClass().getDeclaredFields()) {
                declaredField.setAccessible(true);
                Object value = declaredField.get(params);
                if(value instanceof String){
                    System.out.println("string");
                }
            }

            System.out.println(Arrays.toString(params.getClass().getDeclaredFields()));
            System.out.println(params.getClass().getName());
        }

    }


}

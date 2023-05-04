package test.jichu;

/**
 * 在switch(expression)中，expression只能是一个整数表达式或者枚举常量，整数表达式可以是int类型或Integer包装类型。
 * 由于，byte，short，char都可以隐式转换为int类型，所以，这些类型也可以用作表达式。
 * 另外jdk7以后，switch表达式也可以为String类型，
 * byte、short、char、int、String
 */
public class testSwitch {
    public static void main(String[] args) {
        int a = 1;
        short b = 1;
        char c = '1';
        String d = "jjjj";
        byte e = '1';

        switch (e){
            case '2':
                System.out.println("true");
                break;
            case '1':
                System.out.println("false");
                break;
        }

        switch (d){
            case "ffff":
                System.out.println("false");
            case "jjjj":
                System.out.println("true");
        }
    }
}

package home_work_8;

import java.lang.reflect.Constructor;

public class MainForTester_1_2 {
    public static void main(final String[] args) throws Exception {
        Constructor<Tester_1> constructor = Tester_1.class.getDeclaredConstructor();
        constructor.setAccessible(true); //Мы во время выполнения программы сами себе разрешим доступ.
        Tester_1 tester = constructor.newInstance();
        System.out.println(tester.countSalary());
    }
}


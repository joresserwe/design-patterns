package me.designpattern._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        // Reflection
        SettingsV5 setting1 = SettingsV5.getInstance();
        Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV5 setting2 = constructor.newInstance(); // 새로운 Instance
        System.out.println(setting1 == setting2);

        // 직렬화 역직렬화
        SettingsV5 setting3 = SettingsV5.getInstance();
        SettingsV5 setting4;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(setting3);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            setting4 = (SettingsV5) in.readObject();
        }
        System.out.println(setting3 == setting4);

    }
}

package com.epam.ssha.matrix.util;

/**
 * Created by aika-ssha on 08.10.2016.
 *
 * My first steps on java
 * for learning OOP concepts, language basics, code styles and etc.
 *
 * This is package for operations on matrices, like addition and transposition
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    public static PropertyManager propertyManager = new PropertyManager();
    private final Properties properties;
    InputStream inputStream;

    private PropertyManager() {
        properties = new Properties();
        InputStream in = PropertyManager.class.getClassLoader().getResourceAsStream("data.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }
}
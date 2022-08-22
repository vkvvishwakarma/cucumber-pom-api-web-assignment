package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    /**
     * Load the properties file from config properties file
     * @return properties object as prop
     */
    public Properties init_prop(){
        prop = new Properties();
        try {
            FileInputStream fpIn = new FileInputStream("./src/test/resources/config/properties/config.properties");
            try {
                prop.load(fpIn);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return prop;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.nosql.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author dimitrioskolovos
 */
public class NoSqlConfig {
    private static final String PROPERTIES_FILE = "/nosql.properties"; // rename as needed

    public static <C> C createClient(ClientBuilder<C> builder) {
        Properties props = new Properties();
        try (InputStream is = NoSqlConfig.class.getResourceAsStream(PROPERTIES_FILE)) {
            if (is == null) {
                throw new RuntimeException("Could not find " + PROPERTIES_FILE + " on classpath");
            }
            props.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load NoSQL properties from " + PROPERTIES_FILE, e);
        }
        return builder.build(props);
    }

    public interface ClientBuilder<C> {
        C build(Properties properties);
    }
}

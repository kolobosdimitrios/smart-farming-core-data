/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.rdb.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author dimitrioskolovos
 */
public class RdbConfig {
    
    private static final String PROPERTIES_FILE = "/rdb.properties";

    /**
     * Loads database and Hibernate settings, then builds the EntityManagerFactory.
     * @return a thread-safe EntityManagerFactory for JPA operations
     */
    public static EntityManagerFactory createEntityManagerFactory() {
        Properties props = new Properties();
        try (InputStream is = RdbConfig.class.getResourceAsStream(PROPERTIES_FILE)) {
            if (is == null) {
                throw new RuntimeException("Could not find " + PROPERTIES_FILE + " on classpath");
            }
            props.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load RDB properties from " + PROPERTIES_FILE, e);
        }

        // The persistence unit name (matches persistence.xml if used)
        String puName = props.getProperty("persistence.unit.name", "smart-farming-pu");

        // Create and return the EntityManagerFactory
        return Persistence.createEntityManagerFactory(puName, props);
    }
}

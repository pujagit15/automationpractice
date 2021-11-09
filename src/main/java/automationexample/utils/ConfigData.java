package automationexample.utils;

import java.io.*;
import java.util.Properties;

public class ConfigData {

     private Properties properties;
    public String workingDir;


    public ConfigData(){
            //BufferedReader reader;
        workingDir = System.getProperty("user.dir");
        String propertyFilePath = "\\src\\test\\resources\\properties\\local.properties";
        try {
            FileInputStream reader= new FileInputStream(workingDir+propertyFilePath);
                //reader = new BufferedReader(new FileReader(propertyFilePath));
                properties = new Properties();
                try {
                    properties.load(reader);
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
            }
        }

        public String resultPath(){
            String resultPath = properties.getProperty("Results.Dir");
            if(resultPath!= null) return resultPath;
            else throw new RuntimeException("Result path not specified in the Configuration.properties file.");
        }

        public long getImplicitlyWait() {
            String implicitlyWait = properties.getProperty("implicitlyWait");
            if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
            else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
        }

        public String getApplicationUrl() {
            String url = properties.getProperty("base.url");
            if(url != null) return url;
            else throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
}

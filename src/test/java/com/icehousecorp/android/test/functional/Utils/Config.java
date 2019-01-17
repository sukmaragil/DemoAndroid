package com.icehousecorp.android.test.functional.Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Config {
    public static void saveTempJson(String jsonText, String filename) {
        BufferedWriter writer = null;

        try {
            //create a temporary file
            String file = System.getProperty("user.dir") + "//target//" + filename;
            File logFile = new File(file);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            PrintWriter writer1 = new PrintWriter((file));
            writer1.print("");
            writer1.close();
            writer.write(jsonText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}

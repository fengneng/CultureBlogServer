package com.zy.cultureblog.Utils;

import org.springframework.util.ResourceUtils;

import java.io.*;

public class Util {

    static public String readFile(String sourceLocationme) {
        try {
            File file = ResourceUtils.getFile(sourceLocationme);

            if(file.exists()){
                if(file != null){
                    InputStream inputStream = null;
                    BufferedReader br = null;
                    inputStream = new FileInputStream(file);
                    br = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null)
                    {
                        sb.append(line);
                    }
                    System.out.println(sb.toString());

                    return sb.toString();
                }
            }

        } catch (Exception e) {
            return "";
        }

        return "";
    }
}

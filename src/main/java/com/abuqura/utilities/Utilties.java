/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abuqura.utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author abuqura
 */
public class Utilties {
    
    public static String httpGetData(String url) {
        try {
            
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet(url);
            StringBuilder buff = new StringBuilder();
            HttpResponse response = client.execute(request);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity()
                    .getContent()));
            String line = "";
            while ((line = rd.readLine()) != null) {
                buff.append(line);
            }
            return buff.toString();
            
        } catch (Exception e) {
            System.err.println(e);
            return "";
            
        }
    }
    
    public static String prepareURL(String url, String city, String startDate, String endDate) {
        
        return url.replace("#CITY#", city).replace("#STARTDATE#", startDate).replace("#ENDDATE#", endDate);
    }
    
}

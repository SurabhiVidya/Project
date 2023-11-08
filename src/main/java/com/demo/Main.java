package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.swing.text.html.HTMLDocument;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.demo.Customer;


import static java.nio.file.Files.readAllBytes;

public class Main {

    public static void main(String[] args) throws IOException {

        //read json file data
        byte[] jsonData = readAllBytes(Paths.get("/Users/vidyasurabhi/Documents/json/src/main/java/com/demo/Customer.json"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json to object
        Customer cus = objectMapper.readValue(jsonData, Customer.class);

        System.out.println("customer Object is\n" + cus);

        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        //convert Object to json
        JsonNode jsonNode = objectMapper.valueToTree(cus);


        Map<String, String> address = cus.getAddress();


        for (Map.Entry<String, String> entry : address.entrySet()) {

            if (entry.getKey().equals("city")) {
                String city = entry.getValue();
                ObjectNode objectNode = (ObjectNode) jsonNode;

                objectNode.put(entry.getKey(), entry.getValue());
            }

            if(entry.getKey().equals("zipcode")){
                int zipcode = (Integer.valueOf(entry.getValue()));
                ObjectNode objectNode = (ObjectNode) jsonNode;
                objectNode.put(entry.getKey() , entry.getValue());
                System.out.println("object is "+objectNode.get(0));

            }


//            List<String> cities = cus.getCities();
//             for(String s : cities){
//                 if(entry.getKey().equals("cities")){
//                     ObjectNode objectNode = (ObjectNode) jsonNode;
//                     objectNode.put(entry.getKey() , entry.getValue());
//                 }





            //Address address = cus.getAddress();

//        if (jsonNode instanceof ObjectNode) {
//            ObjectNode objectNode = (ObjectNode) jsonNode;
//
//             objectNode.put("city", address.getCity());
//             objectNode.put("zipcode",address.getZipcode());
//        }

        }

//        List<String> cities =cus.getCities();
//        for(String ci: cities){
//            if(entry.getKey.equals("cities")){
//                ObjectNode objectNode = (ObjectNode) jsonNode;
//                objectNode.put(entry.getKey(),entry.getValue());
//            }
//            cus.setCities(ci);
//        }

        System.out.println("Customer JSON is\n" + jsonNode);
    }
}


//        if (address != null) {
//            System.out.println("City: " + address.getCity());
//            System.out.println("Zip Code: " + address.getZipcode());
//        }
// System.out.println("Customer Object is :\n"+cus.getCities());

//            for(String s:cus.getCities()){
//                System.out.println("yes"+s);
//            }
// Map<String , String> s = cus.getAddress();
//for(String s :cus.getAddress().keySet())
//System.out.println("cus:" +s);

//           objectNode.put("Address" ,s.getAddress());
//           objectNode.put("email", "xyz@gmail.com");
//           objectNode.put("phone num", "27689486489");}
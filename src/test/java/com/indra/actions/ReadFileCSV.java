package com.indra.actions;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFileCSV {    private BufferedReader reader;
    private String line;
    private String parts[]= null;
    public ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> readFile(String rutaArchivo){
        try {
            reader = new BufferedReader(new FileReader(rutaArchivo));
            while((line = reader.readLine())!=null){
                parts = line.split(";");
                ArrayList<String> temporaryData = new ArrayList<>();
                for (String d: parts){
                    temporaryData.add(d);
                }
                data.add(temporaryData);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return data;
    }
    public String extractResponseInformation(String response){
        String buscarLlaveInicio= "ah_id:";
        int posicion1= response.trim().indexOf(buscarLlaveInicio)+buscarLlaveInicio.length();
        int posicion2= posicion1+5;
        String token=response.substring(posicion1,posicion2).trim();
        return token;
    }
    public String getToken(){
        String response = readFile(".\\src\\test\\resources\\config_data\\ShoppingBag.log").toString();
        System.out.println(countTokens(response));
        return countTokens(response);//extractResponseInformation(response);
    }
    public String countTokens(String response){
        int posicion=0;
        int contadorPalabras=0;
        String token="";
        String palabra = "ah_id:";// busca el label para poder definir si es postago o prepago
        posicion = response.indexOf(palabra);
        while (posicion!=-1){
            contadorPalabras++;
            token=response.substring(posicion+6,posicion+11).trim();
            posicion=response.indexOf(palabra,posicion+1);
        }
    return token;
    }
}
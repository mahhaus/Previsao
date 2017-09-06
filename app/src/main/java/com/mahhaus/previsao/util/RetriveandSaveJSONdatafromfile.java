package com.mahhaus.previsao.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by josias on 05/09/17 - 13:57.
 */

public class RetriveandSaveJSONdatafromfile {
//    public static String objectToFile(Object object) throws IOException {
//        String path = Environment.getExternalStorageDirectory() + File.separator + "/AppName/App_cache" + File.separator;
//        File dir = new File(path);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        path += "data";
//        File data = new File(path);
//        if (!data.createNewFile()) {
//            data.delete();
//            data.createNewFile();
//        }
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(data));
//        objectOutputStream.writeObject(object);
//        objectOutputStream.close();
//        return path;
//    }
//
//    public static Object objectFromFile(String filename, Context context) throws IOException, ClassNotFoundException {
//        Object object = null;
//        AssetManager manager = context.getAssets();
//        InputStream file = manager.open(filename);
//
//        if(file != null) {
//            ObjectInputStream objectInputStream = new ObjectInputStream(file);
//            object = objectInputStream.readObject();
//            objectInputStream.close();
//        }
//        return object;
//    }
//
//    private void writeToFile(String data ) {
//        try {
//            OutputStreamWriter outputStreamWriter =  new OutputStreamWriter(openFileOutput("config.txt", Context.MODE_PRIVATE));
//            outputStreamWriter.write(data);
//            outputStreamWriter.close();
//        }
//        catch (IOException e) {
//            Log.e("Exception", "File write failed: " + e.toString());
//        }
//    }
//
//    public static String readFromFile(String filename, Context context) {
//
//        String ret = "";
//
//        try {
//            AssetManager manager = context.getAssets();
//
//            InputStream inputStream = manager.open(filename);
//
//            if ( inputStream != null ) {
//                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//                String receiveString = "";
//                StringBuilder stringBuilder = new StringBuilder();
//
//                while ( (receiveString = bufferedReader.readLine()) != null ) {
//                    stringBuilder.append(receiveString);
//
//                    if (receiveString.contains("},")){
////                        var strObj = stringBuilder.toString().replace("[","".replace("},", "}"))
////                        stringBuilder.delete(0, stringBuilder.length());
////                        var gson = Gson()
////                        var staff = gson.fromJson(strObj, City::class.java)
//                    }
//                }
//
//                inputStream.close();
//                ret = stringBuilder.toString();
//            }
//        }
//        catch (FileNotFoundException e) {
//            Log.e("login activity", "File not found: " + e.toString());
//        } catch (IOException e) {
//            Log.e("login activity", "Can not read file: " + e.toString());
//        }
//
//        return ret;
//    }
//
//    public static String AssetJSONFile (String filename, Context context) throws IOException {
//        AssetManager manager = context.getAssets();
//        InputStream file = manager.open(filename);
//        byte[] formArray = new byte[file.available()];
//        file.read(formArray);
//        file.close();
//
//        return new String(formArray);
//    }
}

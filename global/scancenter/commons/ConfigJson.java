/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.util.Log;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import org.json.JSONException;
/*    */ import org.json.JSONObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConfigJson
/*    */ {
/*    */   private static final String TAG = "ConfigJson";
/*    */   
/*    */   public ConfigJson() {
/* 21 */     parseJson();
/*    */   }
/*    */ 
/*    */   
/*    */   private void parseJson() {
/* 26 */     StringBuilder sb = new StringBuilder();
/*    */     
/*    */     try {
/* 29 */       FileInputStream fis = new FileInputStream(new File(SCGlobal.DEVICE_CONFIG_FILE));
/*    */       
/* 31 */       BufferedReader br = new BufferedReader(new InputStreamReader(fis));
/*    */       
/* 33 */       String txt = "";
/*    */       
/*    */       try {
/* 36 */         while ((txt = br.readLine()) != null)
/*    */         {
/* 38 */           sb.append(txt);
/*    */         }
/*    */       }
/* 41 */       catch (IOException e) {
/*    */         
/* 43 */         e.printStackTrace();
/*    */       }
/*    */     
/* 46 */     } catch (FileNotFoundException e) {
/*    */       
/* 48 */       e.printStackTrace();
/*    */     } 
/*    */ 
/*    */     
/*    */     try {
/* 53 */       JSONObject obj = new JSONObject(sb.toString());
/* 54 */       String name = obj.getString("name");
/* 55 */       int age = obj.getInt("age");
/*    */       
/* 57 */       Log.e("ConfigJson", "=== name:" + name + ", age:" + age);
/*    */     }
/* 59 */     catch (JSONException e) {
/*    */       
/* 61 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\ConfigJson.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
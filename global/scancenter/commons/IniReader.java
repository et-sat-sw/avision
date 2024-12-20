/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.FileReader;
/*    */ import java.io.IOException;
/*    */ import java.util.HashMap;
/*    */ import java.util.Properties;
/*    */ 
/*    */ public class IniReader
/*    */ {
/* 11 */   private HashMap<String, Properties> sections = null;
/* 12 */   private String secion = "";
/* 13 */   private Properties properties = null;
/*    */ 
/*    */   
/*    */   public IniReader(String filename) throws IOException {
/* 17 */     this.sections = new HashMap<String, Properties>();
/*    */     
/* 19 */     BufferedReader reader = new BufferedReader(new FileReader(filename));
/* 20 */     read(reader);
/* 21 */     reader.close();
/*    */   }
/*    */ 
/*    */   
/*    */   private void read(BufferedReader reader) throws IOException {
/* 26 */     String line = "";
/* 27 */     while ((line = reader.readLine()) != null)
/*    */     {
/* 29 */       parseLine(line);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private void parseLine(String line) {
/* 35 */     line = line.trim();
/* 36 */     if (true == line.matches("\\[.*\\]")) {
/*    */       
/* 38 */       this.secion = line.replaceFirst("\\[(.*)\\]", "$1");
/* 39 */       this.properties = new Properties();
/* 40 */       this.sections.put(this.secion, this.properties);
/*    */     }
/* 42 */     else if (true == line.matches(".*=.*")) {
/*    */       
/* 44 */       if (this.properties != null) {
/*    */         
/* 46 */         int i = line.indexOf('=');
/* 47 */         String name = line.substring(0, i);
/* 48 */         String value = line.substring(i + 1);
/* 49 */         this.properties.setProperty(name, value);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String getValue(String section, String name) {
/* 56 */     Properties p = this.sections.get(section);
/* 57 */     if (null == p)
/*    */     {
/* 59 */       return null;
/*    */     }
/*    */ 
/*    */     
/* 63 */     String value = p.getProperty(name);
/* 64 */     return value;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\IniReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
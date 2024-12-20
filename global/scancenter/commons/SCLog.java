/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.annotation.SuppressLint;
/*    */ import android.util.Log;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCLog
/*    */ {
/* 16 */   private static final String LogPath = SCGlobal.PATH_LOG_FILE;
/*    */ 
/*    */   
/*    */   public static void i(String tag, String msg) {
/* 20 */     Log.i(tag, msg);
/* 21 */     log2File(tag, msg, "I");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void w(String tag, String msg) {
/* 26 */     Log.w(tag, msg);
/* 27 */     log2File(tag, msg, "W");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void d(String tag, String msg) {
/* 32 */     Log.d(tag, msg);
/* 33 */     log2File(tag, msg, "D");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void e(String tag, String msg) {
/* 38 */     Log.e(tag, msg);
/* 39 */     log2File(tag, msg, "E");
/*    */   }
/*    */ 
/*    */   
/*    */   public static void v(String tag, String msg) {
/* 44 */     Log.v(tag, msg);
/* 45 */     log2File(tag, msg, "V");
/*    */   }
/*    */   
/*    */   @SuppressLint({"SimpleDateFormat"})
/*    */   private static void log2File(String tag, String msg, String lvl) {}
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SCLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_InputCheck
/*    */ {
/*    */   public static final int PARAMETERS_FAILED = -2;
/*    */   public static final int PARAMETERS_NULL = -1;
/*    */   public static final int NONE = 0;
/*    */   public static final int EXCEED_ALLOW_LIMIT = 1;
/*    */   public static final int USB_DISK_NOT_FOUND = 2;
/*    */   
/*    */   public static int EmailReceiverLimit(int size) {
/* 15 */     if (size < 0)
/* 16 */       return -2; 
/* 17 */     if (size > 20)
/* 18 */       return 1; 
/* 19 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_InputCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
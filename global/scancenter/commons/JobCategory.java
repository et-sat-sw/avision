/*    */ package global.scancenter.commons;
/*    */ 
/*    */ public enum JobCategory
/*    */ {
/*  5 */   Default(0),
/*  6 */   CopyDefault(1),
/*  7 */   EmailDefault(2),
/*  8 */   FilingDefault(3),
/*  9 */   FilingProfile(4),
/* 10 */   Shortcut_Copy(5),
/* 11 */   Shortcut_Email(6),
/* 12 */   Shortcut_Filing(7),
/* 13 */   Shortcut_USB(8),
/* 14 */   Shortcut_HD(9),
/* 15 */   Shortcut_Cloud(10),
/* 16 */   FaxDefault(11),
/* 17 */   IdCardDefault(12),
/* 18 */   CSA6Default(13),
/* 19 */   TicketDefault(14),
/* 20 */   NormalCopyDefault(14);
/*    */ 
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   JobCategory(int numVal) {
/* 27 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 32 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static JobCategory findValueByCode(int code) {
/* 37 */     for (JobCategory v : values()) {
/*    */       
/* 39 */       if (v.getCode() == code)
/* 40 */         return v; 
/*    */     } 
/* 42 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\JobCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
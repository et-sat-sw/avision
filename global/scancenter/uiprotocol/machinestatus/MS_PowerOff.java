/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_PowerOff
/*    */ {
/*  5 */   IMMEDIATELY(65535),
/*  6 */   MIN_5(5),
/*  7 */   MIN_15(15),
/*  8 */   MIN_30(30),
/*  9 */   HOUR_1(60),
/* 10 */   HOUR_2(120),
/* 11 */   HOUR_4(240),
/* 12 */   DISABLE(0);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_PowerOff(int numVal) {
/* 18 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 23 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_PowerOff findValueByCode(int code) {
/* 28 */     for (MS_PowerOff v : values()) {
/*    */       
/* 30 */       if (v.getCode() == code)
/* 31 */         return v; 
/*    */     } 
/* 33 */     return DISABLE;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PowerOff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
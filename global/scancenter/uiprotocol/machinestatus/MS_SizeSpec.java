/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_SizeSpec
/*    */ {
/*  5 */   MACHINE_ISO_216(0), MACHINE_NORTH_AMERICA(1);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_SizeSpec(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_SizeSpec findValueByCode(int code) {
/* 21 */     for (MS_SizeSpec v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_SizeSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
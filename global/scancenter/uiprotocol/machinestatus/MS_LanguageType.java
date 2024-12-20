/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_LanguageType
/*    */ {
/*  5 */   ENGLISH(0),
/*  6 */   TRADITIONAL_CHINESE(1),
/*  7 */   SIMPLIFIED_CHINESE(2),
/*  8 */   French(3),
/*  9 */   German(4),
/* 10 */   Italian(5),
/* 11 */   Dutch(6),
/* 12 */   Swedish(7),
/* 13 */   Spanish(8),
/* 14 */   Portuguese(9),
/* 15 */   Turkish(10),
/* 16 */   Greek(11),
/* 17 */   Polish(12),
/* 18 */   Hungarian(13),
/* 19 */   Czech(14),
/* 20 */   Russian(15),
/* 21 */   Finnish(16),
/* 22 */   Norwegian(17),
/* 23 */   Danish(18),
/* 24 */   Japanese(19),
/* 25 */   Slovak(20),
/* 26 */   Hebrew(21),
/* 27 */   Kazakh(32);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_LanguageType(int numVal) {
/* 33 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 38 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_LanguageType findValueByCode(int code) {
/* 43 */     for (MS_LanguageType v : values()) {
/*    */       
/* 45 */       if (v.getCode() == code)
/* 46 */         return v; 
/*    */     } 
/* 48 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_LanguageType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
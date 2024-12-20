/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ 
/*    */ public enum UIP_DropNTakeStatus
/*    */ {
/*  6 */   ADF_PAPER_IN(4096, "Wait for next scanning"),
/*  7 */   THUMBS_READY(8192, "Thumbnail image is ready"),
/*  8 */   NON_PREVIEW_READY(12288, "Ready for show select options."),
/*  9 */   PAGE_INFO_READY(16384, "Ready for page information.");
/*    */   
/*    */   private int _numVal;
/*    */   
/*    */   private String _description;
/*    */   
/*    */   UIP_DropNTakeStatus(int numVal, String description) {
/* 16 */     this._numVal = numVal;
/* 17 */     this._description = description;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 22 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDescription() {
/* 27 */     return this._description;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_DropNTakeStatus findValueByCode(int value) {
/* 32 */     for (UIP_DropNTakeStatus v : values()) {
/*    */       
/* 34 */       if (v.getCode() == value)
/* 35 */         return v; 
/*    */     } 
/* 37 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_DropNTakeStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
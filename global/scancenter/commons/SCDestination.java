/*    */ package global.scancenter.commons;
/*    */ 
/*    */ public enum SCDestination
/*    */ {
/*  5 */   None(-1),
/*  6 */   Copy(0),
/*  7 */   Email(1),
/*  8 */   FTP(2),
/*  9 */   CIFS(3),
/* 10 */   USB(4),
/* 11 */   PublicFolder(5),
/* 12 */   AwipApp(6),
/* 13 */   Dropbox(7),
/* 14 */   Evernote(8),
/* 15 */   Cloud(9),
/* 16 */   GoogleDrive(10),
/* 17 */   LocalStorage(11),
/* 18 */   IdCardCopy(12),
/* 19 */   StorageCopy(13),
/* 20 */   StoragePrint(14),
/* 21 */   Custom_Copy(15),
/* 22 */   IdCardCopy_CSA6(16),
/* 23 */   Fax(17),
/* 24 */   SecurityFax(18),
/* 25 */   DropNTake(19),
/* 26 */   Application(20),
/* 27 */   SecurityCopy(21),
/* 28 */   TicketCopy(22),
/* 29 */   NormalCopy(23),
/* 30 */   ScanToExternal(24);
/*    */ 
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   SCDestination(int numVal) {
/* 37 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 42 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static SCDestination findValueByCode(int code) {
/* 47 */     for (SCDestination v : values()) {
/*    */       
/* 49 */       if (v.getCode() == code)
/* 50 */         return v; 
/*    */     } 
/* 52 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public static SCDestination findValueByName(String name) {
/* 57 */     for (SCDestination v : values()) {
/*    */       
/* 59 */       if (v.name().equals(name))
/* 60 */         return v; 
/*    */     } 
/* 62 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SCDestination.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
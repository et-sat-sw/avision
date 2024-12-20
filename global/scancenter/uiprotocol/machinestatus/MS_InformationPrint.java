/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ public class MS_InformationPrint
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public String operator;
/*    */   public MS_LanguageType language;
/*    */   public MS_ReportPrintType reportPrintType;
/*    */   
/*    */   public MS_InformationPrint() {
/* 15 */     this.operator = "";
/* 16 */     this.language = MS_LanguageType.ENGLISH;
/* 17 */     this.reportPrintType = MS_ReportPrintType.STORAGE_LIST_REPORT;
/*    */   }
/*    */ 
/*    */   
/*    */   MS_InformationPrint(Parcel in) {
/* 22 */     this.operator = in.readString();
/* 23 */     this.language = MS_LanguageType.valueOf(in.readString());
/* 24 */     this.reportPrintType = MS_ReportPrintType.valueOf(in.readString());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 30 */     out.writeString(this.operator);
/* 31 */     out.writeString((this.language == null) ? "" : this.language.name());
/* 32 */     out.writeString((this.reportPrintType == null) ? "" : this.reportPrintType.name());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 38 */     return 0;
/*    */   }
/*    */   
/* 41 */   public static final Parcelable.Creator<MS_InformationPrint> CREATOR = new Parcelable.Creator<MS_InformationPrint>()
/*    */     {
/*    */       public MS_InformationPrint createFromParcel(Parcel p)
/*    */       {
/* 45 */         return new MS_InformationPrint(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_InformationPrint[] newArray(int size) {
/* 50 */         return new MS_InformationPrint[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 58 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_InformationPrint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
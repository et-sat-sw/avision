/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class EmailInfo implements Parcelable, Cloneable {
/*    */   public int id;
/*    */   
/*    */   public EmailInfo() {
/* 10 */     this.name = "";
/* 11 */     this.email = "";
/* 12 */     this.faxNumber = "";
/* 13 */     this.description = "";
/* 14 */     this.seppdDial = "";
/* 15 */     this.owner = SCGlobal.adminID;
/*    */   }
/*    */ 
/*    */   
/*    */   public String name;
/*    */   
/*    */   public String email;
/*    */   public String faxNumber;
/*    */   public String seppdDial;
/*    */   public String description;
/*    */   public int owner;
/*    */   
/*    */   EmailInfo(Parcel in) {
/* 28 */     this.id = in.readInt();
/* 29 */     this.name = in.readString();
/* 30 */     this.email = in.readString();
/* 31 */     this.faxNumber = in.readString();
/* 32 */     this.seppdDial = in.readString();
/* 33 */     this.description = in.readString();
/* 34 */     this.owner = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 40 */     out.writeInt(this.id);
/* 41 */     out.writeString(this.name);
/* 42 */     out.writeString(this.email);
/* 43 */     out.writeString(this.faxNumber);
/* 44 */     out.writeString(this.seppdDial);
/* 45 */     out.writeString(this.description);
/* 46 */     out.writeInt(this.owner);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 52 */     return 0;
/*    */   }
/*    */   
/* 55 */   public static final Parcelable.Creator<EmailInfo> CREATOR = new Parcelable.Creator<EmailInfo>()
/*    */     {
/*    */       public EmailInfo createFromParcel(Parcel p)
/*    */       {
/* 59 */         return new EmailInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public EmailInfo[] newArray(int size) {
/* 64 */         return new EmailInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 71 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\EmailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
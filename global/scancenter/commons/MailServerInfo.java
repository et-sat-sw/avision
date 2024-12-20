/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ public class MailServerInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String ServerUrl;
/*    */   public int Port;
/*    */   public int Sport;
/*    */   public String LoginName;
/*    */   public String Password;
/*    */   public boolean EnableAuth;
/*    */   public int EncryptType;
/*    */   
/*    */   public MailServerInfo() {
/* 19 */     this.ServerUrl = "10.1.90.155";
/* 20 */     this.Port = 25;
/* 21 */     this.LoginName = "";
/* 22 */     this.Password = "";
/* 23 */     this.EnableAuth = false;
/* 24 */     this.EncryptType = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   MailServerInfo(Parcel in) {
/* 29 */     this.ServerUrl = in.readString();
/* 30 */     this.Port = in.readInt();
/* 31 */     this.Sport = in.readInt();
/* 32 */     this.LoginName = in.readString();
/* 33 */     this.Password = in.readString();
/* 34 */     this.EnableAuth = (in.readByte() != 0);
/* 35 */     this.EncryptType = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 41 */     out.writeString(this.ServerUrl);
/* 42 */     out.writeInt(this.Port);
/* 43 */     out.writeInt(this.Sport);
/* 44 */     out.writeString(this.LoginName);
/* 45 */     out.writeString(this.Password);
/* 46 */     out.writeByte((byte)(this.EnableAuth ? 1 : 0));
/* 47 */     out.writeInt(this.EncryptType);
/*    */   }
/*    */   
/* 50 */   public static final Parcelable.Creator<MailServerInfo> CREATOR = new Parcelable.Creator<MailServerInfo>()
/*    */     {
/*    */       public MailServerInfo createFromParcel(Parcel p)
/*    */       {
/* 54 */         return new MailServerInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MailServerInfo[] newArray(int size) {
/* 59 */         return new MailServerInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 66 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\MailServerInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
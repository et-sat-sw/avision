/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class LdapSearchInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String authName;
/*    */   public String password;
/*    */   public String keyword;
/*    */   public String server;
/*    */   public int port;
/*    */   public String baseDN;
/*    */   public Boolean useAnonymous;
/*    */   public String[] nameList;
/*    */   public String[] mailList;
/*    */   public String domain;
/*    */   public int authtype;
/*    */   public String searchRoot;
/*    */   public String searchAttribute;
/*    */   public int timeout;
/*    */   public int searchAuthtype;
/*    */   
/*    */   public LdapSearchInfo() {
/* 26 */     this.authName = "";
/* 27 */     this.password = "";
/* 28 */     this.keyword = "";
/* 29 */     this.server = "";
/* 30 */     this.port = 389;
/* 31 */     this.baseDN = "";
/* 32 */     this.useAnonymous = Boolean.valueOf(false);
/* 33 */     this.nameList = new String[1];
/* 34 */     this.mailList = new String[1];
/* 35 */     this.domain = "";
/* 36 */     this.authtype = 0;
/* 37 */     this.searchRoot = "";
/* 38 */     this.searchAttribute = "";
/* 39 */     this.timeout = 0;
/* 40 */     this.searchAuthtype = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   LdapSearchInfo(Parcel in) {
/* 45 */     this.authName = in.readString();
/* 46 */     this.password = in.readString();
/* 47 */     this.keyword = in.readString();
/* 48 */     this.server = in.readString();
/* 49 */     this.port = in.readInt();
/* 50 */     this.baseDN = in.readString();
/* 51 */     this.useAnonymous = Boolean.valueOf((in.readByte() == 1));
/* 52 */     this.nameList = in.createStringArray();
/* 53 */     this.mailList = in.createStringArray();
/* 54 */     this.domain = in.readString();
/* 55 */     this.authtype = in.readInt();
/* 56 */     this.searchRoot = in.readString();
/* 57 */     this.searchAttribute = in.readString();
/* 58 */     this.timeout = in.readInt();
/* 59 */     this.searchAuthtype = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flag) {
/* 65 */     out.writeString(this.authName);
/* 66 */     out.writeString(this.password);
/* 67 */     out.writeString(this.keyword);
/* 68 */     out.writeString(this.server);
/* 69 */     out.writeInt(this.port);
/* 70 */     out.writeString(this.baseDN);
/* 71 */     out.writeByte((byte)(this.useAnonymous.booleanValue() ? 1 : 0));
/* 72 */     out.writeStringArray(this.nameList);
/* 73 */     out.writeStringArray(this.mailList);
/* 74 */     out.writeString(this.domain);
/* 75 */     out.writeInt(this.authtype);
/* 76 */     out.writeString(this.searchRoot);
/* 77 */     out.writeString(this.searchAttribute);
/* 78 */     out.writeInt(this.timeout);
/* 79 */     out.writeInt(this.searchAuthtype);
/*    */   }
/*    */   
/* 82 */   public static final Parcelable.Creator<LdapSearchInfo> CREATOR = new Parcelable.Creator<LdapSearchInfo>()
/*    */     {
/*    */       public LdapSearchInfo createFromParcel(Parcel p)
/*    */       {
/* 86 */         return new LdapSearchInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public LdapSearchInfo[] newArray(int size) {
/* 91 */         return new LdapSearchInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 98 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\LdapSearchInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
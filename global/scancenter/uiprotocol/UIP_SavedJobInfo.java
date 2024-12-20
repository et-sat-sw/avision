/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_SavedJobInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int id;
/*    */   public String name;
/*    */   public int security;
/*    */   public int paper_size;
/*    */   public int page_count;
/*    */   public String file_format;
/*    */   public int file_count;
/*    */   public int job_count;
/*    */   public int year;
/*    */   public int month;
/*    */   public int day;
/*    */   public int hour;
/*    */   public int minute;
/*    */   public int second;
/*    */   public int reserved;
/*    */   
/*    */   public UIP_SavedJobInfo() {
/* 28 */     this.file_format = "JPEG";
/*    */   }
/*    */ 
/*    */   
/*    */   UIP_SavedJobInfo(Parcel in) {
/* 33 */     this.id = in.readInt();
/* 34 */     this.name = in.readString();
/* 35 */     this.security = in.readInt();
/* 36 */     this.paper_size = in.readInt();
/* 37 */     this.page_count = in.readInt();
/* 38 */     this.file_format = in.readString();
/* 39 */     this.file_count = in.readInt();
/* 40 */     this.job_count = in.readInt();
/* 41 */     this.year = in.readInt();
/* 42 */     this.month = in.readInt();
/* 43 */     this.day = in.readInt();
/* 44 */     this.hour = in.readInt();
/* 45 */     this.minute = in.readInt();
/* 46 */     this.second = in.readInt();
/* 47 */     this.reserved = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 53 */     out.writeInt(this.id);
/* 54 */     out.writeString(this.name);
/* 55 */     out.writeInt(this.security);
/* 56 */     out.writeInt(this.paper_size);
/* 57 */     out.writeInt(this.page_count);
/* 58 */     out.writeString(this.file_format);
/* 59 */     out.writeInt(this.file_count);
/* 60 */     out.writeInt(this.job_count);
/* 61 */     out.writeInt(this.year);
/* 62 */     out.writeInt(this.month);
/* 63 */     out.writeInt(this.day);
/* 64 */     out.writeInt(this.hour);
/* 65 */     out.writeInt(this.minute);
/* 66 */     out.writeInt(this.second);
/* 67 */     out.writeInt(this.reserved);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 73 */     return 0;
/*    */   }
/*    */   
/* 76 */   public static final Parcelable.Creator<UIP_SavedJobInfo> CREATOR = new Parcelable.Creator<UIP_SavedJobInfo>()
/*    */     {
/*    */       public UIP_SavedJobInfo createFromParcel(Parcel p)
/*    */       {
/* 80 */         return new UIP_SavedJobInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_SavedJobInfo[] newArray(int size) {
/* 85 */         return new UIP_SavedJobInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 93 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_SavedJobInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
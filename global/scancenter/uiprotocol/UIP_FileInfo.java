/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_FileInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int id;
/*    */   public String name;
/*    */   public String file_format;
/*    */   public int file_size;
/*    */   public int year;
/*    */   public int month;
/*    */   public int day;
/*    */   public int hour;
/*    */   public int minute;
/*    */   public int second;
/*    */   public int reserved;
/*    */   
/*    */   public UIP_FileInfo() {
/* 24 */     this.file_format = "JPEG";
/*    */   }
/*    */ 
/*    */   
/*    */   UIP_FileInfo(Parcel in) {
/* 29 */     this.id = in.readInt();
/* 30 */     this.name = in.readString();
/* 31 */     this.file_format = in.readString();
/* 32 */     this.file_size = in.readInt();
/* 33 */     this.year = in.readInt();
/* 34 */     this.month = in.readInt();
/* 35 */     this.day = in.readInt();
/* 36 */     this.hour = in.readInt();
/* 37 */     this.minute = in.readInt();
/* 38 */     this.second = in.readInt();
/* 39 */     this.reserved = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 45 */     out.writeInt(this.id);
/* 46 */     out.writeString(this.name);
/* 47 */     out.writeString(this.file_format);
/* 48 */     out.writeInt(this.file_size);
/* 49 */     out.writeInt(this.year);
/* 50 */     out.writeInt(this.month);
/* 51 */     out.writeInt(this.day);
/* 52 */     out.writeInt(this.hour);
/* 53 */     out.writeInt(this.minute);
/* 54 */     out.writeInt(this.second);
/* 55 */     out.writeInt(this.reserved);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 61 */     return 0;
/*    */   }
/*    */   
/* 64 */   public static final Parcelable.Creator<UIP_FileInfo> CREATOR = new Parcelable.Creator<UIP_FileInfo>()
/*    */     {
/*    */       public UIP_FileInfo createFromParcel(Parcel p)
/*    */       {
/* 68 */         return new UIP_FileInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_FileInfo[] newArray(int size) {
/* 73 */         return new UIP_FileInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 81 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_FileInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
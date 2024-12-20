/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class IpFilterInfo implements Parcelable, Cloneable {
/*    */   public int id;
/*    */   
/*    */   public IpFilterInfo() {
/* 10 */     this.name = "";
/* 11 */     this.start_ip = "";
/* 12 */     this.end_ip = "";
/*    */   }
/*    */ 
/*    */   
/*    */   public String name;
/*    */   
/*    */   public String start_ip;
/*    */   public String end_ip;
/*    */   
/*    */   public IpFilterInfo(Parcel in) {
/* 22 */     this.id = in.readInt();
/* 23 */     this.name = in.readString();
/* 24 */     this.start_ip = in.readString();
/* 25 */     this.end_ip = in.readString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 31 */     out.writeInt(this.id);
/* 32 */     out.writeString(this.name);
/* 33 */     out.writeString(this.start_ip);
/* 34 */     out.writeString(this.end_ip);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 40 */     return 0;
/*    */   }
/*    */   
/* 43 */   public static final Parcelable.Creator<IpFilterInfo> CREATOR = new Parcelable.Creator<IpFilterInfo>()
/*    */     {
/*    */       public IpFilterInfo createFromParcel(Parcel p)
/*    */       {
/* 47 */         return new IpFilterInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public IpFilterInfo[] newArray(int size) {
/* 52 */         return new IpFilterInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 59 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\IpFilterInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_DateTime
/*    */   implements Parcelable
/*    */ {
/*    */   public int year;
/*    */   public int month;
/*    */   public int day;
/*    */   public int hour;
/*    */   public int minute;
/*    */   public int second;
/*    */   
/*    */   public UIP_DateTime() {}
/*    */   
/*    */   UIP_DateTime(Parcel in) {
/* 23 */     this.year = in.readInt();
/* 24 */     this.month = in.readInt();
/* 25 */     this.day = in.readInt();
/* 26 */     this.hour = in.readInt();
/* 27 */     this.minute = in.readInt();
/* 28 */     this.second = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 34 */     out.writeInt(this.year);
/* 35 */     out.writeInt(this.month);
/* 36 */     out.writeInt(this.day);
/* 37 */     out.writeInt(this.hour);
/* 38 */     out.writeInt(this.minute);
/* 39 */     out.writeInt(this.second);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 45 */     return 0;
/*    */   }
/*    */   
/* 48 */   public static final Parcelable.Creator<UIP_DateTime> CREATOR = new Parcelable.Creator<UIP_DateTime>()
/*    */     {
/*    */       public UIP_DateTime createFromParcel(Parcel p)
/*    */       {
/* 52 */         return new UIP_DateTime(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_DateTime[] newArray(int size) {
/* 57 */         return new UIP_DateTime[size];
/*    */       }
/*    */     };
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_DateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
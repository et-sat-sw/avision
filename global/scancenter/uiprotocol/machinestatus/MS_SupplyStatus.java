/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ public class MS_SupplyStatus
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int tonerRemain;
/*    */   public int epRemain;
/*    */   public int drumRemain;
/*    */   public int fuserRemain;
/*    */   
/*    */   public MS_SupplyStatus() {
/* 16 */     this.tonerRemain = 1;
/* 17 */     this.epRemain = 1;
/* 18 */     this.fuserRemain = 1;
/* 19 */     this.drumRemain = 1;
/*    */   }
/*    */ 
/*    */   
/*    */   MS_SupplyStatus(Parcel in) {
/* 24 */     this.tonerRemain = in.readInt();
/* 25 */     this.epRemain = in.readInt();
/* 26 */     this.fuserRemain = in.readInt();
/* 27 */     this.drumRemain = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 33 */     out.writeInt(this.tonerRemain);
/* 34 */     out.writeInt(this.epRemain);
/* 35 */     out.writeInt(this.fuserRemain);
/* 36 */     out.writeInt(this.drumRemain);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 42 */     return 0;
/*    */   }
/*    */   
/* 45 */   public static final Parcelable.Creator<MS_SupplyStatus> CREATOR = new Parcelable.Creator<MS_SupplyStatus>()
/*    */     {
/*    */       public MS_SupplyStatus createFromParcel(Parcel p)
/*    */       {
/* 49 */         return new MS_SupplyStatus(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_SupplyStatus[] newArray(int size) {
/* 54 */         return new MS_SupplyStatus[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 62 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_SupplyStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
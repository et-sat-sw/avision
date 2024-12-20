/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MS_StorageCapacity
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int totalSize;
/*    */   public int availableSize;
/*    */   
/*    */   public MS_StorageCapacity() {}
/*    */   
/*    */   MS_StorageCapacity(Parcel in) {
/* 19 */     this.totalSize = in.readInt();
/* 20 */     this.availableSize = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 26 */     out.writeInt(this.totalSize);
/* 27 */     out.writeInt(this.availableSize);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 33 */     return 0;
/*    */   }
/*    */   
/* 36 */   public static final Parcelable.Creator<MS_StorageCapacity> CREATOR = new Parcelable.Creator<MS_StorageCapacity>()
/*    */     {
/*    */       public MS_StorageCapacity createFromParcel(Parcel p)
/*    */       {
/* 40 */         return new MS_StorageCapacity(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_StorageCapacity[] newArray(int size) {
/* 45 */         return new MS_StorageCapacity[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 53 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_StorageCapacity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
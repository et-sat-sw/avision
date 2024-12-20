/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MS_NetworkSettings
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public MS_NetworkSettings() {}
/*    */   
/*    */   MS_NetworkSettings(Parcel in) {}
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {}
/*    */   
/*    */   public int describeContents() {
/* 28 */     return 0;
/*    */   }
/*    */   
/* 31 */   public static final Parcelable.Creator<MS_NetworkSettings> CREATOR = new Parcelable.Creator<MS_NetworkSettings>()
/*    */     {
/*    */       public MS_NetworkSettings createFromParcel(Parcel p)
/*    */       {
/* 35 */         return new MS_NetworkSettings(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_NetworkSettings[] newArray(int size) {
/* 40 */         return new MS_NetworkSettings[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 48 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_NetworkSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
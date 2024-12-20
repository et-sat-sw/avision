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
/*    */ public class MS_DeviceSettings
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public MS_DeviceSettings() {}
/*    */   
/*    */   MS_DeviceSettings(Parcel in) {}
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {}
/*    */   
/*    */   public int describeContents() {
/* 28 */     return 0;
/*    */   }
/*    */   
/* 31 */   public static final Parcelable.Creator<MS_DeviceSettings> CREATOR = new Parcelable.Creator<MS_DeviceSettings>()
/*    */     {
/*    */       public MS_DeviceSettings createFromParcel(Parcel p)
/*    */       {
/* 35 */         return new MS_DeviceSettings(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_DeviceSettings[] newArray(int size) {
/* 40 */         return new MS_DeviceSettings[size];
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


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_DeviceSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
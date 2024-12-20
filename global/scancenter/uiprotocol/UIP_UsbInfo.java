/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_UsbInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int id;
/*    */   public String name;
/*    */   public int isFileOrFolder;
/*    */   
/*    */   public UIP_UsbInfo() {}
/*    */   
/*    */   UIP_UsbInfo(Parcel in) {
/* 21 */     this.id = in.readInt();
/* 22 */     this.name = in.readString();
/* 23 */     this.isFileOrFolder = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 29 */     out.writeInt(this.id);
/* 30 */     out.writeString(this.name);
/* 31 */     out.writeInt(this.isFileOrFolder);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 37 */     return 0;
/*    */   }
/*    */   
/* 40 */   public static final Parcelable.Creator<UIP_UsbInfo> CREATOR = new Parcelable.Creator<UIP_UsbInfo>()
/*    */     {
/*    */       public UIP_UsbInfo createFromParcel(Parcel p)
/*    */       {
/* 44 */         return new UIP_UsbInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_UsbInfo[] newArray(int size) {
/* 49 */         return new UIP_UsbInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 57 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_UsbInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
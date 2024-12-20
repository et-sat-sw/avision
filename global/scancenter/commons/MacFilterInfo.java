/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class MacFilterInfo implements Parcelable, Cloneable {
/*    */   public int id;
/*    */   
/*    */   public MacFilterInfo() {
/* 10 */     this.name = "";
/* 11 */     this.mac_addr = "";
/*    */   }
/*    */ 
/*    */   
/*    */   public String name;
/*    */   
/*    */   public String mac_addr;
/*    */   
/*    */   MacFilterInfo(Parcel in) {
/* 20 */     this.id = in.readInt();
/* 21 */     this.name = in.readString();
/* 22 */     this.mac_addr = in.readString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 28 */     out.writeInt(this.id);
/* 29 */     out.writeString(this.name);
/* 30 */     out.writeString(this.mac_addr);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 36 */     return 0;
/*    */   }
/*    */   
/* 39 */   public static final Parcelable.Creator<MacFilterInfo> CREATOR = new Parcelable.Creator<MacFilterInfo>()
/*    */     {
/*    */       public MacFilterInfo createFromParcel(Parcel p)
/*    */       {
/* 43 */         return new MacFilterInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MacFilterInfo[] newArray(int size) {
/* 48 */         return new MacFilterInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 55 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\MacFilterInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
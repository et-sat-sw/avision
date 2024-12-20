/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ public class GroupInfo implements Parcelable, Cloneable {
/*    */   public int id;
/*    */   
/*    */   public GroupInfo() {
/* 10 */     this.name = "";
/* 11 */     this.emailIdList = null;
/* 12 */     this.description = "";
/* 13 */     this.owner = SCGlobal.adminID;
/*    */   }
/*    */ 
/*    */   
/*    */   public String name;
/*    */   
/*    */   public int[] emailIdList;
/*    */   
/*    */   public String description;
/*    */   public int owner;
/*    */   
/*    */   GroupInfo(Parcel in) {
/* 25 */     this.id = in.readInt();
/* 26 */     this.name = in.readString();
/* 27 */     this.emailIdList = in.createIntArray();
/* 28 */     this.description = in.readString();
/* 29 */     this.owner = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 35 */     out.writeInt(this.id);
/* 36 */     out.writeString(this.name);
/* 37 */     out.writeIntArray(this.emailIdList);
/* 38 */     out.writeString(this.description);
/* 39 */     out.writeInt(this.owner);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 45 */     return 0;
/*    */   }
/*    */   
/* 48 */   public static final Parcelable.Creator<GroupInfo> CREATOR = new Parcelable.Creator<GroupInfo>()
/*    */     {
/*    */       public GroupInfo createFromParcel(Parcel p)
/*    */       {
/* 52 */         return new GroupInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public GroupInfo[] newArray(int size) {
/* 57 */         return new GroupInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 64 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\GroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
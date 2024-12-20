/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import global.scancenter.commons.SCDestination;
/*    */ 
/*    */ 
/*    */ public class UIP_ActiveJobInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int id;
/*    */   public String name;
/*    */   public UIP_JobType type;
/*    */   public UIP_OwnerType owner;
/*    */   public UIP_JobState state;
/*    */   public UIP_DateTime dateTime;
/*    */   public int reserved;
/*    */   public SCDestination gDestination;
/*    */   public int iScanPageCount;
/*    */   public int iPrintPageCount;
/*    */   
/*    */   public UIP_ActiveJobInfo() {
/* 23 */     this.id = 0;
/* 24 */     this.name = "";
/* 25 */     this.type = UIP_JobType.COLOR_COPY;
/* 26 */     this.owner = UIP_OwnerType.LOCAL;
/* 27 */     this.state = UIP_JobState.UNKNOWN;
/* 28 */     this.dateTime = new UIP_DateTime();
/* 29 */     this.reserved = 0;
/* 30 */     this.gDestination = SCDestination.None;
/* 31 */     this.iScanPageCount = 0;
/* 32 */     this.iPrintPageCount = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   UIP_ActiveJobInfo(Parcel in) {
/* 37 */     this.id = in.readInt();
/* 38 */     this.name = in.readString();
/* 39 */     this.type = UIP_JobType.valueOf(in.readString());
/* 40 */     this.owner = UIP_OwnerType.valueOf(in.readString());
/* 41 */     this.state = UIP_JobState.valueOf(in.readString());
/* 42 */     this.dateTime = (UIP_DateTime)in.readParcelable(UIP_DateTime.class.getClassLoader());
/* 43 */     this.reserved = in.readInt();
/* 44 */     this.gDestination = SCDestination.valueOf(in.readString());
/* 45 */     this.iScanPageCount = in.readInt();
/* 46 */     this.iPrintPageCount = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 52 */     out.writeInt(this.id);
/* 53 */     out.writeString(this.name);
/* 54 */     out.writeString((this.type == null) ? "" : this.type.name());
/* 55 */     out.writeString((this.owner == null) ? "" : this.owner.name());
/* 56 */     out.writeString((this.state == null) ? "" : this.state.name());
/* 57 */     out.writeParcelable(this.dateTime, flags);
/* 58 */     out.writeInt(this.reserved);
/* 59 */     out.writeString((this.gDestination == null) ? "" : this.gDestination.name());
/* 60 */     out.writeInt(this.iScanPageCount);
/* 61 */     out.writeInt(this.iPrintPageCount);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 67 */     return 0;
/*    */   }
/*    */   
/* 70 */   public static final Parcelable.Creator<UIP_ActiveJobInfo> CREATOR = new Parcelable.Creator<UIP_ActiveJobInfo>()
/*    */     {
/*    */       public UIP_ActiveJobInfo createFromParcel(Parcel p)
/*    */       {
/* 74 */         return new UIP_ActiveJobInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_ActiveJobInfo[] newArray(int size) {
/* 79 */         return new UIP_ActiveJobInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 87 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_ActiveJobInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_CompletedJobInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int id;
/*    */   public String name;
/*    */   public UIP_JobType type;
/*    */   public UIP_OwnerType owner;
/*    */   public UIP_CompletedState state;
/*    */   public String stDateTime;
/*    */   public String ctDateTime;
/*    */   public int reserved;
/*    */   public int errCode;
/*    */   
/*    */   public UIP_CompletedJobInfo() {
/* 23 */     this.id = 0;
/* 24 */     this.name = "";
/* 25 */     this.type = UIP_JobType.COLOR_COPY;
/* 26 */     this.owner = UIP_OwnerType.LOCAL;
/* 27 */     this.state = UIP_CompletedState.COMPLETED;
/* 28 */     this.stDateTime = "";
/* 29 */     this.ctDateTime = "";
/* 30 */     this.reserved = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   UIP_CompletedJobInfo(Parcel in) {
/* 35 */     this.id = in.readInt();
/* 36 */     this.name = in.readString();
/* 37 */     this.type = UIP_JobType.valueOf(in.readString());
/* 38 */     this.owner = UIP_OwnerType.valueOf(in.readString());
/* 39 */     this.state = UIP_CompletedState.valueOf(in.readString());
/* 40 */     this.stDateTime = in.readString();
/* 41 */     this.ctDateTime = in.readString();
/* 42 */     this.reserved = in.readInt();
/* 43 */     this.errCode = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 49 */     out.writeInt(this.id);
/* 50 */     out.writeString(this.name);
/* 51 */     out.writeString((this.type == null) ? "" : this.type.name());
/* 52 */     out.writeString((this.owner == null) ? "" : this.owner.name());
/* 53 */     out.writeString((this.state == null) ? "" : this.state.name());
/* 54 */     out.writeString(this.stDateTime);
/* 55 */     out.writeString(this.ctDateTime);
/* 56 */     out.writeInt(this.reserved);
/* 57 */     out.writeInt(this.errCode);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 63 */     return 0;
/*    */   }
/*    */   
/* 66 */   public static final Parcelable.Creator<UIP_CompletedJobInfo> CREATOR = new Parcelable.Creator<UIP_CompletedJobInfo>()
/*    */     {
/*    */       public UIP_CompletedJobInfo createFromParcel(Parcel p)
/*    */       {
/* 70 */         return new UIP_CompletedJobInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_CompletedJobInfo[] newArray(int size) {
/* 75 */         return new UIP_CompletedJobInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 83 */     return super.clone();
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_CompletedJobInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
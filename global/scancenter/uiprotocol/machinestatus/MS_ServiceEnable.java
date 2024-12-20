/*     */ package global.scancenter.uiprotocol.machinestatus;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Log;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MS_ServiceEnable
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public SE_State Copy;
/*     */   public SE_State Email;
/*     */   public SE_State Scan;
/*     */   public SE_State Fax;
/*     */   public SE_State StorageCopy;
/*     */   public SE_State IDCardCopy;
/*     */   public SE_State DropNTake;
/*     */   public SE_State ReprintSavedJob;
/*     */   public SE_State CSA6;
/*     */   public SE_State Fast_Copy;
/*     */   public SE_State Ticket_Copy;
/*     */   public SE_State Cloud_Print;
/*     */   public SE_State Normal_Copy;
/*     */   public SE_State Plug_In;
/*     */   
/*     */   public MS_ServiceEnable() {}
/*     */   
/*     */   MS_ServiceEnable(Parcel in) {
/*  31 */     this.Copy = SE_State.findValueByCode(in.readInt());
/*  32 */     this.Email = SE_State.findValueByCode(in.readInt());
/*  33 */     this.Scan = SE_State.findValueByCode(in.readInt());
/*  34 */     this.Fax = SE_State.findValueByCode(in.readInt());
/*  35 */     this.StorageCopy = SE_State.findValueByCode(in.readInt());
/*  36 */     this.IDCardCopy = SE_State.findValueByCode(in.readInt());
/*  37 */     this.DropNTake = SE_State.findValueByCode(in.readInt());
/*  38 */     this.ReprintSavedJob = SE_State.findValueByCode(in.readInt());
/*  39 */     this.CSA6 = SE_State.findValueByCode(in.readInt());
/*  40 */     this.Fast_Copy = SE_State.findValueByCode(in.readInt());
/*  41 */     this.Ticket_Copy = SE_State.findValueByCode(in.readInt());
/*  42 */     this.Cloud_Print = SE_State.findValueByCode(in.readInt());
/*  43 */     this.Normal_Copy = SE_State.findValueByCode(in.readInt());
/*  44 */     this.Plug_In = SE_State.findValueByCode(in.readInt());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  50 */     out.writeInt(this.Copy.getCode());
/*  51 */     out.writeInt(this.Email.getCode());
/*  52 */     out.writeInt(this.Scan.getCode());
/*  53 */     out.writeInt(this.Fax.getCode());
/*  54 */     out.writeInt(this.StorageCopy.getCode());
/*  55 */     out.writeInt(this.IDCardCopy.getCode());
/*  56 */     out.writeInt(this.DropNTake.getCode());
/*  57 */     out.writeInt(this.ReprintSavedJob.getCode());
/*  58 */     out.writeInt(this.CSA6.getCode());
/*  59 */     out.writeInt(this.Fast_Copy.getCode());
/*  60 */     out.writeInt(this.Ticket_Copy.getCode());
/*  61 */     out.writeInt(this.Cloud_Print.getCode());
/*  62 */     out.writeInt(this.Normal_Copy.getCode());
/*  63 */     out.writeInt(this.Plug_In.getCode());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/*  69 */     return 0;
/*     */   }
/*     */   
/*  72 */   public static final Parcelable.Creator<MS_ServiceEnable> CREATOR = new Parcelable.Creator<MS_ServiceEnable>()
/*     */     {
/*     */       public MS_ServiceEnable createFromParcel(Parcel p)
/*     */       {
/*  76 */         return new MS_ServiceEnable(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public MS_ServiceEnable[] newArray(int size) {
/*  81 */         return new MS_ServiceEnable[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/*  89 */     return super.clone();
/*     */   }
/*     */   
/*     */   public enum SE_State
/*     */   {
/*  94 */     close(0), Enable(1), lock(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SE_State(int numVal) {
/* 100 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 105 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SE_State findValueByCode(int code) {
/* 110 */       for (SE_State v : values()) {
/* 111 */         if (v.getCode() == code)
/* 112 */           return v; 
/*     */       } 
/* 114 */       Log.w("SE_State", "Find NULL, return : " + code);
/* 115 */       return Enable;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SE_State findValueByName(String code) {
/* 120 */       for (SE_State v : values()) {
/* 121 */         if (v.name().equals(code))
/* 122 */           return v; 
/*     */       } 
/* 124 */       Log.w("SE_State", "Find NULL, return : " + code);
/* 125 */       return Enable;
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_ServiceEnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
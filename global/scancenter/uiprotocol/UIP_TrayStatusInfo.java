/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import global.scancenter.commons.CopyOptions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UIP_TrayStatusInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public boolean isOpen;
/*    */   public CopyOptions.CO_TrayPaperSize paperSize;
/*    */   public CopyOptions.CO_MediaType mediaType;
/*    */   public CopyOptions.CO_PaperTray printerTray;
/*    */   public int quantity;
/*    */   
/*    */   public UIP_TrayStatusInfo() {
/* 23 */     this.isOpen = false;
/* 24 */     this.paperSize = CopyOptions.CO_TrayPaperSize.A4_SEF;
/* 25 */     this.mediaType = CopyOptions.CO_MediaType.Plain;
/* 26 */     this.printerTray = CopyOptions.CO_PaperTray.Tray1;
/* 27 */     this.quantity = 0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   UIP_TrayStatusInfo(Parcel in) {
/* 34 */     this.isOpen = (in.readInt() == 1);
/* 35 */     this.paperSize = CopyOptions.CO_TrayPaperSize.valueOf(in.readString());
/* 36 */     this.mediaType = CopyOptions.CO_MediaType.valueOf(in.readString());
/* 37 */     this.printerTray = CopyOptions.CO_PaperTray.valueOf(in.readString());
/* 38 */     this.quantity = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 46 */     out.writeByte((byte)(this.isOpen ? 1 : 0));
/* 47 */     out.writeString((this.paperSize == null) ? "" : this.paperSize.name());
/* 48 */     out.writeString((this.mediaType == null) ? "" : this.mediaType.name());
/* 49 */     out.writeString((this.printerTray == null) ? "" : this.printerTray.name());
/* 50 */     out.writeInt(this.quantity);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 56 */     return 0;
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<UIP_TrayStatusInfo> CREATOR = new Parcelable.Creator<UIP_TrayStatusInfo>()
/*    */     {
/*    */       public UIP_TrayStatusInfo createFromParcel(Parcel p)
/*    */       {
/* 63 */         return new UIP_TrayStatusInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public UIP_TrayStatusInfo[] newArray(int size) {
/* 68 */         return new UIP_TrayStatusInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 76 */     return super.clone();
/*    */   }
/*    */   
/*    */   public static UIP_TrayStatusInfo setTrayStatusInfo(boolean isOpen, CopyOptions.CO_PaperTray printerTray, int paperSize, int mediaType, int quantity) {
/* 80 */     UIP_TrayStatusInfo trayStatus = new UIP_TrayStatusInfo();
/* 81 */     trayStatus.isOpen = isOpen;
/* 82 */     trayStatus.printerTray = printerTray;
/* 83 */     trayStatus.paperSize = CopyOptions.CO_TrayPaperSize.findValueByCode(paperSize);
/* 84 */     trayStatus.mediaType = CopyOptions.CO_MediaType.findValueByCode(mediaType);
/* 85 */     trayStatus.quantity = quantity;
/*    */     
/* 87 */     return trayStatus;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_TrayStatusInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.util.Log;
/*    */ 
/*    */ public class MS_PrinterEdgeInfo
/*    */   implements Parcelable, Cloneable
/*    */ {
/*    */   public int frontLeadEdge;
/*    */   public int frontSideEdge;
/*    */   public int rearLeadEdge;
/*    */   public int rearSideEdge;
/*    */   public MS_PrinterTray printerTray;
/*    */   
/*    */   public MS_PrinterEdgeInfo() {
/* 17 */     this.frontLeadEdge = 0;
/* 18 */     this.frontSideEdge = 0;
/* 19 */     this.rearLeadEdge = 0;
/* 20 */     this.rearSideEdge = 0;
/* 21 */     this.printerTray = MS_PrinterTray.Tray1;
/*    */   }
/*    */ 
/*    */   
/*    */   MS_PrinterEdgeInfo(Parcel in) {
/* 26 */     this.frontLeadEdge = in.readInt();
/* 27 */     this.frontSideEdge = in.readInt();
/* 28 */     this.rearLeadEdge = in.readInt();
/* 29 */     this.rearSideEdge = in.readInt();
/* 30 */     this.printerTray = MS_PrinterTray.valueOf(in.readString());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flags) {
/* 36 */     out.writeInt(this.frontLeadEdge);
/* 37 */     out.writeInt(this.frontSideEdge);
/* 38 */     out.writeInt(this.rearLeadEdge);
/* 39 */     out.writeInt(this.rearSideEdge);
/* 40 */     out.writeString((this.printerTray == null) ? "" : this.printerTray.name());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 46 */     return 0;
/*    */   }
/*    */   
/* 49 */   public static final Parcelable.Creator<MS_PrinterEdgeInfo> CREATOR = new Parcelable.Creator<MS_PrinterEdgeInfo>()
/*    */     {
/*    */       public MS_PrinterEdgeInfo createFromParcel(Parcel p)
/*    */       {
/* 53 */         return new MS_PrinterEdgeInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public MS_PrinterEdgeInfo[] newArray(int size) {
/* 58 */         return new MS_PrinterEdgeInfo[size];
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object clone() throws CloneNotSupportedException {
/* 66 */     return super.clone();
/*    */   }
/*    */   
/*    */   public enum MS_PrinterTray
/*    */   {
/* 71 */     AutoSelect(0), Tray1(1), Tray2(2), Tray3(3), Tray4(4), ManualTray(5);
/*    */     
/*    */     private int _numVal;
/*    */ 
/*    */     
/*    */     MS_PrinterTray(int numVal) {
/* 77 */       this._numVal = numVal;
/*    */     }
/*    */ 
/*    */     
/*    */     public int getCode() {
/* 82 */       return this._numVal;
/*    */     }
/*    */ 
/*    */     
/*    */     public static MS_PrinterTray findValueByCode(int code) {
/* 87 */       for (MS_PrinterTray v : values()) {
/*    */         
/* 89 */         if (v.getCode() == code) {
/* 90 */           return v;
/*    */         }
/*    */       } 
/* 93 */       Log.w("MS_PrinterTray", "Find NULL, return Tray1");
/* 94 */       return Tray1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PrinterEdgeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
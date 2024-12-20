/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ImageCropInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public int width;
/*    */   public int height;
/*    */   public int offsetX;
/*    */   public int offsetY;
/*    */   
/*    */   public ImageCropInfo() {}
/*    */   
/*    */   ImageCropInfo(Parcel in) {
/* 19 */     this.width = in.readInt();
/* 20 */     this.height = in.readInt();
/* 21 */     this.offsetX = in.readInt();
/* 22 */     this.offsetY = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 28 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flag) {
/* 34 */     out.writeInt(this.width);
/* 35 */     out.writeInt(this.height);
/* 36 */     out.writeInt(this.offsetX);
/* 37 */     out.writeInt(this.offsetY);
/*    */   }
/*    */   
/* 40 */   public static final Parcelable.Creator<ImageCropInfo> CREATOR = new Parcelable.Creator<ImageCropInfo>()
/*    */     {
/*    */       public ImageCropInfo createFromParcel(Parcel p)
/*    */       {
/* 44 */         return new ImageCropInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public ImageCropInfo[] newArray(int size) {
/* 49 */         return new ImageCropInfo[size];
/*    */       }
/*    */     };
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\ImageCropInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
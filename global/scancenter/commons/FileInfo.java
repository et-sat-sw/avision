/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String name;
/*    */   public String fullPath;
/*    */   public int height;
/*    */   public int width;
/*    */   
/*    */   public FileInfo() {}
/*    */   
/*    */   public FileInfo(String _name, String _fullPath, int _height, int _width) {
/* 19 */     this.name = _name;
/* 20 */     this.fullPath = _fullPath;
/* 21 */     this.height = _height;
/* 22 */     this.width = _width;
/*    */   }
/*    */ 
/*    */   
/*    */   FileInfo(Parcel in) {
/* 27 */     this.name = in.readString();
/* 28 */     this.fullPath = in.readString();
/* 29 */     this.height = in.readInt();
/* 30 */     this.width = in.readInt();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 36 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flag) {
/* 42 */     out.writeString(this.name);
/* 43 */     out.writeString(this.fullPath);
/* 44 */     out.writeInt(this.height);
/* 45 */     out.writeInt(this.width);
/*    */   }
/*    */   
/* 48 */   public static final Parcelable.Creator<FileInfo> CREATOR = new Parcelable.Creator<FileInfo>()
/*    */     {
/*    */       public FileInfo createFromParcel(Parcel p)
/*    */       {
/* 52 */         return new FileInfo(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public FileInfo[] newArray(int size) {
/* 57 */         return new FileInfo[size];
/*    */       }
/*    */     };
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\FileInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package global.scancenter.commons;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NetworkInformation
/*    */   implements Parcelable
/*    */ {
/*    */   public boolean enableDHCP;
/*    */   public String ip;
/*    */   public String netmask;
/*    */   public String gateway;
/*    */   public String dns;
/*    */   public String proxy_host;
/*    */   public int proxy_port;
/*    */   public String proxy_exclusion;
/*    */   
/*    */   public int describeContents() {
/* 23 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public NetworkInformation() {}
/*    */ 
/*    */   
/*    */   NetworkInformation(Parcel in) {
/* 32 */     this.enableDHCP = (in.readByte() == 1);
/* 33 */     this.ip = in.readString();
/* 34 */     this.netmask = in.readString();
/* 35 */     this.gateway = in.readString();
/* 36 */     this.dns = in.readString();
/*    */ 
/*    */     
/* 39 */     this.proxy_host = in.readString();
/* 40 */     this.proxy_port = in.readInt();
/* 41 */     this.proxy_exclusion = in.readString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel out, int flag) {
/* 47 */     out.writeByte((byte)(this.enableDHCP ? 1 : 0));
/* 48 */     out.writeString(this.ip);
/* 49 */     out.writeString(this.netmask);
/* 50 */     out.writeString(this.gateway);
/* 51 */     out.writeString(this.dns);
/*    */ 
/*    */     
/* 54 */     out.writeString(this.proxy_host);
/* 55 */     out.writeInt(this.proxy_port);
/* 56 */     out.writeString(this.proxy_exclusion);
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<NetworkInformation> CREATOR = new Parcelable.Creator<NetworkInformation>()
/*    */     {
/*    */       public NetworkInformation createFromParcel(Parcel p)
/*    */       {
/* 63 */         return new NetworkInformation(p);
/*    */       }
/*    */ 
/*    */       
/*    */       public NetworkInformation[] newArray(int size) {
/* 68 */         return new NetworkInformation[size];
/*    */       }
/*    */     };
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\NetworkInformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
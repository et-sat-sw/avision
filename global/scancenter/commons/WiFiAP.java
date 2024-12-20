/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WiFiAP
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public static final int SETTING_DHCP = 0;
/*     */   public static final int SETTING_STATIC = 1;
/*     */   public static final int SETTING_UNASSIGNMENT = 2;
/*     */   public static final int SECURITY_NONE = 0;
/*     */   public static final int SECURITY_WEP = 1;
/*     */   public static final int SECURITY_WPA_PSK = 2;
/*     */   public static final int SECURITY_EAP = 3;
/*     */   public static final int SECURITY_WPA2_PSK = 4;
/*     */   public static final int SECURITY_WPA_WPA2_PSK = 5;
/*     */   public static final int STATE_CONNECTED = 0;
/*     */   public static final int STATE_NOT_IN_RANGE = 1;
/*     */   public static final int STATE_DISABLE_PASSWORD_FAILURE = 2;
/*     */   public static final int STATE_DISABLE_NETWORK_FAILURE = 3;
/*     */   public static final int STATE_DISABLE_GENERIC = 4;
/*     */   public static final int STATE_SECUIRTY_EAP = 5;
/*     */   public static final int STATE_SECUIRTY_EAP_SAVED = 6;
/*     */   public static final int STATE_SECUIRTY_EAP_WPS = 7;
/*     */   public static final int STATE_SECUIRTY_WEP = 8;
/*     */   public static final int STATE_SECUIRTY_WEP_SAVED = 9;
/*     */   public static final int STATE_SECUIRTY_WEP_WPS = 10;
/*     */   public static final int STATE_SECUIRTY_WPA = 11;
/*     */   public static final int STATE_SECUIRTY_WPA_SAVED = 12;
/*     */   public static final int STATE_SECUIRTY_WPA_WPS = 13;
/*     */   public static final int STATE_SECUIRTY_WPA2 = 14;
/*     */   public static final int STATE_SECUIRTY_WPA2_SAVED = 15;
/*     */   public static final int STATE_SECUIRTY_WPA2_WPS = 16;
/*     */   public static final int STATE_SECUIRTY_WPA_WPA2 = 17;
/*     */   public static final int STATE_SECUIRTY_WPA_WPA2_SAVED = 18;
/*     */   public static final int STATE_SECUIRTY_WPA_WPA2_WPS = 19;
/*     */   public static final int STATE_SECUIRTY_PSK = 20;
/*     */   public static final int STATE_SECUIRTY_PSK_SAVED = 21;
/*     */   public static final int STATE_SECUIRTY_PSK_WPS = 22;
/*     */   public static final int STATE_SECUIRTY_NONE = 23;
/*     */   public static final int STATE_SECUIRTY_NONE_SAVED = 24;
/*     */   public static final int STATE_SECUIRTY_NONE_WPS = 25;
/*     */   public static final int STATE_CONNECTING = 30;
/*     */   private String mSSID;
/*     */   private String mPassword;
/*     */   private int mSecurity;
/*     */   private boolean mWpsAvailable;
/*     */   private int mStrength;
/*     */   private int mNetworkId;
/*     */   private int mState;
/*     */   private int mIpAssignment;
/*     */   private String mIpAddress;
/*     */   private String mGateway;
/*     */   private int mPrefixLength;
/*     */   private String mDns1;
/*     */   private String mDns2;
/*     */   private int mEapMethod;
/*     */   private int mPhase2;
/*     */   private String mEapCaCert;
/*     */   private String mEapUserCert;
/*     */   private String mEapIdentity;
/*     */   private String mEapAnonymous;
/*     */   
/*     */   public WiFiAP() {}
/*     */   
/*     */   public WiFiAP(String _ssid, int _security, boolean _wps, int _strength, int _netId, int _state) {
/* 102 */     this.mSSID = _ssid;
/* 103 */     this.mSecurity = _security;
/* 104 */     this.mWpsAvailable = _wps;
/* 105 */     this.mStrength = _strength;
/* 106 */     this.mNetworkId = _netId;
/* 107 */     this.mState = _state;
/*     */     
/* 109 */     this.mPassword = "";
/* 110 */     this.mEapCaCert = "";
/* 111 */     this.mEapUserCert = "";
/* 112 */     this.mEapIdentity = "";
/* 113 */     this.mEapAnonymous = "";
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSsid() {
/* 118 */     return this.mSSID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSsid(String ssid) {
/* 123 */     this.mSSID = ssid;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getState() {
/* 128 */     return this.mState;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSecurity() {
/* 137 */     return this.mSecurity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecurity(int security) {
/* 146 */     this.mSecurity = security;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getWpsAvailable() {
/* 151 */     return this.mWpsAvailable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSignal() {
/* 160 */     return this.mStrength;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getNetworkId() {
/* 165 */     return this.mNetworkId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPassword() {
/* 170 */     return this.mPassword;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPassword(String pswd) {
/* 175 */     this.mPassword = pswd;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getIpAssignment() {
/* 180 */     return this.mIpAssignment;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIpAssignment(int as) {
/* 185 */     this.mIpAssignment = as;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIpAddress() {
/* 190 */     return this.mIpAddress;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIpAddress(String ip) {
/* 195 */     this.mIpAddress = ip;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getGateway() {
/* 200 */     return this.mGateway;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setGateway(String gw) {
/* 205 */     this.mGateway = gw;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDns1() {
/* 210 */     return this.mDns1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDns1(String dns) {
/* 215 */     this.mDns1 = dns;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDns2() {
/* 220 */     return this.mDns2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDns2(String dns) {
/* 225 */     this.mDns2 = dns;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEapMethod() {
/* 234 */     return this.mEapMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEapMethod(int eap) {
/* 243 */     this.mEapMethod = eap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPhase2Method() {
/* 252 */     return this.mPhase2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPhase2Method(int phase2) {
/* 261 */     this.mPhase2 = phase2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEapCaCert() {
/* 266 */     return this.mEapCaCert;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEapCaCert(String caCert) {
/* 271 */     this.mEapCaCert = caCert;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEapUserCert() {
/* 276 */     return this.mEapUserCert;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEapUserCert(String userCert) {
/* 281 */     this.mEapUserCert = userCert;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEapIdentity() {
/* 286 */     return this.mEapIdentity;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEapIdentity(String id) {
/* 291 */     this.mEapIdentity = id;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEapAnonymous() {
/* 296 */     return this.mEapAnonymous;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEapAnonymous(String ano) {
/* 301 */     this.mEapAnonymous = ano;
/*     */   }
/*     */ 
/*     */   
/*     */   WiFiAP(Parcel in) {
/* 306 */     this.mSSID = in.readString();
/* 307 */     this.mPassword = in.readString();
/* 308 */     this.mSecurity = in.readInt();
/* 309 */     this.mWpsAvailable = (in.readInt() == 1);
/* 310 */     this.mStrength = in.readInt();
/* 311 */     this.mNetworkId = in.readInt();
/* 312 */     this.mState = in.readInt();
/*     */     
/* 314 */     this.mIpAssignment = in.readInt();
/* 315 */     this.mIpAddress = in.readString();
/* 316 */     this.mGateway = in.readString();
/* 317 */     this.mPrefixLength = in.readInt();
/* 318 */     this.mDns1 = in.readString();
/* 319 */     this.mDns2 = in.readString();
/*     */     
/* 321 */     this.mEapMethod = in.readInt();
/* 322 */     this.mPhase2 = in.readInt();
/* 323 */     this.mEapCaCert = in.readString();
/* 324 */     this.mEapUserCert = in.readString();
/* 325 */     this.mEapIdentity = in.readString();
/* 326 */     this.mEapAnonymous = in.readString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/* 332 */     out.writeString(this.mSSID);
/* 333 */     out.writeString(this.mPassword);
/* 334 */     out.writeInt(this.mSecurity);
/* 335 */     out.writeByte((byte)(this.mWpsAvailable ? 1 : 0));
/* 336 */     out.writeInt(this.mStrength);
/* 337 */     out.writeInt(this.mNetworkId);
/* 338 */     out.writeInt(this.mState);
/*     */     
/* 340 */     out.writeInt(this.mIpAssignment);
/* 341 */     out.writeString(this.mIpAddress);
/* 342 */     out.writeString(this.mGateway);
/* 343 */     out.writeInt(this.mPrefixLength);
/* 344 */     out.writeString(this.mDns1);
/* 345 */     out.writeString(this.mDns2);
/*     */     
/* 347 */     out.writeInt(this.mEapMethod);
/* 348 */     out.writeInt(this.mPhase2);
/* 349 */     out.writeString(this.mEapCaCert);
/* 350 */     out.writeString(this.mEapUserCert);
/* 351 */     out.writeString(this.mEapIdentity);
/* 352 */     out.writeString(this.mEapAnonymous);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 358 */     return 0;
/*     */   }
/*     */   
/* 361 */   public static final Parcelable.Creator<WiFiAP> CREATOR = new Parcelable.Creator<WiFiAP>()
/*     */     {
/*     */       public WiFiAP createFromParcel(Parcel p)
/*     */       {
/* 365 */         return new WiFiAP(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public WiFiAP[] newArray(int size) {
/* 370 */         return new WiFiAP[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 377 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\WiFiAP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
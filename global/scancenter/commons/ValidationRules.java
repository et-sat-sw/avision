/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ public class ValidationRules
/*     */ {
/*     */   public static boolean ValidateEmail(String validateString) {
/*  10 */     if (validateString == null) return false; 
/*  11 */     return Pattern.matches("^(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\\-+)|([A-Za-z0-9]+\\.+)|([A-Za-z0-9]+\\++))*[A-Za-z0-9]+@((\\w+\\-+)|(\\w+\\.))*\\w{1,63}\\.[a-zA-Z]{2,6}$*", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateFileFolder(String validateString) {
/*  18 */     if (validateString == null) return false; 
/*  19 */     return Pattern.matches("^[^ \\\\/:*?\"\"<>|]+([ ]+[^ \\\\/:*?\"\"<>|]+)*$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateFtpURL(String validateString) {
/*  26 */     return Pattern.matches("^^[a-zA-Z0-9\\~\\!\\@\\#\\$\\&\\*\\(\\)\\_\\+\\:\\?\\-\\=\\]\\[\\;\\/\\.\\,\\']+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateCifsURL(String validateString) {
/*  32 */     if (validateString == null) return false; 
/*  33 */     return Pattern.matches("^[a-zA-Z0-9\\~\\!\\@\\#\\$\\&\\*\\(\\)\\_\\+\\\\=\\-\\[\\]\\'\\;\\:\\/\\.\\,\\?]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateDomainNameURL(String validateString) {
/*  39 */     if (validateString == null) return false; 
/*  40 */     return Pattern.matches("^[a-zA-Z0-9\\.\\-\\_]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateAddressName(String validateString) {
/*  47 */     if (validateString == null) return false; 
/*  48 */     return Pattern.matches("^[Ѐ-ӿ_一-鿿_a-zA-Z0-9\\.\\-_@\\s]+$", validateString);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean ValidateNumeric(String validateString) {
/*  53 */     if (validateString == null) return false; 
/*  54 */     return Pattern.matches("^[0-9]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidatePortNumber(String validateString) {
/*  61 */     if (validateString == null) return false; 
/*  62 */     return Pattern.matches("^(6553[0-5]|655[0-2][0-9]\\d|65[0-4](\\d){2}|6[0-4](\\d){3}|[1-5](\\d){4}|[1-9](\\d){0,3})$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateAlphabet(String validateString) {
/*  69 */     if (validateString == null) return false; 
/*  70 */     return Pattern.matches("^[a-zA-Z]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateAlphabetNumber(String validateString) {
/*  77 */     if (validateString == null) return false; 
/*  78 */     return Pattern.matches("^[a-zA-Z0-9]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateBaseDN(String validateString) {
/*  85 */     if (validateString == null) return false; 
/*  86 */     return Pattern.matches("^[a-zA-Z0-9\\-\\._=,]+$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateIP(String validateString) {
/*  93 */     if (validateString == null) return false; 
/*  94 */     return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateMAC(String validateString) {
/* 101 */     if (validateString == null) return false; 
/* 102 */     return Pattern.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$", validateString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean ValidateLoginName(String validateString) {
/* 108 */     return Pattern.matches("^[Ѐ-ӿ_a-zA-Z0-9\\.\\-_@\\;\\s]+$", validateString);
/*     */   }
/*     */   
/*     */   public static boolean ValidateDescription(String validateString) {
/* 112 */     String unavailable = "[;#&]";
/* 113 */     Pattern p = Pattern.compile(unavailable);
/* 114 */     Matcher m = p.matcher(validateString);
/* 115 */     return m.find();
/*     */   }
/*     */   
/*     */   public static boolean ValidateFileName(String validateString) {
/* 119 */     return Pattern.matches("^[Ѐ-ӿ_一-龥_a-zA-Z0-9\\.\\-_@\\;\\#\\s]+$", validateString);
/*     */   }
/*     */   
/*     */   public static boolean ValidateFuser(String validateString) {
/* 123 */     return Pattern.matches("^[Ѐ-ӿ_一-龥_a-zA-Z0-9\\*\\=\\+\\!\\%\\&\\(\\)\\.\\-_@\\;\\#\\s]+$", validateString);
/*     */   }
/*     */   
/*     */   public static boolean ValidateASCII(String validateString) {
/* 127 */     for (int i = 0; i < validateString.length(); ) {
/* 128 */       char tmp = validateString.charAt(i);
/* 129 */       if (tmp >= ' ' && tmp <= '~') {
/*     */         i++; continue;
/*     */       } 
/* 132 */       return false;
/*     */     } 
/*     */     
/* 135 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean ValidateFaxNumber(String validateString) {
/* 139 */     return Pattern.matches("^[P_p_0-9\\!\\#\\*]+$", validateString);
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\ValidationRules.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
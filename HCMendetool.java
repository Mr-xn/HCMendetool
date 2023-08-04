import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.util.Base64;

public class HCMendetool {
    //替换
    public static String encrypt2(String var0, String key) {
        if (null == var0) {
            return "";
        } else {
            String var1 = encrypt(key, var0.getBytes());
            var1 = var1.replaceAll("%", "@2HJ5@");
            var1 = var1.replaceAll("\\+", "@2HJB@");
            var1 = var1.replaceAll(" ", "@2HJ0@");
            var1 = var1.replaceAll("\\/", "@2HJF@");
            var1 = var1.replaceAll("\\?", "@3HJF@");
            var1 = var1.replaceAll("#", "@2HJ3@");
            var1 = var1.replaceAll("&", "@2HJ6@");
            var1 = var1.replaceAll("=", "@3HJD@");
            var1 = var1.replaceAll("\r\n", "").replaceAll("\n", "").replaceAll("\r", "");
            var1 = var1.replaceAll("@", "PAATTP");
            return var1;
        }
    }

    //加密
    public static String encrypt(String var0, byte[] var1) {
        String var2 = "";

        try {
            byte[] var3 = new byte[]{
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8
            };
            byte[] keyBytes;
            if (var0 != null && !var0.isEmpty()) {
                keyBytes = var0.getBytes();
            } else {
                keyBytes = "ilovethisgame".getBytes();
            }
            DESKeySpec var4 = new DESKeySpec(keyBytes);
            SecretKeyFactory var5 = SecretKeyFactory.getInstance("DES");
            SecretKey var6 = var5.generateSecret(var4);
            Cipher var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec var8 = new IvParameterSpec(var3);
            var7.init(1, var6, var8);
            byte[] var10 = var7.doFinal(var1);
            var2 = Base64.getEncoder().encodeToString(var10);
        } catch (Exception var12) {
            var12.printStackTrace();
        }

        return var2;
    }

    //编码
    public static String encode(String var0) {
        if (var0 == null) {
            return "";
        } else {
            StringBuilder var1 = new StringBuilder();

            for (int var2 = 0; var2 < var0.length(); ++var2) {
                char var3;
                String var4;
                int var5;
                if ((var3 = var0.charAt(var2)) > 255) {
                    for (var5 = (var4 = Integer.toString(var3, 16)).length(); var5 < 4; ++var5) {
                        var4 = "0" + var4;
                    }

                    var1.append("^").append(var4);
                } else if (var3 >= 'A' && (var3 <= 'Z' || var3 >= 'a') && var3 <= 'z') {
                    var1.append(var3);
                } else {
                    for (var5 = (var4 = Integer.toString(var3, 16)).length(); var5 < 2; ++var5) {
                        var4 = "0" + var4;
                    }

                    var1.append("~").append(var4);
                }
            }

            return var1.toString();
        }
    }

    //解码
    public static String decode(String var0) {
        StringBuilder var1 = new StringBuilder();

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            char var3 = var0.charAt(var2);
            if (var3 == '^') {
                // 解析出Unicode编码并转换为字符
                String unicodeStr = var0.substring(var2 + 1, var2 + 5);
                int unicode = Integer.parseInt(unicodeStr, 16);
                var1.append((char) unicode);
                var2 += 4; // 因为已经解析了4个字符（'^'和3位十六进制数），所以要跳过这4个字符
            } else if (var3 == '~') {
                // 解析出十六进制数并转换为字符
                String hexStr = var0.substring(var2 + 1, var2 + 3);
                int unicode = Integer.parseInt(hexStr, 16);
                var1.append((char) unicode);
                var2 += 2; // 因为已经解析了2个字符（'~'和2位十六进制数），所以要跳过这2个字符
            } else {
                var1.append(var3);
            }
        }

        return var1.toString();
    }

    //替换
    public static String decrypt2(String var0, String key) {
        if (null == var0) {
            return "";
        } else {
            var0 = var0.replaceAll("PAATTP", "@");
            var0 = var0.replaceAll("@2HJ5@", "%");
            var0 = var0.replaceAll("@2HJB@", "\\+");
            var0 = var0.replaceAll("@2HJ0@", " ");
            var0 = var0.replaceAll("@2HJF@", "\\/");
            var0 = var0.replaceAll("@3HJF@", "\\?");
            var0 = var0.replaceAll("@2HJ3@", "#");
            var0 = var0.replaceAll("@2HJ6@", "&");
            var0 = var0.replaceAll("@3HJD@", "=");
            return decrypt(var0, key);
        }
    }

    //解密
    public static String decrypt(String encryptedData, String... key) {
        String decryptedData = "";

        try {
            byte[] keyBytes;
            if (key.length > 0 && key[0] != null) {
                // 使用输入的秘钥
                keyBytes = key[0].getBytes();
            } else {
                // 使用默认秘钥
                keyBytes = "ilovethisgame".getBytes();
            }

            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] iv = new byte[]{
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8
            };

            DESKeySpec spec = new DESKeySpec(keyBytes);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(spec);

            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            decryptedData = new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return decryptedData;
    }

    //获取当前执行类路径
    public static String getCurrentFileName() {
        String path = HCMendetool.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String[] segments = path.split("/");
        return segments[segments.length - 1];
    }

    public static void main(String[] args) {
        String fileName = getCurrentFileName();
        if (args.length < 2) {
            System.out.println("宏景HCM任意文件读取路径加密/解密工具\ngitub: https://github.com/Mr-xn/HCMendetool");
            System.out.println("请提供正确的参数！");
            System.out.println("用法: java -jar " + fileName + " -e/-d [文件路径/加密字符串] [秘钥(可选)]");
            return;
        }

        String option = args[0];
        String data = args[1];
        String key = null;

        if (args.length > 2) {
            key = args[2];
        }

        if ("-e".equals(option)) {
            String encryptedData = encrypt2(data, key);
            String encodeDate = encode(encryptedData);
            System.out.println("加密结果:\n" + encryptedData + "\n编码结果: \n" + encodeDate);
        } else if ("-d".equals(option)) {
            String decryptedData = decrypt2(decode(data), key);
            System.out.println("解密结果:\n" + decryptedData);
        } else {
            System.out.println("宏景HCM任意文件读取路径加密/解密工具\ngitub: https://github.com/Mr-xn/HCMendetool");
            System.out.println("请提供正确的参数！");
            System.out.println("用法: java -jar " + fileName + " -e/-d [文件路径/加密字符串] [秘钥(可选)]");
        }
    }

}

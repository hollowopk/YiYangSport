package cn.stylefeng.guns.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000119610931";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCqg0L3+dwss1v7zVOEikew6qfjC+qfx8B6dxmE0iL1+3mI712sxLBnxU82OHqaWTX8Vo7tHmTJBanEIzy5P6A06wIh5Pr2skFI5l9eUnU57q0WGnJlCNTHZGn02eN7s8QJocehIduJkGECbdhFL5txndCgPzIYr3i8uJE7SWqHanTyEbayE/hGkpUpua9fF+GxFSayzM+YePDiq8nHmoFpo2PJuhV0+xT4n9BBUH3QqWvtEdGZ4B/+Vk3+Mx96ijA8V5kw0cu2mOl8pCjnSH5TFGtynKWLTdgbp3sdiRCbqW44XH5nd6Ep11zSyVZ6/hZeJ1p5aJHRsxsOc7A1P6pxAgMBAAECggEBAI7+ZTrwHuSdxZX1KwULsfN71i9h3vD/4zrQhmYMk6UVr2ZW1of8qrNblIIz+x1VkyB6toHD62FpjmUd596yrPez3aXvEUexVW59Q50mKYjbz+upYiW4sjhEzVa5IzyqFMy/D1rhueozWidfVu8ubX1qi3rXhHuPLAGYBrNhbiUAjpFb6qFLlnA0DBPJzKgBGh5onGzT9FMnNrsXggbKSbYfDJBP9V42NoQHvbIdsRKSBZQ4e86nZ8zJKr6NWvb9bWwaJJe5FHwJgLMsbOvZG3x7zyQlXc2cADDWQIO/OlKpZZewjai7yunUuA8YFoZPExdliVtE9SrWLLDW9efiR8ECgYEA9yJi63sRshDAxj6JE6TRyAMo3EdBrPRokUpGR0cPlBlPSjrS/eHFrLA3kYRLoB3WdscyWqCxzXuH0rzV9zAZ9pxAqyLRp/YplWFKFcYXtGMGm/JpGkFoX33hobhdfwMNEVHkHKNDnNk/35R4hB/6lRElW7VncMqfX7tXwsoha1MCgYEAsKE0JCN0MJ31mTkLC29ifDTN1VAdpl8So0FIYhdA2EuXrunEaR2zQuWqyiHgHAB3eaCzyrVYsrSpG8AYsoSa1X3FniczlLXvmsYbP4JYej4MtojTUhzWIPzDwZMUeXDLzFAe7LdEGQHRiXK1G9i27BFYl4rGjH8WThwqbcJZ3qsCgYEAi8HwewbgHPkIa5QV5PwCfr/6rYfGhk65i+CbGdf/4Vrm0i2uAFFbfqsw4aQVOHlnPUitGz9hDblcODr+LYoQRLxcfet08S1umsGoKeQap7KQnERcV7LBma8QmGowxZEuJKtQ+zkBFYRucLv/44hKJ17I57IQy2Jq+rJxkQDKIW0CgYEApv1BVolOaEhu0hXkI0ODUPp7P5km7wwjisVFsbdaTyPonC3Wy6qQuEZ6We/8+XxXeF4+nP8mhI3Y86uBrgVAfWcTVpqpYYdAqItzZ2/MRoYzbr+dSpyItVdDm9d6G/ZQNzHoitQZRas6d0BDibgx+K3NnDhPzrS4WdC3LF36qVECgYAni5gLWJ2Vh8F2u4yfSI/ouwNa+lvjRLpvb4b1Exj33rgWKFpexmUzH/+eSaUKSYvC9GQtwqaM2J3kRW93AJ7RMTHYhgvnX69rwnkX5p5rMoWKjxfLpLuspvAGoPrbwM8DOLouJM5AakX2HnSHHJr1e3ccSI1cPyBdYqvEl437IA==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1vtxlAh0iRWH/N5JwR7Ymw+r//VRd7/TEhg6uZFd+EOoLN4SAt3GZAKEnaYnkgKn8U2/bmGCGN4kgiU3rjBay79UcMLQWketrHcBg6ymqLfpNkilTiRR8DjrtY/ZtCwbRUQyHnzSLJJFJms6yjRDNiTfKgORNnU0hCYF0GwoFGZQ/7tRCsQdqJYdqKcRp2T0Qegcj0i2fVu0oR5yWvXo5W3DcJU6PcHJGgBGpyKF+RI6A3hO0f+4q56QvLyyWn1RrSY6B7HX1sxsZSp5PBDNIwTH/R2vg2LhlAlA8ryfvsLp18VpiNWX/MLwgUVVPdnyTyoyz7d28gKCIohDcd3T0QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

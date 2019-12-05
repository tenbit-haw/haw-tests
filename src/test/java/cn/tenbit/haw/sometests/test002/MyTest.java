package cn.tenbit.haw.sometests.test002;

import cn.tenbit.haw.core.util.HawConsoles;

import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author bangquan.qian
 * @date 2019-11-14 21:22
 */
public class MyTest {

    public static void main(String[] args) throws Throwable {
        String fileName = "/Users/chainz/Downloads/" + URLEncoder.encode("112333_123322_哈哈哈斤斤计较.zip", "utf-8");
        File file = new File(fileName);
        file.createNewFile();

        File readFile = new File(fileName);
        String readFileName = readFile.getName();
        HawConsoles.jsout(readFileName);
        String decode = URLDecoder.decode(readFileName, "utf-8");
        HawConsoles.jsout(decode);
    }
}

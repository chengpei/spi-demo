package top.chengpei.spidemo.log;

import java.util.ServiceLoader;

public class LogUtils {

    public static void printLog(String info) {
        ServiceLoader<LogService> serviceLoader = ServiceLoader.load(LogService.class);
        for (LogService logService : serviceLoader) {
            logService.info(info);
        }
    }
}

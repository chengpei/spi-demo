package top.chengpei.spidemo.log;

public class MyLogService implements LogService {
    @Override
    public void info(String info) {
        System.out.println("我服务提供者自己实现的日志打印功能 ====> " + info);
    }
}

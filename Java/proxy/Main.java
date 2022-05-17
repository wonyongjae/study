import adapter.Electronic110V;
import aop.AopBrowser;
import proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

//        Browser browser =new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.never.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    System.out.println("after");
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("Loading time : "+end.get());
        aopBrowser.show();
        System.out.println("Loading time : "+end.get());


    }
}
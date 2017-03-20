package cn.edu.sdut.r314;

import javax.inject.Named;
import javax.interceptor.Interceptors;

/**
 *
 * @author gaoziqiang
 */
@Named
@Audit
public class RoomController {

    /**
     * 订房
     * @return
     */
    //@Audit
    @Logged
    public void checkin(){
        System.out.println("checkin room......");
    }

    /**
     * 退房
     * @return
     */
    //拦截器声明方式一
    //@My
    //拦截器声明方式二
    @Interceptors(MyInterceptor.class)//表示拦截器所在的类
    public void checkout(){
        System.out.println("checkout room......");
    }

}

package cn.edu.sdut.r314;

import java.io.Serializable;
import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@My
@Interceptor
public class MyInterceptor implements Serializable {
	public MyInterceptor() {

	}

	@AroundInvoke
	public Object doMy(InvocationContext ctx) throws Exception {
		System.out.println("MyInterceptor is called at: " + new Date());
		return ctx.proceed();
	}
	
	
}

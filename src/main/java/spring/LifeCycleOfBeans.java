package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by JitendraSingh on 12/04/18.
 */
public class LifeCycleOfBeans implements InitializingBean, DisposableBean{


    @Override
    public void afterPropertiesSet() throws Exception {
        //Bean initialization code
    }

    @Override
    public void destroy() throws Exception {
        //Bean initialization code
    }
}

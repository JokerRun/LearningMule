/**
 * 
 */
package com.laurus.service;

import com.laurus.service.HelloService;

/**
 * @author JerryRun
 * 2019年1月29日
 */
public class HelloServiceImpl implements HelloService {

    /* (non-Javadoc)
     * @see com.laurus.usserver.HelloService#sayHi(java.lang.String)
     */
    @Override
    public String sayHi(String name) {

        return "Hello" + name;
    }

}

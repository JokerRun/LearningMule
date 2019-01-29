/**
 * 
 */
package com.laurus.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author JerryRun
 * 2019年1月29日
 */
@WebService
public interface HelloService {

    public @WebResult String sayHi(@WebParam(name="name") String name);
}

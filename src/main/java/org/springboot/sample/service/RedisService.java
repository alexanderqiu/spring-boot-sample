package org.springboot.sample.service;

import org.springboot.sample.entity.Address;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author long
 * @date 2016/12/15
 */
@Service
public class RedisService {

    @Cacheable(value = "addresscache",keyGenerator = "keyGenerator")
    public Address findAddress(Long id, String province, String city){
        System.out.println("无缓存的时候调用这里");
        return new Address(id,province,city);
    }

}

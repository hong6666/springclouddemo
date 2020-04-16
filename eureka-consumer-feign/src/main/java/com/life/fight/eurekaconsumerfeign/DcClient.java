package com.life.fight.eurekaconsumerfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springcloulddemo
 * @Date: 2020/4/16 9:31
 * @Author: lhh
 * @Description:
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}

package com.QH.uuid;

import org.junit.Test;

import java.util.UUID;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.test
 * @date 2022/8/9 10:45
 */

public class UUIDTest {
    @Test
    public void randomUUid(){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid);
    }
}

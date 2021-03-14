package org.yuanbo.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @ClassName : NettyConfig
 * @Description: 存储整个过程的全局配置
 * @Author mayuanbo
 * @Date 2021/3/14 下午10:25
 * @Version 1.0
 */
public class NettyConfig {

    /**
     * 存储每一个客户端接入时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}

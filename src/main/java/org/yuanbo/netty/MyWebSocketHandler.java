package org.yuanbo.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @ClassName : MyWebSocketHandler
 * @Description: 接收，处理，相应客户端websocket请求的核心业务处理类
 * @Author mayuanbo
 * @Date 2021/3/14 下午10:29
 * @Version 1.0
 */
public class MyWebSocketHandler extends SimpleChannelInboundHandler<Object> {

    /***
     * @description 服务端处理websocket请求的核心方法
     * @param channelHandlerContext
	 * @param o
     * @return void
     * @author mayuanbo
     * @date 2021/3/14 下午10:43
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }

    /***
     * @description 在客户端与服务端创建连接的时候调用
     * @param ctx
     * @return void
     * @author mayuanbo
     * @date 2021/3/14 下午10:37
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    /***
     * @description 客户端与服务端断开连接的时候调用
     * @param ctx
     * @return void
     * @author mayuanbo
     * @date 2021/3/14 下午10:38
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    /***
     * @description 服务度接收客户端发送的数据结束之后调用
     * @param ctx
     * @return void
     * @author mayuanbo
     * @date 2021/3/14 下午10:38
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    /***
     * @description 工程异常的时候调用
     * @param ctx
	 * @param cause
     * @return void
     * @author mayuanbo
     * @date 2021/3/14 下午10:42
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}

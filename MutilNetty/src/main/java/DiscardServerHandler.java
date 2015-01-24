import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class DiscardServerHandler extends SimpleChannelInboundHandler<Object> {

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
	    	cause.printStackTrace();
	    	ctx.close();
	}

	@Override
	protected void channelRead0(ChannelHandlerContext arg0, Object arg1) throws Exception {
			
	}
	    
}

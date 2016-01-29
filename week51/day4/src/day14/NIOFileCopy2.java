package day14;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileCopy2 {

	public static void main(String[] args) throws Exception {
		// 获得输入的文件FileChannel
		FileInputStream inputStream = new FileInputStream("src\\gem\\day13\\NIOFileCopy2.java");
		FileChannel channel = inputStream.getChannel();
		// 获得输出文件的FileChannel
		FileOutputStream outputStream = new FileOutputStream("src\\gem\\day13\\NIOFileCopy2.txt");
		FileChannel channel2 = outputStream.getChannel();
		// 读一块写一块 new byte[512]
		ByteBuffer buffer = ByteBuffer.allocate(512);
		while (channel.read(buffer) != -1) {
			//
			buffer.flip();
			channel2.write(buffer);
			//
			buffer.clear();

		}
		// 关闭相应资源
		inputStream.close();
		channel.close();
		outputStream.close();
		channel2.close();

	}

}

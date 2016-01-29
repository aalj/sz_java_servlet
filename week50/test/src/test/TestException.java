package test;
import java.io.*;
import java.sql.*;
class TestException{
	public static void main(String args[]){
		System.out.println("main 1");
		int n = 4;
		//读入n
		ma(n);
		System.out.println("main2");
}
public static void ma(int n){
	try{
		System.out.println("ma1");
		mb(n);
		System.out.println("ma2");
	}catch(EOFException e){
		System.out.println("Catch EOFException");
	}catch(IOException e){
		System.out.println("Catch IOException");
	}catch(SQLException e){
		System.out.println("Catch SQLException");
	}catch(Exception e){//因为mb方法中声明抛出的异常中Exception，所以这句必须有
		System.out.println("Catch Exception");
	}finally{
		System.out.println("In finally");
	}
}
//声明抛出的异常是Exception，但可以捕获到实际抛出的异常对象
public static void mb(int n) throws Exception{
	System.out.println("mb1");
	if (n == 1) throw new EOFException();
	if (n == 2) throw new FileNotFoundException();
	if (n == 3) throw new SQLException();
	if (n == 4) throw new NullPointerException();
	System.out.println("mb2");
}
}
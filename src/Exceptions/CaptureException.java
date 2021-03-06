package Exceptions;

/*
 * 自定义异常
 */
class ChushulingException extends Exception
{
	public ChushulingException(String msg)
	{
		super(msg);
	}
} 

/*
 * 自定义异常
 */
class ChushufuException extends Exception
{
	public ChushufuException(String msg)
	{
		super(msg);
	}
}

class Numbertest 
{
	public int shang(int x,int y) throws ChushulingException,ChushufuException
	{
		if(y<0)
		{
			throw new ChushufuException("您输入的是"+y+",规定除数不能为负数!");//抛出异常
		}
		if(y==0)
		{
			throw new ChushulingException("您输入的是"+y+",除数不能为0!");
		}
	
		int m=x/y;
		return m;
	}
}


class CaptureException
{
	public static void main(String[]args)
	{
		Numbertest  n=new Numbertest ();

		//捕获异常
		try
		{
			System.out.println("除数  = "+n.shang(1,-3));
		}
		catch(ChushulingException yc)
		{
			System.out.println(yc.getMessage());
			yc.printStackTrace();
		}
		catch(ChushufuException yx)
		{
			System.out.println(yx.getMessage());
			yx.printStackTrace();
		}
		catch(Exception y)
		{
			System.out.println(y.getMessage());
			y.printStackTrace();
		}
		finally{
			System.out.println("finally 不管发没发生异常都会被执行!");
		} 
	}
}
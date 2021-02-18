package ibait_demo_01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main
{

	public static void main(String[] args)
	{
		sayHello();
		runFeature1();
	}

	private static void runFeature1()
	{
		System.out.println("This is Feature 1");
	}

	private static void sayHello()
	{
		//correction: Hello World requires a comma: "Hello, World"
		System.out.println("Hello, World");
	}

}

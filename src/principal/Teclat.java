
package principal;



import java.io.*;
import java.util.*;

public class Teclat
{

	static private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static String getString() {

		String temp = new String();

		try
		{
			temp = br.readLine();
		}
		catch (Exception e)
		{
			System.out.println("Error de lectura");
			temp = null;
		}

		return temp;
	}

	public static String getString(String Mensaje) {

		String temp = new String();

		System.out.println(Mensaje);

		try
		{
			temp = br.readLine();
		}
		catch (Exception e)
		{
			System.out.println("Error de lectura.");
			temp = null;
		}

		return temp;
	}

	public static int getInt() {

		String temp = new String();
		int resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Integer.parseInt(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;

	}

		public static int getInt(String Mensaje) {

		String temp = new String();
		int resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Integer.parseInt(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrcte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;

	}

	public static byte getByte() {

		String temp = new String();
		byte resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Byte.parseByte(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;

	}

		public static byte getByte(String Mensaje) {

		String temp = new String();
		byte resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Byte.parseByte(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

		public static short getShort() {

		String temp = new String();
		short resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Short.parseShort(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

	public static short getShort(String Mensaje) {

		String temp = new String();
		short resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Short.parseShort(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

	public static long getLong() {

		String temp = new String();
		long resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Long.parseLong(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}


	public static long getLong(String Mensaje) {

		String temp = new String();
		long resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Long.parseLong(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

	public static float getFloat() {

		String temp = new String();
		float resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Float.parseFloat(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

	public static float getFloat(String Mensaje) {

		String temp = new String();
		float resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Float.parseFloat(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}


	public static double getDouble() {

		String temp = new String();
		double resultado = 0;
		boolean valido = true;

		do {

			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Double.parseDouble(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

	public static double getDouble(String Mensaje) {

		String temp = new String();
		double resultado = 0;
		boolean valido = true;

		do {

			System.out.println(Mensaje);
			valido = true;

			try
			{
				temp = br.readLine();
				resultado = Double.parseDouble(temp);
			}
			catch (IOException e)
			{
				System.out.println("Problema de lectura");
				System.out.flush();
				valido = false;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Format incorrecte");
				System.out.flush();
				valido = false;
			}

		} while (!valido);

		return resultado;
	}

        
        
}
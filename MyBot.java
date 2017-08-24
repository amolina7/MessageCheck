import java.io.*;
import org.jibble.pircbot.*;

public class MyBot extends PircBot {
	public MyBot(){
		//Name of your bot
		this.setName("KeyBot_24");
	}
	
	//Overrides a method from PircBot's abstract class
	public void onMessage(String channel, String sender,
							String login, String hostname,
							String message){
		String filename = "Checking.txt";
		String str = "";
		try{
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			while((str = br.readLine()) != null){
				if(message.equalsIgnoreCase(br.readLine())){
					sendMessage(channel, "Please refrain from using such terms.");
				}
			}
			br.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		catch(IOException ex){
			System.out.println("Error reading file");
		}
	}
}

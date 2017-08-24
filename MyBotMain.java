
public class MyBotMain {

	public static void main(String[] args) throws Exception {
		String channel = "#keybot_24";
		//authorization from Twitch will be posted in quotation
		String auth = "";
		//Starts bot
		MyBot bot = new MyBot();
		
		//Enable debugging output
		bot.setVerbose(true);
		
		//Connect to the IRC server
		bot.connect("irc.twitch.tv", 6667, auth);
		
		//Join the #pircbot channel
		bot.joinChannel(channel);
	}
}

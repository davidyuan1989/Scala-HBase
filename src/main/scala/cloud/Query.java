package cloud;

public class Query {
  public static String heartbeat() {
	//TODO:current date
	String date = "2013-11-10 15:16:17";
	return "RuCh, AWS_ACCOUNT_ID" + "\n" + date;
  }
  
  //TODO: implement HBase search
  public static String search_tweets_by_time(String time) {
    return time;
  }
  
  //TODO: implement HBase search
  public static String find_tweets_by_range(String userid_min, String userid_max) {
    return "userid_min: " + userid_min + "\n" + "userid_max: " + userid_max; 
  }
  
  //TODO: implement HBase search
  public static String find_retweets_by_userid(String userid) {
    return "userid: " + userid;
  }
}

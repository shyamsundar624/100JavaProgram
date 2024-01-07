import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfo {
public static void main(String[] args) throws MalformedURLException {
URL url = new URL("https://www.google.co.in/");

System.out.println("Protocol "+url.getProtocol());
System.out.println("Host Name "+url.getHost());
System.out.println("Port Number "+url.getPort());


}
}

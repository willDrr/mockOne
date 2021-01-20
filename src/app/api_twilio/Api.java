package app.api_twilio;

import java.net.URI;
import java.util.Arrays;

import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;

public class Api {

// 	Also can make use of env variables	
//	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
//	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

	private Api() {}
	
	public static final void init(String ACCOUNT_SID, String AUTH_TOKEN) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
	}

	public static final String sendMessage(String numberTo, String numberFrom, String contentMessage) {


		final com.twilio.type.PhoneNumber to = new com.twilio.type.PhoneNumber(numberTo);
		final com.twilio.type.PhoneNumber from = new com.twilio.type.PhoneNumber(numberFrom);
		
		final Message message = Message
				.creator(to, from, contentMessage)
				.create();

		return message.getStatus().toString();

	}
	
	public static final String makeCall(String fromNumber, String toNumber) {

		final com.twilio.type.PhoneNumber to = new com.twilio.type.PhoneNumber(toNumber);
		final com.twilio.type.PhoneNumber from = new com.twilio.type.PhoneNumber(fromNumber);
		final URI uriUrl = URI.create("http://demo.twilio.com/docs/voice.xml");
		final URI uriStatusCallback = URI.create("https://www.myapp.com/events");

		final Call call = Call.creator(to, from, uriUrl)
				.setMethod(HttpMethod.GET)
				.setStatusCallback(uriStatusCallback)
				.setStatusCallbackEvent(Arrays.asList("initiated", "answered"))
				.setStatusCallbackMethod(HttpMethod.POST)
				.create();

		return call.getSid();

	}

}

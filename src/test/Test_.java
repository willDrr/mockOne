package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


import java.util.Date;

import com.cliente.Perfil;

//import static org.mockito.Mockito.*;

public class Test_ {

	public static void main(String[] args) {
		new Test_();
	}


	public Test_() {

		final Perfil perfil = new Perfil("Wilder", "will@gmail.com",new Date(), 'M', "+1 234 567 8901", "Los Angeles", "none@bay.dot");

		final String name = perfil.getName();
		final String email = perfil.getEmail();
		
		
		assertThat(name, is(notNullValue()) );
		assertThat(email, is(notNullValue()) );
		 
		

	}
			
 	
}

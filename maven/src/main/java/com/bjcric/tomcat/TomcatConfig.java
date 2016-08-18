package com.bjcric.tomcat;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
//
import java.io.File;

@Configuration
public class TomcatConfig {
    @Bean
    public EmbeddedServletContainerFactory servletContainer()
    {
    		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//    		tomcat.setUriEncoding("");
    		tomcat.addAdditionalTomcatConnectors(createSslConnector());
    		return tomcat;
    }

	private Connector createSslConnector() {
		// TODO Auto-generated method stub
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
		try {
			
			File trustStore = new File("/ssllkeystore");
			connector.setScheme("https");
			protocol.setSSLEnabled(true);
			connector.setSecure(true);
			connector.setPort(8443);
			protocol.setKeystoreFile(trustStore.getAbsolutePath());
			protocol.setKeystorePass("123456");
			protocol.setKeyAlias("springboot");
			
		}catch (Exception ex)
		{
			throw new IllegalStateException("cant access keystore:");
		}
		
		
		
		
		return connector;
	}


}

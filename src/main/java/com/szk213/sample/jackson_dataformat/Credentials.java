package com.szk213.sample.jackson_dataformat;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Credentials {
	@JacksonXmlProperty(isAttribute = true)
	private String priv;

	@JacksonXmlProperty(isAttribute = true)
	private String type;

	@JacksonXmlProperty(localName = "user")
	private String user;

	@JacksonXmlProperty(localName = "client_token")
	private String clientToken;

	@JacksonXmlProperty(localName = "client_secret")
	private String clientSecret;
}

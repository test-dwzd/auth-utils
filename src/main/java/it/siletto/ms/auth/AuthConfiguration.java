package it.siletto.ms.auth;

import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthConfiguration extends Configuration {

	@JsonProperty
	private String proxyHost = null;

	@JsonProperty
	private int proxyPort = 8080;

	@JsonProperty
	private String privateKeyFile = null;

	@JsonProperty
	private String publicKeyFile = null;

	public String getProxyHost() {
		return proxyHost;
	}

	public int getProxyPort() {
		return proxyPort;
	}

	public String getPrivateKeyFile() {
		return privateKeyFile;
	}

	public String getPublicKeyFile() {
		return publicKeyFile;
	}
}
